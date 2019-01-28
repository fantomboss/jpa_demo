package com.fantom.jpa.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author fantomboss
 * @date 2019/1/27-21:46
 */
@Entity
@Data
public class Enemy {
  @Id
  @GeneratedValue
  private int id;

  private String name;
  private String sex;
  private String age;
  private String power;
  private String why;
}
