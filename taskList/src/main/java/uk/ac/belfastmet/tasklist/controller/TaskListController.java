package uk.ac.belfastmet.tasklist.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uk.ac.belfastmet.tasklist.service.TaskListService;
import uk.ac.belfastmet.tasklist.controller.TaskListController;
import uk.ac.belfastmet.tasklist.domain.TaskList;

/**
 * 
 * @author WAR14101792
 *
 */
@Controller
@RequestMapping

public class TaskListController {
	@Autowired
	private TaskListService taskListService;	
	
	Logger logger = LoggerFactory.getLogger(TaskListController.class);

	/**
	 * This method returns the index page and displays all values in the getTasksListed ArrayList
	 * @param model The model of the tasks list
	 * @return Returns the index html page
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage(Model model) {
		//The @Autowired above removes the need for the below line as its automatically doing the same thing
		//TaskListService taskListService = new TaskListService();
		logger.info("Start of home page method");
		
		model.addAttribute("pageTitle", "To Do List");
		
//Logger to see if task list is populating
//		ArrayList<TaskList> listTasks = taskListService.getTasksListed();
//		for(TaskList listTask :listTasks) {
//			logger.info(listTask.toString());
//		}
		
		model.addAttribute("tasks", taskListService.getTasksListed());
		
//Logger to see if the getCompleted field is completed
//		ArrayList<TaskList> listTasks1 = taskListService.getTasksListed();
//		for(TaskList listTask :listTasks1) {
//			logger.info(Boolean.toString(listTask.getCompleted()));
//		}
		
		logger.info("End of home page method");
		return "index";
		
	}
	
	/**
	 * This method returns the login page
	 * @return The login html page
	 */
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		//taskListService.getNumberOfTasks();
		return "login";
	}
		
}
