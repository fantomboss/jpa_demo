package com.fantom.jpa.jpaService;

import com.fantom.jpa.Entity.User;
import com.fantom.jpa.jpaService.SelectPartField.UserNameAndBookAndLoverImpl;
import org.springframework.data.domain.Page;

/**
 * @author fantomboss
 * @date 2019/1/25-20:09
 */
public interface UserServiceImpl {

  //获取所有的用户数据--分页形式
  public Page<User> pageAllUser(int start,int count);

  public Page<UserNameAndBookAndLoverImpl> getNameBookLover(int id,int start,int count);
}
