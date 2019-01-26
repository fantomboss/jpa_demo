package com.fantom.jpa.Web;

import com.fantom.jpa.Entity.User;
import com.fantom.jpa.jpaService.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author fantomboss
 * @date 2019/1/24-11:13
 */

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserServiceImpl userService;

  @GetMapping("/pageAll")
  public Page<User> pageAll(
          @RequestParam int start,
          @RequestParam int count){
    return userService.pageAllUser(start, count);
  }

}
