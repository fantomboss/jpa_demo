package com.fantom.jpa.jpaRepository;

import com.fantom.jpa.Entity.Lover;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author fantomboss
 * @date 2019/1/25-19:45
 */
public interface LoverRepository extends JpaRepository<Lover,Integer> {
  Page<Lover> findAll(Pageable pageable);
}
