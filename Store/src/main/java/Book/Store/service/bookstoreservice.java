package Book.Store.service;

import Book.Store.Entity.BookStore;
import Book.Store.Repository.BookRepo;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class bookstoreservice {

    private final BookRepo booksrepo;

    public bookstoreservice(BookRepo booksrepo) {
        this.booksrepo = booksrepo;
    }

    public BookStore addnewbook(BookStore book) {
        return booksrepo.save(book);
    }

    public List<BookStore> findbookbyprice(int price){
        return booksrepo.findbookaboveprice(price);
    }

    public List<BookStore> findbytitle(String title){
        return booksrepo.findbookfromtitle(title);
    }

    public List<BookStore> getallbooks(){
        return booksrepo.findAll();
    }

    public String deleteifoutofstock(int bookID){
        int count = booksrepo.deletebookoutofstock(bookID);
        if(count == 0){
            return "Book not found";
        }
        else{
            return "Book Deleted Successfully";
        }
    }

    public int updateprice(int bookID, int newprice){
        return booksrepo.updateprice(bookID, newprice);
    }

}