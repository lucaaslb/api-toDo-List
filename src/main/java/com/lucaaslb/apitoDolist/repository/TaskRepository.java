package com.lucaaslb.apitoDolist.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucaaslb.apitoDolist.models.Task;

public interface TaskRepository extends MongoRepository<Task, String> {

	List<Task> findByTags(String tag);

}
