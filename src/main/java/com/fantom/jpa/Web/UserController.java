package com.fantom.jpa.Web;

import com.fantom.jpa.Entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fantomboss
 * @date 2019/1/24-11:13
 */

@RestController
@RequestMapping("/user")
public class UserController {

  @RequestMapping("/all")
  public List<User> getAllUser(){
    return null;
  }
}
