package uk.ac.belfastmet.topten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.topten.service.TopTenService;

@Controller
@RequestMapping

public class TopTenController {
	
	@GetMapping("")
	public String homePage() {
		return "index";
	}
	
	@GetMapping("/topsingles")
	public String singlesPage(Model model) {
		
		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Top Ten Singles");
		model.addAttribute("singles", topTenService.getTopTenSingles());
		
		return "topsingles";
	}
	
	@GetMapping("/topalbums")
	public String albumsPage(Model model) {
		
		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Top Ten Albums");
		model.addAttribute("albums", topTenService.getTopTenAlbums());
		
		return "topalbums";
	}

}
