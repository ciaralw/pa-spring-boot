package uk.ac.belfastmet.topten.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.topten.service.TopTenService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping

public class TopTenController {
	
	Logger logger = LoggerFactory.getLogger(TopTenController.class);
		
	/**
	 * 
	 * @return Return the index html page
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	//@GetMapping("")
	public String homePage() {
		logger.info("End of home page method");
		return "index";
	}
	
	/**
	 * This method returns the top singles page and displays all values in the getTopTenSingles ArrayList
	 * @param model The model of the top ten singles
	 * @return Return the top singles html page
	 */
	@RequestMapping(value = "/topsingles", method = RequestMethod.GET)
	//@GetMapping("/topsingles")
	public String singlesPage(Model model) {
		
		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Top Ten Singles");
		model.addAttribute("singles", topTenService.getTopTenSingles());
		
		logger.info("End of top singles page method");
		return "topsingles";
	}
	
	/**
	 * 	This method returns the top albums page and displays all values in the getTopTenAlbums ArrayList
	 * @param model The model of the top ten albums
	 * @return Return the top albums html page
	 */
	@RequestMapping(value = "/topalbums", method = RequestMethod.GET)
	//@GetMapping("/topalbums")
	public String albumsPage(Model model) {
		
		TopTenService topTenService = new TopTenService();
		model.addAttribute("pageTitle", "Top Ten Albums");
		model.addAttribute("albums", topTenService.getTopTenAlbums());
		
		logger.info("End of top albums page method");
		return "topalbums";
	}

//	@RequestMapping (value = "/error", method = RequestMethod.GET)
//	public String errorPage() {
//		logger.info("End of error page method");
//		return "error";	
//	}
	
	
}
