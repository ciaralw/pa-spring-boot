package uk.ac.belfastmet.tasklist.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.tasklist.domain.TaskList;
import uk.ac.belfastmet.tasklist.repository.TaskListRepository;

@Service

public class TaskListService {
	Logger logger = LoggerFactory.getLogger(TaskListService.class);
	
	@Autowired
	private TaskListRepository taskListRepository; 

	private ArrayList<TaskList> tasksListed;
	
	public Iterable<TaskList> getNumberOfTasks() {
		logger.info("# of tasks: {}", taskListRepository.count());
	
	
		Iterable<TaskList> taskList = taskListRepository.findAll();
		Iterator<TaskList> iterator = taskList.iterator();
		while(iterator.hasNext()) {
			logger.info("{}", iterator.next().toString());
		}
		
		return iterator.next();
	
	}
	
	/**
	 * 
	 * @return The values added in to the getTasksListed ArrayList
	 */
	public ArrayList<TaskList> getTasksListed(){
		this.tasksListed = new ArrayList<TaskList>();
		
		this.tasksListed.add(new TaskList("Clean clothes", "Take clothes to dry cleaners", "30th Sept", false, "Low", "Becky"));
		this.tasksListed.add(new TaskList ("Meal prep", "Prepare lunches and dinners for 3 days", "24th Sept", false, "Med", "Bobby"));
		this.tasksListed.add(new TaskList("Feed pets", "Fill up the dogs food and water bowls", "23rd Sept", true, "High", "Petunia"));
		this.tasksListed.add(new TaskList("Make costume", "Make a bat costume for halloween", "31st Oct", false, "Med", "Marcus"));
	
		return this.tasksListed;
	}
	
}
