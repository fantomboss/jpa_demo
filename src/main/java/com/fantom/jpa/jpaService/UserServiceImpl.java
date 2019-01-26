package com.fantom.jpa.jpaService;

import com.fantom.jpa.Entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author fantomboss
 * @date 2019/1/25-20:09
 */
public interface UserServiceImpl {

  //获取所有的用户数据--分页形式
  public Page<User> pageAllUser(int start,int count);
}
