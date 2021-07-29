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
public class User {
    /**
     * 用户id，主键
     */
    private int studentID;
    /**
     * 用户学号
     */
    private String studentCode1;
    /**
     * 用户名
     */
    private String name;
    /**
     * 用户角色
     */
    private int roleId;
}
