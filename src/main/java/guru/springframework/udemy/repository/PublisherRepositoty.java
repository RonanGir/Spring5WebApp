package guru.springframework.udemy.repository;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.udemy.entity.PublisherEntity;

public interface PublisherRepositoty extends CrudRepository<PublisherEntity, Long> {

}
