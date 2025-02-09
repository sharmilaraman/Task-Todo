package com.example.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todoapp.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
