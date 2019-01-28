package com.fantom.jpa.jpaService.SelectPartField;

import com.fantom.jpa.Entity.Book;
import com.fantom.jpa.Entity.Lover;

/**
 * @author fantomboss
 * @date 2019/1/27-14:48
 */

//选择其中的书本，名字，爱人三个字段，这里的getXXX中给 "XXX" 对应字段名
public interface UserNameAndBookAndLoverImpl {

  Book getBooks();

  String getName();

  Lover getLover();
}
