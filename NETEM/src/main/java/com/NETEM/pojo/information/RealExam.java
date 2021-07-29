package com.NETEM.pojo.information;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 2021年7月13日10:48:03
 *
 * @author Lyon
 */@Data
@AllArgsConstructor
@NoArgsConstructor
public class RealExam {
    /**
     * 主键
     */
    int ID;
    /**
     * 真题标题
     */
    String title;
    /**
     * 真题年份
     */
    String yearTime;
    /**
     * 真题的添加时间
     */
    Date addTime;
    /**
     * 真题的下载路径
     */
    String url;
}
