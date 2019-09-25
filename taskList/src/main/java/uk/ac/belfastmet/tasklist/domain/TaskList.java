package uk.ac.belfastmet.tasklist.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author WAR14101792
 *
 */
@Entity
@Table(name = "task")
public class TaskList {
	
	//variables
	private long id;
	private String taskName;
	private String description;
	private String deadline;
	private boolean completed;
	private String priority;
	private String assignedTo;
	
	//constructors
	public TaskList() 
	{	
		super();
	}

	/** 
	 * 
	 * @param taskName - String taskName
	 * @param description - String description
	 * @param deadline - String deadline
	 * @param completed - boolean completed
	 * @param priority - String priority
	 * @param assignedTo - String assignedTo
	*/
	public TaskList(String taskName, String description, String deadline, boolean completed, String priority,
			String assignedTo) 
	{	
		super();
		this.taskName = taskName;
		this.description = description;
		this.deadline = deadline;
		this.completed = completed;
		this.priority = priority;
		this.assignedTo = assignedTo;
	}
		
	//getters and setters
	//@Column used to map to SQL fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public boolean getCompleted() {
		return completed;
	}
	
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Column(name = "priority")
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Column(name = "user")
	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	
	public String toString() {
		return taskName + " " + description + " " + deadline + " " + completed + " " + priority + " " + assignedTo;
	}
}
