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

	/**
	 * 
	 * @param model The model of the tasks list
	 * @return Return the index html page
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model) {
		TaskListService taskListService = new TaskListService();
		logger.info("Start of home page method");
		
		model.addAttribute("pageTitle", "To Do List");
		
		//Logger to see if task list is populating
		ArrayList<TaskList> listTasks = taskListService.getTasksListed();
		for(TaskList listTask :listTasks) {
			logger.info(listTask.toString());
		}

		
		model.addAttribute("tasks", taskListService.getTasksListed());
		
		//Logger to see if the getCompleted field is completed
		ArrayList<TaskList> listTasks1 = taskListService.getTasksListed();
		for(TaskList listTask :listTasks1) {
			logger.info(Boolean.toString(listTask.getCompleted()));
		}
		
		logger.info("End of home page method");
		return "index";
	}
	
	/**
	 * 
	 * @return The login html page
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	
}
