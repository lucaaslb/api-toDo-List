package com.lucaaslb.apitoDolist.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucaaslb.apitoDolist.models.Task;
import com.lucaaslb.apitoDolist.repository.TaskRepository;
import com.lucaaslb.apitoDolist.services.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public List<Task> findAll() {
		return taskRepository.findAll();
	}

	@Override
	public Task saveOrUpdateTask(Task task) {
		return taskRepository.save(task);

	}

}
