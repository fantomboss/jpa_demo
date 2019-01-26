package com.fantom.jpa.jpaService.service;

import com.fantom.jpa.Entity.Lover;
import com.fantom.jpa.jpaRepository.LoverRepository;
import com.fantom.jpa.jpaService.LoverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * @author fantomboss
 * @date 2019/1/25-20:10
 */
@Service
public class LoverService implements LoverServiceImpl {

  @Autowired
  private LoverRepository loverRepository;

  @Override
  public Page<Lover> pageAllLoverSortByAge(int start, int count) {
    Sort sort = new Sort(Sort.Direction.DESC,"age");
    Pageable pageable = PageRequest.of(start,count,sort);
    return loverRepository.findAll(pageable);
  }
}
