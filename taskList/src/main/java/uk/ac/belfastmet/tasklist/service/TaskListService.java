package uk.ac.belfastmet.tasklist.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.tasklist.domain.TaskList;
import uk.ac.belfastmet.tasklist.repository.TaskListRepository;

/**
 * 
 * @author WAR14101792
 *
 */
@Service

public class TaskListService {
	Logger logger = LoggerFactory.getLogger(TaskListService.class);
	
	@Autowired
	private TaskListRepository taskListRepository; 
	
	//This was temporary to count the number of tasks in the task list in the DB
	//	public Iterable<TaskList> getNumberOfTasks() 
	//	{		
	//		logger.info("# of tasks: {}", taskListRepository.count());
	//	}
		
	/**
	 * 
	 * @return Returns the task list from the DB, connected via the repository
	 */
	private ArrayList<TaskList> tasksListed;
	
	public Iterable<TaskList> getTasksListed(){
	this.tasksListed = new ArrayList<TaskList>();
	Iterable<TaskList> taskList = taskListRepository.findAll();
	
	Iterator<TaskList> iterator = taskList.iterator();
	while(iterator.hasNext()) 
	{
		logger.info("{}", iterator.next().toString());
	}
	
	return taskList;
	}
	
}
