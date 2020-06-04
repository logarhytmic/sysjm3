
package projekt.sysjm3.rest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	/**
	 * Sets index.html to be the starting page.F
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
