package com.example.JavaAssignment.repository;

import com.example.JavaAssignment.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findByIsAvailable(boolean isAvailable);

}
