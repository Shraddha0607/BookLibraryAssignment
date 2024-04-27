# Book Library Management System
The Book Library Management System is a web-based application developed using Spring Boot. It provides functionalities to manage books, authors, and rental records in a library. Users can perform operations such as adding books, renting books, returning books, and more.
## Setup Instructions
To run the application locally, follow these steps:
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Shraddha0607/BookLibraryAssignment.git
   ```

2. **Navigate to the Project Directory:**
   ```bash
   cd book-library-management
   ```

3. **Build the Project:**
   ```bash
   mvn clean package
   ```

4. **Run the Application:**
   ```bash
   java -jar target/book-library-management.jar
   ```

## How to Run the Application
Once the application is running, you can access the endpoints using a tool like Postman. 
You can also check from swagger by .hitting the link: http://localhost:8080/swagger-ui/index.html
## Sample Requests for Author Controller

1) Add Author:
Description: Adds a new author to the system.
Method: POST
Endpoint: /author/addAuthor
Request Body: JSON object representing the author details.
Response: Success message or error message.

2) Get All Authors:
Description: Retrieves a list of all authors from the system.
Method: GET
Endpoint: /author/getAllAuthor
Response: List of author objects.

3) Get Author by ID:
Description: Retrieves the details of a specific author based on the provided ID.
Method: GET
Endpoint: /author/{id}
Path Variable: id - Integer representing the author ID.
Response: Author object.

4) Update Author:
Description: Updates the details of an existing author.
Method: PUT
Endpoint: /author/updateAuthor/{id}
Path Variable: id - Integer representing the author ID.
Request Body: JSON object representing the updated author details.
Response: Updated author object.

5) Delete Author:
Description: Deletes an author from the system based on the provided ID.
Method: DELETE
Endpoint: /author/{id}
Path Variable: id - Integer representing the author ID.
Response: Success message or error message.ion

## Sample Requests for Book Controller

1) Add Book:
Description: Adds a new book to the system.
Method: POST
Endpoint: /book/addBook
Request Body: JSON object representing the book details.
Response: Success message or error message.

2) Build Connection between Book and Author:
Description: Associates a book with an author in the system.
Method: PUT
Endpoint: /book/buildConnection
Request Parameters: bookId - Integer representing the book ID, authorId - Integer representing the author ID.
Response: Success message or error message.

3) Get All Books:
Description: Retrieves a list of all books from the system.
Method: GET
Endpoint: /book/getAllBooks
Response: List of book objects.

4) Get Book by ID:
Description: Retrieves the details of a specific book based on the provided ID.
Method: GET
Endpoint: /book/{id}
Path Variable: id - Integer representing the book ID.
Response: Book object.

5) Update Book:
Description: Updates the details of an existing book.
Method: PUT
Endpoint: /book/updateBook/{id}
Path Variable: id - Integer representing the book ID.
Request Body: JSON object representing the updated book details.
Response: Updated book object.
6) Delete Book:
Description: Deletes a book from the system based on the provided ID.
Method: DELETE
Endpoint: /book/{id}
Path Variable: id - Integer representing the book ID.
Response: Success message or error message.

7) Get Available Books:
Description: Retrieves a list of books available for rent.
Method: GET
Endpoint: /book/available
Response: List of available book objects.

9) Get Rented Books:
Description: Retrieves a list of books currently rented.
Method: GET
Endpoint: /book/rented
Response: List of rented book objects.

## Sample Requests for Rental Controller

1) Rent Book:
Description: Rents a book from the library.
Method: POST
Endpoint: /rental/rentBook
Request Body: JSON object representing the rental details.
Response: Success message or error message. Returns HTTP status code 201 (Created).

3) Return Book:
Description: Returns a rented book to the library.
Method: PUT
Endpoint: /rental/returnBook/{id}
Path Variable: id - Integer representing the rental ID.
Response: Success message or error message. Returns HTTP status code 202 (Accepted).

### Design Decisions

- **Database Schema**: We choose to use a relational database with MySQL connectivity with tables for books, authors, and rentals to organize and manage the data efficiently.

- **RESTful Architecture**: The application follows RESTful principles to provide a standardized and predictable interface for clients to interact with.

- ** Decision** : Taken the library real life scenario, thought what is required when we rent a book and return book. and taken decision based on that.
### Assumptions

- **ISBN Format**: We assume that ISBNs provided for books follow the standard format.

- **Rental Duration**: We assume a default rental duration of 14 days for each book rental.
