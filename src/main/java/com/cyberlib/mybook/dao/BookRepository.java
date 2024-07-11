package com.cyberlib.mybook.dao;

import com.cyberlib.mybook.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
