package projekt.sysjm3.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projekt.sysjm3.rest.Entity.Person;
import projekt.sysjm3.rest.Service.PersonService;

@RestController
public class MainController {
	@Autowired
	PersonService personService;

	@GetMapping("/persons")
	private List<Person> getAllPersons() {
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
}
