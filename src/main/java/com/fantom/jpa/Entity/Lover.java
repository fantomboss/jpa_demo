package com.fantom.jpa.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

/**
 * @author fantomboss
 * @date 2019/1/24-10:42
 */
@Data
@Entity
public class Lover {

  @Id
  @GeneratedValue
  private int loverId;

  private String name;
  private String sex;
  private String age;
}
