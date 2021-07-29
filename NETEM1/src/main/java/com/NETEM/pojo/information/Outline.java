package com.NETEM.pojo.information;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 2021年7月13日10:48:03
 *
 * @author Lyon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Outline {
    /**
     * 主键
     */
    int ID;
    /**
     * 大纲标题
     */
    String title;
    /**
     * 大纲内容
     */
    String content;
    /**
     * 大纲年份
     */
    String yearTime;
    /**
     * 大纲的添加时间
     */
    Date addTime;
    /**
     * 大纲的途径
     */
    String resource;
    /**
     * 大纲的图片
     */
    String image;
}
