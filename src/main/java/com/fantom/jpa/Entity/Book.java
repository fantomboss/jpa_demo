package com.fantom.jpa.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author fantomboss
 * @date 2019/1/24-10:42
 */
@Data
@Entity
public class Book {

  @Id
  @GeneratedValue
  private int bookId;

  private String name;
  private String money;
  private String language;
  private String number;

}
