package org.wrj.domain.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class UserInfoVo {
    private int id;

    private String userName;

    private int age;
}
