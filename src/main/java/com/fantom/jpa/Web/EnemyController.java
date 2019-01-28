package com.fantom.jpa.Web;

import com.fantom.jpa.Entity.Enemy;
import com.fantom.jpa.jpaService.EnemyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fantomboss
 * @date 2019/1/27-21:55
 */
@RestController
@RequestMapping("/enemy")
public class EnemyController {

  @Autowired
  private EnemyServiceImpl enemyService;

  public Page<Enemy> pageEnemy(
          @RequestParam int start,
          @RequestParam int count){
    return enemyService.PageEnemy(start, count);
  }

}
