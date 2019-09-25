package uk.ac.belfastmet.dwarfs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.dwarfs.service.DwarfService;
import uk.ac.belfastmet.dwarfs.controller.DwarfsController;

@Controller
@RequestMapping
public class DwarfsController {
	
	@Autowired
	private DwarfService dwarfService;
	
	Logger logger = LoggerFactory.getLogger(DwarfsController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage() {
		logger.info("Start of home page method");
		return "index";
	}
	
	@RequestMapping(value = "/disney", method = RequestMethod.GET)
	public String disneyPage(Model model) {
		logger.info("Start of disney page method");
		//DwarfService dwarfService = new DwarfService();
		model.addAttribute("pageTitle", "Disney Dwarfs");
		model.addAttribute("dwarfs", dwarfService.getDisneyDwarfs());
		
		
		return "disney";
	}
	
//	@RequestMapping(value = "/tolkien", method = RequestMethod.GET)
//	public String tolkienPage(Model model) {
//		
//		DwarfService dwarfService = new DwarfService();
//		model.addAttribute("pageTitle", "Tolkien Dwarfs");
//		model.addAttribute("dwarfs", dwarfService.getTolkienDwarfs());
//		
//		return "tolkien";
//	}
	
}
