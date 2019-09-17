package uk.ac.belfastmet.toystory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()

public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Home Page";
	}
	
	@GetMapping("/woody")
	public String woody() {
		return "Woody is played by Tom Hanks";
	}
	
	@GetMapping("/buzz")
	public String buzz() {
		return "Buzz is played by Tim Allen";
	}
	
	@GetMapping("/duke")
	public String duke() {
		return "Duke Caboom is played by Keanu Reeves";
	}
	
	@GetMapping("/rex")
	public String rex() {
		return "Rex is played by Wallace Shawn";
	}
	
}
