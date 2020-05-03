package guru.springframework.udemy.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.udemy.entity.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity, Long> {

}
