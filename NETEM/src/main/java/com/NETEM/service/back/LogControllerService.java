package com.NETEM.service.back;

import com.NETEM.pojo.Log;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 2021年7月18日20:41:47
 *
 * @author Lyon
 */
public interface LogControllerService {
    /**
     * 获取所有日志
     *
     * @param page
     * @return
     */
    List<Log> getLogs(int page);

    /**
     * 搜索符合条件的日志
     *
     * @param ID
     * @param userName
     * @param studentCode1
     * @param where
     * @param describe
     * @param addTime
     * @param consumeTime
     * @return
     */
    List<Log> searchLogs(String ID, String userName, String studentCode1, String where, String describe, String addTime, String consumeTime);

    /**
     * 插入日志
     *
     * @param addTime
     * @param consumeTime
     * @param where
     * @return
     */
    int insertLog(@Param("addTime") String addTime, @Param("consumeTime") String consumeTime, @Param("where") String where);

}
