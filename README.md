The Book Library Management System is a web-based application developed using Spring Boot. It provides functionalities to manage books, authors, and rental records in a library. Users can perform operations such as adding books, renting books, returning books, and more.

Setup Instructions
To set up and run the application locally, follow these steps:

Clone the Repository:
bash
Copy code
git clone https://github.com/your-username/book-library-management.git
Navigate to the Project Directory:
bash
Copy code
cd book-library-management
Build the Project:
bash
Copy code
mvn clean package
Database Configuration:
The application uses an embedded H2 database by default. You can change the database configuration in the application.properties file if needed.
Running Tests:
bash
Copy code
mvn test
This command runs all the unit tests in the project.
Running the Application
After building the project, you can run the application using the following command:

bash
Copy code
java -jar target/book-library-management-1.0.0.jar
The application will start, and you can access it at http://localhost:8080.

Endpoints and Sample Requests
The following endpoints are available in the application:

Get All Books
bash
Copy code
GET /api/books
Returns a list of all books in the library.
Get Book by ID
bash
Copy code
GET /api/books/{id}
Returns the details of a specific book identified by its ID.
Add New Book
bash
Copy code
POST /api/books
Adds a new book to the library. Requires a JSON payload with book details.
Rent Book
bash
Copy code
POST /api/rentals
Rents a book from the library. Requires a JSON payload with rental details.
Return Book
bash
Copy code
PUT /api/rentals/{id}/return
Returns a rented book to the library. Requires the rental ID as a path variable.
For detailed request and response formats, refer to the API documentation or Swagger UI.
