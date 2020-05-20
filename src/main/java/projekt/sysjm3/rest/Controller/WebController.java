package projekt.sysjm3.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import projekt.sysjm3.rest.Entity.Person;
import projekt.sysjm3.rest.Repository.PersonRepository;

@RestController
public class WebController {

	@Autowired
	PersonRepository PersonRepository;

	@GetMapping("/login")
	public String login() {
		// add loginPage And SpringSecurity
		return null;
	}

	@ResponseBody
	@GetMapping("/")
	public String home() {
		return "index";

	}

	@ResponseBody
	@GetMapping("*")
	public String fyrahundrafyra() {
		return "error";
	}

	@GetMapping("/signup")
	public String formToAddPerson(Person person) {
		return "add-user";

	}

	@PostMapping("/addPerson")
	public String addPerson(Person person, Model model) {
		PersonRepository.save(person);
		model.addAttribute("person", PersonRepository.findAll());
		return "index";

	}

	@GetMapping("/edit/{id}")
	public String showUpdatePerson(@PathVariable("id") int id, Model model) {
		Person person = PersonRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Wrong " + id));
		model.addAttribute("person", person);
		return "update-Person";
	}

	@PostMapping("/update/{id}")
	public String updatePerson(@PathVariable("id") int id, Person person, Model model) {
		PersonRepository.save(person);
		model.addAttribute("person", PersonRepository.findAll());
		return "index";
	}

	@GetMapping("/delete/{id}")
	public String deletePerson(@PathVariable("id") int id, Model model) {
		Person person = PersonRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Wrong " + id));
		PersonRepository.delete(person);
		model.addAttribute("person", PersonRepository.findAll());
		return "index";
	}
}
