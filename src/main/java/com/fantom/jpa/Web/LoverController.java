package com.fantom.jpa.Web;

import com.fantom.jpa.Entity.Lover;
import com.fantom.jpa.jpaRepository.LoverRepository;
import com.fantom.jpa.jpaService.LoverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fantomboss
 * @date 2019/1/24-11:14
 */
@RestController
@RequestMapping("/lover")
public class LoverController {

  @Autowired
  private LoverServiceImpl loverService;

  @RequestMapping("/pageAllLoverSortByAge")
  public Page<Lover> pageAllLoverSortByAge(
          @RequestParam int start,
          @RequestParam int count){
    return loverService.pageAllLoverSortByAge(start, count);
  }
}
