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
public class Teacher {
    /**
     * 主键
     */
    int ID;
    /**
     * 老师名
     */
    String name;
    /**
     * 老师短介绍
     */
    String shortIntroduce;
    /**
     * 老师详细介绍
     */
    String introduce;
    /**
     * 老师课程介绍
     */
    String courseIntroduce;
    /**
     * 优秀老师的添加时间
     */
    Date addTime;
    /**
     * 老师的图片
     */
    String image;
}
