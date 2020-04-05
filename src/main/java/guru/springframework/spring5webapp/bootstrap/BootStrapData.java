package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repository.AuthorRepository;
import guru.springframework.spring5webapp.repository.BookRepository;
import guru.springframework.spring5webapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/* m-pawelczyk (GitHub) / m_pawelczyk (Twitter)
 *  created BootStrapData on 05.04.2020
 *  inside the package - guru.springframework.spring5webapp.bootstrap in project spring5webapp
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author sabela = new Author("Bartek", "Sabela");
        Book mmw = new Book("Może morze wróci", "111111");
        sabela.getBooks().add(mmw);
        mmw.getAuthors().add(sabela);

        authorRepository.save(sabela);
        bookRepository.save(mmw);

        Author tokarczuk = new Author("Olga", "Tokarczuk");
        Book bieguni = new Book("Bieguni", "222222");
        tokarczuk.getBooks().add(mmw);
        bieguni.getAuthors().add(sabela);

        authorRepository.save(tokarczuk);
        bookRepository.save(bieguni);

        Publisher czarne = new Publisher("Wydawnictwo Czarne", "Nowy Świat", "Warszawa", "mazowieckie", "20-200");
        publisherRepository.save(czarne);


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Authors: " + authorRepository.count());
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Publishers: " + publisherRepository.count());
    }
}
