package nama.springboot.usingprofiledemo.repository;

import nama.springboot.usingprofiledemo.exceptions.BookNotFoundException;
import nama.springboot.usingprofiledemo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {

    private List<Book> bookarr;

    public BookRepository()
    {
        this.bookarr = new ArrayList<>();
        this.bookarr.add(new Book(1L,"Java",2000));
    }

    public Book findById(Long id) throws BookNotFoundException
    {
        Optional<Book> bk = this.bookarr.stream().filter(b->b.getBookId()==id).findFirst();
        if(bk.isPresent())
            return bk.get();
        else
            throw new BookNotFoundException(id);
    }
}
