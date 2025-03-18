package Book.Store.controller;

import Book.Store.Entity.BookStore;
import Book.Store.service.bookstoreservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bookstore")
public class bookrepocontroller {

    private final bookstoreservice bookservice;
    public bookrepocontroller(bookstoreservice bookservice) {
        this.bookservice = bookservice;
    }

    @GetMapping("/getall")
    public List<BookStore> getall() {
        return bookservice.getallbooks();
    }

    @GetMapping("/byprice/{price}")
    public List<BookStore> getbyprice(@PathVariable("price") int price) {
        return bookservice.findbookbyprice(price);
    }

    @GetMapping("/title/{title}")
    public List<BookStore> gettitle(@PathVariable("title") String title) {
        return bookservice.findbytitle(title);
    }

    @PostMapping
    public BookStore addbook(@RequestBody BookStore book) {
        return bookservice.addnewbook(book);
    }

    @PutMapping("/delete/{id}")
    public String deletebook(@PathVariable("id") int id) {
        return bookservice.deleteifoutofstock(id);
    }

    @PutMapping("/update/{bookid}/{newprice}")
    public int updateprice(@PathVariable("newprice") int newprice, @PathVariable("bookid") int bookid) {
        return bookservice.updateprice(bookid, newprice);
    }

}