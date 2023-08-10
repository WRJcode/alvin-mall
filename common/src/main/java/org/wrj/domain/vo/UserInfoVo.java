package org.wrj.domain.vo;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@ApiModel(value = "用户信息Vo测试", description = "")
public class UserInfoVo {
    private int id;

    private String userName;

    private int age;
}
