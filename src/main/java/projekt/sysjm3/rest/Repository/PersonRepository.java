package projekt.sysjm3.rest.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekt.sysjm3.rest.Entity.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
	
	Person findById(int id);
	
	
	
}
