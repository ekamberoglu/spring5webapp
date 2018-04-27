package guru.springframework.spring5webapp.mode.repositories;

import guru.springframework.spring5webapp.mode.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
