package com.fantom.jpa.Web;

import com.fantom.jpa.Entity.Lover;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fantomboss
 * @date 2019/1/24-11:14
 */
@RestController
@RequestMapping("/lover")
public class LoverController {


  @RequestMapping("/all")
  public List<Lover> getAllLover(){
    return null;
  }
}
