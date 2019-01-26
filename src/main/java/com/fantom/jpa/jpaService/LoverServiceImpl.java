package com.fantom.jpa.jpaService;

import com.fantom.jpa.Entity.Lover;
import org.springframework.data.domain.Page;

/**
 * @author fantomboss
 * @date 2019/1/25-20:09
 */
public interface LoverServiceImpl {

  public Page<Lover> pageAllLoverSortByAge(int start,int count);
}
