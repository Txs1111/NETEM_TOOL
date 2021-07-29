package com.NETEM.pojo.mark;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 2021年7月15日12:02:51
 *
 * @author Lyon
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mark {
    /**
     * 院校信息ID
     */
    int ID;
    /**
     * 院校名
     */
    String name;
    /**
     * 专业名
     */
    String major;
    /**
     * 科目名
     */
    String majorSubject;
    /**
     * 科目分数线
     */
    int markLine;
}
