package guru.springframework.spring5webapp.repository;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/* m-pawelczyk (GitHub) / m_pawelczyk (Twitter)
 *  created AuthorRepository on 05.04.2020
 *  inside the package - guru.springframework.spring5webapp.repository in project spring5webapp
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
