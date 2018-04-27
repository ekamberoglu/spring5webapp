package guru.springframework.spring5webapp.mode.repositories;

import guru.springframework.spring5webapp.mode.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
