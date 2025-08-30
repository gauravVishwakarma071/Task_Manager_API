package com.spring.taskmanager.repository;

import com.spring.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task,Long> {
//List<Task> findbyTitle(String title);
}
