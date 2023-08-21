package org.wrj.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.wrj.common.domain.ResponseBody;
import org.wrj.demo.domain.vo.UserInfoVo;
import org.wrj.entity.UmsUser;
import org.wrj.demo.service.UmsUserService;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Alvin
 * @since 2023-08-08 04:05:28
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
@Api(tags = "DemoController", description = "品牌管理示例接口")
@Slf4j
public class UmsUserController {

    @Autowired
    private UmsUserService umsUserService;

    @GetMapping("/{id}")
    @ApiOperation(value = "获取全部品牌列表")
    public ResponseBody<UserInfoVo> login(@PathVariable("id")int id){
        log.info("login .....");
        UmsUser user = umsUserService.getById(id);
        System.out.println(user);
        UserInfoVo userInfoVo = new UserInfoVo().setUserName(user.getUsername())
                .setAge(user.getAge());
        return new ResponseBody<>(200,"Successfully.",userInfoVo);
    }

}
