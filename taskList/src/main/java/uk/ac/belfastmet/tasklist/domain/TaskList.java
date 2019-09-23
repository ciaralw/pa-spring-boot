package uk.ac.belfastmet.tasklist.domain;

public class TaskList {
	
	//variables
	private String taskName;
	private String description;
	private String deadline;
	private boolean completed;
	private String priority;
	private String assignedTo;
	
	//constructors
	public TaskList() {
		super();
	}

	public TaskList(String taskName, String description, String deadline, boolean completed, String priority,
			String assignedTo) {
		super();
		this.taskName = taskName;
		this.description = description;
		this.deadline = deadline;
		this.completed = completed;
		this.priority = priority;
		this.assignedTo = assignedTo;
	}

	//getters and setters
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

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

	public void setStatus(boolean completed) {
		this.completed = completed;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

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
