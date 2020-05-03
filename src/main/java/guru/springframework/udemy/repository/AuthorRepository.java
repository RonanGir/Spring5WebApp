package guru.springframework.udemy.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.udemy.entity.AuthorEntity;

public interface AuthorRepository extends CrudRepository<AuthorEntity, Long> {

}
