package com.NETEM.pojo.community;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    int ID;

    int postId;

    int fId;

    String userId;

    String content;

    Date addTime;
}
