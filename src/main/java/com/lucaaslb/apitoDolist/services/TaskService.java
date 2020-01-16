package com.lucaaslb.apitoDolist.services;

import java.util.List;

import com.lucaaslb.apitoDolist.models.Task;

public interface TaskService {
	List<Task> findAll();

	Task saveOrUpdateTask(Task task);
}
