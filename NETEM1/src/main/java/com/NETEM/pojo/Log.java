package com.NETEM.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 2021年7月8日16:02:35
 *
 * @author Lyon
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Log {
    /**
     * 日志id，主键
     */
    private int ID;
    /**
     * 使用者姓名
     */
    private String userName;
    /**
     * 使用者学号
     */
    private String studentCode1;
    /**
     * 日志添加使用时间
     */
    private String addTime;
    /**
     * 日志退出时间
     */
    private String exitTime;
    /**
     * 在哪里产生的日志
     */
    private String where;
    /**
     * 日志描述
     */
    private String describe;
}
