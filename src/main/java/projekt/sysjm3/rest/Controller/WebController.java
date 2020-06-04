<<<<<<< HEAD
package projekt.sysjm3.rest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import projekt.sysjm3.rest.Service.PersonService;

@Controller
public class WebController {


<<<<<<< Updated upstream
	@GetMapping("/")
<<<<<<< HEAD
	public String home() {
	return "index";
=======
	public String home(Model model) {
		model.addAttribute("persons", personService.getAllPersons());
		return "index";
=======
	@GetMapping("/index")
	public String home() {
	return "index";
>>>>>>> Stashed changes
	}
	@GetMapping ("/about")
	public String about() {
		return "about";
>>>>>>> master
	}
}
=======
package projekt.sysjm3.rest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	/**
	 * Sets index.html to be the startiong page.
	 * 
	 * @return
	 */
	@GetMapping("/")
	public String home() {
		return "index";
	}

	/**
	 * @return
	 */
	@GetMapping("/about")
	public String about() {
		return "about";
	}
}
>>>>>>> upstream/master
