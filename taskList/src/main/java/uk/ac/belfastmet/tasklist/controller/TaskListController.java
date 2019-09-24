package uk.ac.belfastmet.tasklist.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.tasklist.service.TaskListService;
import uk.ac.belfastmet.tasklist.controller.TaskListController;
import uk.ac.belfastmet.tasklist.domain.TaskList;

@Controller
@RequestMapping

public class TaskListController {
	
	Logger logger = LoggerFactory.getLogger(TaskListController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model) {
		TaskListService taskListService = new TaskListService();
		logger.info("Start of home page method");
		
		model.addAttribute("pageTitle", "To Do List");
//		model.addAttribute("myName", "Ciara");
		
//		ArrayList<TaskList> listTasks = taskListService.getTasksListed();
//		for(TaskList listTask :listTasks) {
//			logger.info(listTask.toString());
//		}

		
		model.addAttribute("tasks", taskListService.getTasksListed());
		
		ArrayList<TaskList> listTasks = taskListService.getTasksListed();
		for(TaskList listTask :listTasks) {
			logger.info(Boolean.toString(listTask.getCompleted()));
		}
		
		logger.info("End of home page method");
		return "index";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	
}
