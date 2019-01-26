package com.fantom.jpa.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * @author fantomboss
 * @date 2019/1/24-10:39
 */
@Data
@Entity
public class User {

  @Id
  @GeneratedValue
  private int userId;

  private String name;
  private String passWorld;
  private String sex;
  private String lover;
  private String country;

  @ManyToMany
  @JoinTable(name = "user_book",joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "book_id"))
  private Set<Book> books;
}
