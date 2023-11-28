package ie.atu.week_3_requestbody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class LibraryController {
    private Libraryservice libraryService;
    private Book book;

    @Autowired
    public void constructorInjectedController(Libraryservice libraryService) {
        this.libraryService = libraryService;
    }

    @PostMapping("/addBook")
    @ResponseStatus(HttpStatus.CREATED)
    public void addBookReceiver(@RequestBody Book book) {
        libraryService.addBook(book);
    }

    @PostMapping("/getBooks")
    @ResponseStatus(HttpStatus.CREATED)
    public ArrayList<Book> getBooksReceiver() {
        return libraryService.getBooks();
    }
}
