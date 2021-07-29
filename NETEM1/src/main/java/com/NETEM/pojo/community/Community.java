package com.NETEM.pojo.community;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 2021年7月17日16:09:25
 *
 * @author Lyon
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Community {
    /**
     * 社区资源ID
     */
    int ID;
    /**
     * 发布者学号
     */
    String userId;
    /**
     * 发布资源类型
     */
    int type;
    /**
     * 发布资源标题
     */
    String title;
    /**
     * 发布资源内容
     */
    String content;
    /**
     * 发布资源点赞数
     */
    int likes;
    /**
     * 发布资源的添加时间
     */
    String addTime;
    /**
     * 发布资源的图片
     */
    String image;
    /**
     * 发布资源的回复数
     */
    int responseNum;
}
