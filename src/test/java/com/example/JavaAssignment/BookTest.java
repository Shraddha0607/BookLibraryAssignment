package com.example.JavaAssignment;

import com.example.JavaAssignment.controller.BookController;
import com.example.JavaAssignment.model.Author;
import com.example.JavaAssignment.model.Book;
import com.example.JavaAssignment.repository.BookRepository;
import com.example.JavaAssignment.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class BookTest {
    @Autowired
    private BookController bookController;
    @Mock
    private BookRepository bookRepository;
    @InjectMocks
    private BookService bookService;
    @Test
    public void TestMappingToFetchBookById(){
//        // give input
//        Author author1 = new Author(); // Assuming Author class has a default constructor
//        Book b1 = new Book(1, "Panchtantra", author1, "1784350680", 1, true);
//        Book b2 = new Book(2, "Harry Potter", author1, "1784350680", 2, true);
////
////        bookController.addBook(b1);
////        bookController.addBook(b2);
//
//        List<Book> allBook = new ArrayList<>();
//        allBook.add(b1);
//        allBook.add(b2);
//
//        Mockito.when(bookRepository.findById(1)).thenReturn(b1);
////        Book actualResponse  bookController.getBookById(
////        Book actualResponse = bookController.getBookById(1).getBody();
//        Assertions.assertEquals(b1,actualResponse);


        Author author1 = new Author(); // Assuming Author class has a default constructor
        Book expectedBook = new Book(1, "Panchtantra", author1, "1784350680", 1, true);

        // Mock repository behavior
        Mockito.when(bookRepository.findById(1)).thenReturn(Optional.of(expectedBook));

        // Call the service method
        Book actualResponse = bookService.getBookById(1);

        // Verify that the service method returned the expected book
        Assertions.assertEquals(expectedBook.getId(), actualResponse.getId());
        Assertions.assertEquals(expectedBook.getTitle(), actualResponse.getTitle());
        // You can add more assertions for other fields if needed
    }



}
