package com.NETEM.pojo.lead;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 2021年7月12日09:09:57
 *
 * @author Lyon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Term {
    /**
     * 主键
     */
    private int ID;
    /**
     * 标签名
     */
    private String name;
    /**
     * 标签解释
     */
    private String content;
    /**
     * 添加时间
     */
    private String addTime;
}
