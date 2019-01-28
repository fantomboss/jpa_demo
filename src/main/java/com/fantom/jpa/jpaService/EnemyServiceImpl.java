package com.fantom.jpa.jpaService;

import com.fantom.jpa.Entity.Enemy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fantomboss
 * @date 2019/1/27-21:49
 */
public interface EnemyServiceImpl{
  public Page<Enemy> PageEnemy(int start,int count);
}
