package com.NETEM.pojo.lead;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 2021年7月12日09:13:39
 *
 * @author Lyon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lead {
    /**
     * 标签id，主键
     */
    int ID;
    /**
     * 资源类型
     */
    int type;
    /**
     * 发布者id
     */
    String userId;
    /**
     * 发布内容
     */
    String content;
    /**
     * 发布的时间
     */
    Date time;
    /**
     * 点赞数
     */
    int likes;
}
