package com.fantom.jpa.jpaService.service;

import com.fantom.jpa.Entity.Book;
import com.fantom.jpa.jpaRepository.BookRepository;
import com.fantom.jpa.jpaService.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;

/**
 * @author fantomboss
 * @date 2019/1/25-20:10
 */
@Service("BookServiceImpl")
public class BookService implements BookServiceImpl {

  @Autowired
  private BookRepository bookRepository;

  @Override
  public Page<Book> pageAllBookSortByName(int start, int count) {
    //Sort.Direction.DESC---降序      Sort.Direction.ASC---升序     ，后面是要排序的字段名,属性名
    Sort sort = new Sort(Sort.Direction.ASC,"name");
    Pageable pageable = PageRequest.of(start,count,sort);
    return bookRepository.findAll(pageable);
  }
}
