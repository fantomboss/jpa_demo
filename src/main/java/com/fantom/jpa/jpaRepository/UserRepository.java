package com.fantom.jpa.jpaRepository;

import com.fantom.jpa.Entity.User;
import com.fantom.jpa.jpaService.SelectPartField.UserNameAndBookAndLoverImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fantomboss
 * @date 2019/1/25-19:45
 */
public interface UserRepository extends JpaRepository<User,Integer> {

  Page<User> findAll(Pageable pageable);

  User findTopByUserId(int id);

  //distinct 唯一结果集
  Page<UserNameAndBookAndLoverImpl> findAllByUserId(int id,Pageable pageable);

}
