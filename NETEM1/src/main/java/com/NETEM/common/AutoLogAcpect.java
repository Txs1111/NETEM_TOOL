package com.NETEM.common;

import com.NETEM.service.back.LogControllerService;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.PropertyFilter;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

import static com.NETEM.Tool.Time.TimeMillisToString;
import static com.NETEM.Tool.Time.getString;

/**
 * 2021年7月26日20:51:48
 *
 * @author Lyon
 */
@Aspect
@Component
public class AutoLogAcpect {
    @Autowired
    LogControllerService logControllerService;

    @Pointcut("@annotation(com.NETEM.common.AutoLog)")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint JoinPoint) throws Throwable {

        long beginTime = System.currentTimeMillis();
        //执行方法
        Object result = JoinPoint.proceed();
        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        //保存日志
        saveSysLog(JoinPoint, time, result);
        return result;
    }

    private void saveSysLog(ProceedingJoinPoint joinPoint, long time, Object obj) {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();

        AutoLog syslog = method.getAnnotation(AutoLog.class);
        String content = "未定义";
        if (syslog != null) {
            content = syslog.value();
        }
//        LogControllerService logControllerService = new LogControllerServiceImpl();
        //请求的方法名
        String className = joinPoint.getTarget().getClass().getName();
        String classNameSimple = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = signature.getName();

//        System.out.println("aop调用" + className);
//        System.out.println("aop调用" + classNameSimple);
//        System.out.println("aop调用" + methodName);
//        System.out.println("aop调用" + content);
        System.out.println("aop调用:" + content + "耗时" + getString() + "||||" + time + "|||" + TimeMillisToString(time));

        logControllerService.insertLog(getString(), time + "", content);
        //获取request
        HttpServletRequest request = SpringContextUtils.getHttpServletRequest();


        //log.setRequestType(requestType);

        //耗时


        //EmployeeInfo user =(EmployeeInfo) request.getSession().getAttribute("USER_TOKEN");

    }

    /**
     * @param request:   request
     * @param joinPoint: joinPoint
     * @Description: 获取请求参数
     * @author: scott
     * @date: 2020/4/16 0:10
     * @Return: java.lang.String
     */
    private String getReqestParams(HttpServletRequest request, JoinPoint joinPoint) {
        String httpMethod = request.getMethod();
        String params = "";
        if ("POST".equals(httpMethod) || "PUT".equals(httpMethod) || "PATCH".equals(httpMethod)) {
            Object[] paramsArray = joinPoint.getArgs();
            // java.lang.IllegalStateException: It is illegal to call this method if the current request is not in asynchronous mode (i.e. isAsyncStarted() returns false)
            //  https://my.oschina.net/mengzhang6/blog/2395893
            Object[] arguments = new Object[paramsArray.length];
            for (int i = 0; i < paramsArray.length; i++) {
                if (paramsArray[i] instanceof BindingResult || paramsArray[i] instanceof ServletRequest || paramsArray[i] instanceof ServletResponse || paramsArray[i] instanceof MultipartFile) {
                    //ServletRequest不能序列化，从入参里排除，否则报异常：java.lang.IllegalStateException: It is illegal to call this method if the current request is not in asynchronous mode (i.e. isAsyncStarted() returns false)
                    //ServletResponse不能序列化 从入参里排除，否则报异常：java.lang.IllegalStateException: getOutputStream() has already been called for this response
                    continue;
                }
                arguments[i] = paramsArray[i];
            }
            //update-begin-author:taoyan date:20200724 for:日志数据太长的直接过滤掉
            PropertyFilter profilter = new PropertyFilter() {
                @Override
                public boolean apply(Object o, String name, Object value) {
                    if (value != null && value.toString().length() > 500) {
                        return false;
                    }
                    return true;
                }
            };
            params = JSONObject.toJSONString(arguments, profilter);
            //update-end-author:taoyan date:20200724 for:日志数据太长的直接过滤掉
        } else {
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            Method method = signature.getMethod();
            // 请求的方法参数值
            Object[] args = joinPoint.getArgs();
            // 请求的方法参数名称
            LocalVariableTableParameterNameDiscoverer u = new LocalVariableTableParameterNameDiscoverer();
            String[] paramNames = u.getParameterNames(method);
            if (args != null && paramNames != null) {
                for (int i = 0; i < args.length; i++) {
                    params += "  " + paramNames[i] + ": " + args[i];
                }
            }
        }
        return params;
    }

}
