package com.fantom.jpa.jpaService.service;

import com.fantom.jpa.Entity.Enemy;
import com.fantom.jpa.jpaRepository.EnemyRepositroy;
import com.fantom.jpa.jpaService.EnemyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author fantomboss
 * @date 2019/1/27-21:50
 */
@Service
public class EnemyService implements EnemyServiceImpl {

  @Autowired
  private EnemyRepositroy enemyRepositroy;

  @Override
  public Page<Enemy> PageEnemy(int start, int count) {
    Pageable pageable = PageRequest.of(start, count);
    return enemyRepositroy.findAll(pageable);
  }
}
