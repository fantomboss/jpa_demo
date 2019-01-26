package com.fantom.jpa.jpaRepository;

import com.fantom.jpa.Entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author fantomboss
 * @date 2019/1/25-19:45
 */
public interface BookRepository extends JpaRepository<Book,Integer> {
  Page<Book> findAll(Pageable page);
}
