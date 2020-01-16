package com.lucaaslb.apitoDolist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lucaaslb.apitoDolist.models.Task;
import com.lucaaslb.apitoDolist.services.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@ResponseStatus(HttpStatus.OK)
	@GetMapping(value = "/")
	public List<Task> getAllTasks() {
		return taskService.findAll();
	}

	@PostMapping(value = "/")
	public ResponseEntity<?> saveTask(@RequestBody Task task) {
		taskService.saveOrUpdateTask(task);
		return new ResponseEntity("Task added successfully", HttpStatus.CREATED);
	}

	@PutMapping(value = "/")
	public ResponseEntity<?> updateTaskById(@RequestBody Task task) {
		taskService.saveOrUpdateTask(task);
		return new ResponseEntity("Task updated successfully", HttpStatus.OK);
	}

}
