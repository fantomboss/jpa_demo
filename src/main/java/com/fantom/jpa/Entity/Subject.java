package com.fantom.jpa.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author fantomboss
 * @date 2019/1/26-8:35
 */
@Entity
@Data
public class Subject {

  @Id
  @GeneratedValue
  private int subjectId;

  private int score;
  private String name;
  private String teacher;
}
