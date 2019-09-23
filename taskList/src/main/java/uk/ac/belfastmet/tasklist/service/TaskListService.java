package uk.ac.belfastmet.tasklist.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.tasklist.domain.TaskList;

@Service

public class TaskListService {

	private ArrayList<TaskList> tasksListed;
		
	public ArrayList<TaskList> getTasksListed(){
		this.tasksListed = new ArrayList<TaskList>();
		
		this.tasksListed.add(new TaskList("Clean clothes", "Take clothes to dry cleaners", "30th Sept", false, "Low", "Becky"));
		this.tasksListed.add(new TaskList ("Meal prep", "Prepare lunches and dinners for 3 days", "24th Sept", false, "Med", "Bobby"));
		this.tasksListed.add(new TaskList("Feed pets", "Fill up the dogs food and water bowls", "23rd Sept", true, "High", "Petunia"));
		this.tasksListed.add(new TaskList("Make costume", "Make a bat costume for halloween", "31st Oct", false, "Med", "Marcus"));
	
		return this.tasksListed;
	}
	
}
