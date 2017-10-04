package co.assesment.emirates.toDoApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.assesment.emirates.toDoApp.model.Task;

/**
 * The Interface TaskRepository.
 */
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
