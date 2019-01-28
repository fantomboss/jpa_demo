package com.fantom.jpa.jpaService.service;

import com.fantom.jpa.Entity.User;
import com.fantom.jpa.jpaRepository.UserRepository;
import com.fantom.jpa.jpaService.UserServiceImpl;
import com.fantom.jpa.jpaService.SelectPartField.UserNameAndBookAndLoverImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author fantomboss
 * @date 2019/1/25-20:10
 */
@Service
public class UserService implements UserServiceImpl {

  @Autowired
  private UserRepository userRepository;

  @Override
  public Page<User> pageAllUser(int start,int count) {
    Pageable pageable = PageRequest.of(start,count);
    return userRepository.findAll(pageable);
  }

  @Override
  public Page<UserNameAndBookAndLoverImpl> getNameBookLover(int id,int start,int count) {
    Pageable pageable = PageRequest.of(start,count);
    return userRepository.findAllByUserId(id,pageable);
  }
}
