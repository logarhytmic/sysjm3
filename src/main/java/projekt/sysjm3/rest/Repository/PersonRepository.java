package projekt.sysjm3.rest.Repository;

import org.springframework.data.repository.CrudRepository;

import projekt.sysjm3.rest.Entity.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {

}
