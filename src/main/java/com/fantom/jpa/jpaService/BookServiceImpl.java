package com.fantom.jpa.jpaService;

import com.fantom.jpa.Entity.Book;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author fantomboss
 * @date 2019/1/25-20:08
 */
public interface BookServiceImpl {

  Page<Book> getAllBook(int start,int count);

}
