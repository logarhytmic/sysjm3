package projekt.sysjm3.rest.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projekt.sysjm3.rest.Entity.Person;
import projekt.sysjm3.rest.Repository.PersonRepository;

@RestController
public class WebController {

	@Autowired
	PersonRepository PersonRepository;

	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}

	@GetMapping("/persons")
	public Iterable<Person> listAllPersons() {

		return PersonRepository.findAll();
	}
}
