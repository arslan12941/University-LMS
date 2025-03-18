package Book.Store.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="bookstore")
@Data
public class BookStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String bookname;
    private String author;
    private int price;
    private int stock;
}