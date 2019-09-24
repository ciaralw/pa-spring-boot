package uk.ac.belfastmet.tasklist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.tasklist.domain.TaskList;

@Repository
public interface TaskListRepository extends CrudRepository<TaskList, Long> {
	
}
