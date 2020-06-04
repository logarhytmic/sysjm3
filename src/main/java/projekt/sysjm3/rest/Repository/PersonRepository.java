package projekt.sysjm3.rest.Repository;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projekt.sysjm3.rest.Entity.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

	ArrayList<Person> findAll();
	
	Person findById(long ssn);

//	BooleanSupplier existsById(long ssn);
	
}
