package com.example.todoapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
  public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public boolean getCompleted() {
	return completed;
}
public void setCompleted(boolean completed) {
	this.completed = completed;
}
private String description;
  private boolean completed;
}
