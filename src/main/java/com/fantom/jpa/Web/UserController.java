package com.fantom.jpa.Web;

import com.fantom.jpa.Entity.User;
import com.fantom.jpa.jpaRepository.UserRepository;
import com.fantom.jpa.jpaService.UserServiceImpl;
import com.fantom.jpa.jpaService.SelectPartField.UserNameAndBookAndLoverImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.regex.PatternSyntaxException;

/**
 * @author fantomboss
 * @date 2019/1/24-11:13
 */

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserServiceImpl userService;
  @Autowired
  private UserRepository userRepository;

  @GetMapping("/pageAll")
  public Page<User> pageAll(
          @RequestParam int start,
          @RequestParam int count){
    return userService.pageAllUser(start, count);
  }

  @PostMapping("/nameBookLover")
  public Page<UserNameAndBookAndLoverImpl> getNameBookLover(
          @RequestParam int id,
          @RequestParam int start,
          @RequestParam int count){
    return userService.getNameBookLover(id,start,count);
  }

  @RequestMapping("/saveUser")
  public String saveUser(
          @RequestParam String name,
          @RequestParam String passWorld,
          @RequestParam String sexs){
    User u = new User();
    u.setName(name);
    u.setPassWorld(passWorld);
    u.setSex(sexs);
    userRepository.save(u);
    return "ok";
  }

  @RequestMapping("/updateUser")
  public String update(
          @RequestParam int id){
    User u = userRepository.findTopByUserId(id);
    u.setBooks(null);
    userRepository.save(u);
    return "ok";
  }

}
