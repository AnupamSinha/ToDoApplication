package co.assesment.emirates.toDoApp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.assesment.emirates.toDoApp.constants.Constants;
import co.assesment.emirates.toDoApp.model.Task;
import co.assesment.emirates.toDoApp.repository.TaskRepository;
import co.assesment.emirates.toDoApp.util.TaskUtil;

/**
 * The Class TaskController.
 */
@RestController
@RequestMapping("/items")
public class TaskController {
	/** The repo. */
	@Autowired
	private TaskRepository repo;

	/**
	 * Find items.
	 *
	 * @return the list
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<Task> findItems() {
		List<Task> items = null;
		items = repo.findAll();
		for (Task item : items) {
			if (item != null && item.getCompletedOn() != null) {
				Date date = TaskUtil.convertStringToDate(item.getCompletedOn());
				if (date != null) {
					String completedOn = TaskUtil.convertDateToString(date);
					item.setCompletedOn(completedOn);
				}
			}
		}
		return items;
	}

	/**
	 * Adds the item.
	 *
	 * @param item
	 *            the item
	 * @return the task
	 */
	@RequestMapping(method = RequestMethod.POST)
	public Task addItem(@RequestBody Task item) {
		item.setId(null);
		Date today = new Date();
		String reportDate = TaskUtil.convertDateToString(today);
		item.setCreateDate(reportDate);
		item.setStatus(Constants.IN_PROGRESS);
		item.setStatusCss("success");
		if (item.getPriority() != null && item.getPriority().trim().equalsIgnoreCase(Constants.HIGH)) {
			item.setCss("danger");
		} else if (item.getPriority() != null && item.getPriority().trim().equalsIgnoreCase(Constants.LOW)) {
			item.setCss("warning");
		} else {
			item.setCss("info");
		}
		return repo.saveAndFlush(item);
	}

	/**
	 * Complete.
	 *
	 * @param updatedItem
	 *            the updated item
	 * @param id
	 *            the id
	 * @return the task
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Task complete(@RequestBody Task updatedItem, @PathVariable Integer id) {
		if (updatedItem != null) {
			updatedItem.setStatus(Constants.COMPLETED);
			updatedItem.setCompletedCss(Constants.COMPLETED_CSS);
			updatedItem.setDisabledOnCompleted(Constants.DISABLED);
			updatedItem.setCompletedTextCss(Constants.DEFAULT);
			updatedItem.setStatusCss(Constants.DEFAULT);
			Date today = new Date();
			String completedDate = TaskUtil.convertDateToString(today);
			updatedItem.setCompletedDate(completedDate);
		}
		return repo.saveAndFlush(updatedItem);
	}

	/**
	 * Delete item.
	 *
	 * @param id
	 *            the id
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteItem(@PathVariable Integer id) {
		repo.delete(id);
	}
}
