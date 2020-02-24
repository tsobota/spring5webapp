package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(PublisherRepository publisherRepository, BookRepository bookRepository, AuthorRepository authorRepository) {
        this.publisherRepository = publisherRepository;
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher("Merlin", "Chicago", "Ohaio", "00-000");
        publisherRepository.save(publisher);

        System.out.println("Number of publishers: " + publisherRepository.count());

    }
}
