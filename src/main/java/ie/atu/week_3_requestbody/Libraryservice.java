package ie.atu.week_3_requestbody;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;




    @Service
    public class Libraryservice {
        ArrayList<Book> booksInLibrary = new ArrayList<Book>();
        public void addBook(Book book) {
            booksInLibrary.add(book);
        }

        public ArrayList<Book> getBooks() {
            return booksInLibrary;
        }
    }

