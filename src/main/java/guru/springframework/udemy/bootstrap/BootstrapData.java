package guru.springframework.udemy.bootstrap;

import org.jboss.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.udemy.entity.AuthorEntity;
import guru.springframework.udemy.entity.BookEntity;
import guru.springframework.udemy.entity.PublisherEntity;
import guru.springframework.udemy.repository.AuthorRepository;
import guru.springframework.udemy.repository.BookRepository;
import guru.springframework.udemy.repository.PublisherRepositoty;

@Component
public class BootstrapData implements CommandLineRunner {
	
	private static Logger log = Logger.getLogger("App SpringFramework Infos ====> ");
	private final AuthorRepository authorRepo;
	private final BookRepository bookRepo;
	private final PublisherRepositoty publisherRepo;
	
	public BootstrapData(AuthorRepository authorRepo, BookRepository bookRepo, PublisherRepositoty publisherRepo) {
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
		this.publisherRepo = publisherRepo;
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		AuthorEntity marcel =  new AuthorEntity("Marcel", "Proust");
		BookEntity leTempsPerdu = new BookEntity("Le temps perdu", "MP123"); 
		BookEntity leTempsRetrouve = new BookEntity("Le temps retrouvé", "MP456");
		PublisherEntity gallimard = new PublisherEntity("Gallimard" ,"5 Rue Gaston Gallimard","Paris", "France", "75007");
		
		marcel.getBooks().add(leTempsPerdu);
		marcel.getBooks().add(leTempsRetrouve);
			
		leTempsPerdu.getAuthors().add(marcel);
		leTempsRetrouve.getAuthors().add(marcel);
			
		authorRepo.save(marcel);
		bookRepo.save(leTempsPerdu);
		bookRepo.save(leTempsRetrouve);
		
		log.info("I've registered : " + bookRepo.count() + " books wrote by " + marcel.getFirsname() + " " + marcel.getLastname());
		log.info("The Publisher name is " + gallimard.getName());
	}
} 
	


	