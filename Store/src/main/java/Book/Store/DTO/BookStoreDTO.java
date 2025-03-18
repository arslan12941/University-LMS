package Book.Store.DTO;

import lombok.Data;

@Data
public class BookStoreDTO {

    private String bookname;

    private String author;
    private int price;
    private int stock;
}