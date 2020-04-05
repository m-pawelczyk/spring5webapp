package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/* m-pawelczyk (GitHub) / m_pawelczyk (Twitter)
 *  created AuthorRepository on 05.04.2020
 *  inside the package - guru.springframework.spring5webapp.repository in project spring5webapp
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
