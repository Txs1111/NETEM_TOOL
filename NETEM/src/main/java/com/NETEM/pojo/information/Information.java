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
public class Information {
    /**
     * 主键
     */
    int ID;
    /**
     * 资源类型，院校排名<p></p>历年分数<p></p>学校报录情况
     */
    int type;
    /**
     * 资源标题
     */
    String title;
    /**
     * 资源内容
     */
    String content;
    /**
     * 资源的添加时间
     */
    Date addTime;
    /**
     * 资源的图片
     */
    String image;
}
