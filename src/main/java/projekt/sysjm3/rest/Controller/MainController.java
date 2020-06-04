package projekt.sysjm3.rest.Controller;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
=======
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
>>>>>>> upstream/master
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.PutMapping;
>>>>>>> upstream/master
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projekt.sysjm3.rest.Entity.Person;
<<<<<<< HEAD
=======
import projekt.sysjm3.rest.Repository.PersonRepository;
>>>>>>> upstream/master
import projekt.sysjm3.rest.Service.PersonService;

@RestController
public class MainController {
<<<<<<< HEAD
	@Autowired
	PersonService personService;

	@GetMapping("/persons")
	private List<Person> getAllPersons() {
=======

	@Autowired
	PersonService personService;


	@GetMapping("/persons")
	private ArrayList<Person> getAllPersons() {
>>>>>>> upstream/master
		return personService.getAllPersons();
	}

	@GetMapping("/persons/{id}")
	private Person getPerson(@PathVariable("id") int id) {
		return personService.getPersonById(id);
	}

	@DeleteMapping("/persons/{id}")
	private void deletePerson(@PathVariable("id") int id) {
		personService.delete(id);
	}

	@PostMapping("/persons")
	private int savePerson(@RequestBody Person person) {
		personService.saveOrUpdate(person);
		return person.getId();
	}
<<<<<<< HEAD
}
=======

	@PutMapping("/persons/{id}")
	public ResponseEntity<?> updatePerson(@PathVariable("id") int id, @RequestBody Person person) {
		personService.saveOrUpdate(person);
		return ResponseEntity.ok("PUT ok");

	}

}
>>>>>>> upstream/master
