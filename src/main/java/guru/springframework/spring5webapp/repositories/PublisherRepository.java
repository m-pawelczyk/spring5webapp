package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/* m-pawelczyk (GitHub) / m_pawelczyk (Twitter)
 *  created PublisherRepository on 05.04.2020
 *  inside the package - guru.springframework.spring5webapp.repository in project spring5webapp
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
