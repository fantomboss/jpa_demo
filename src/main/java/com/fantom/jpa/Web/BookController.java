package com.fantom.jpa.Web;

import com.fantom.jpa.Entity.Book;
import com.fantom.jpa.jpaService.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author fantombosss
 * @date 2019/1/24-11:13
 */
@RestController
@RequestMapping("/book")
public class BookController {

  @Autowired
  private BookServiceImpl bookService;

  @PostMapping("/pageAllSortByName")
  public Page<Book> pageAllSortByName(
          @RequestParam int start,
          @RequestParam int count){
    return bookService.pageAllBookSortByName(start,count);
  }
}