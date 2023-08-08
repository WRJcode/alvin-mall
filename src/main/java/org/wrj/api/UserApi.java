package org.wrj.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wrj.common.ResponseBody;
import org.wrj.entity.vo.UserInfo;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserApi {

    @GetMapping("/login")
    public ResponseBody<UserInfo> login(){
      //System.out.println("login!");
        return new ResponseBody<>(200, "successfully.", new UserInfo("Alvin",18));
    }
}
