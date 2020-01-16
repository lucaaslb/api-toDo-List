package com.lucaaslb.apitoDolist.models;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "tasks")
public class Task {

	@Id
	private String id;
	private String title;
	private String description;
	private boolean completed;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date when;
	
	private List<String> tags;

}
