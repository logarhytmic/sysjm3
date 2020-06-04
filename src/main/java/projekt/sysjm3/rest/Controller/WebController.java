package projekt.sysjm3.rest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {

	/**
	 * Sets index.html to be the startiong page.
	 * @return
	 */
	@GetMapping("/")
	public String home() {
	return "index";
	}
	
}
