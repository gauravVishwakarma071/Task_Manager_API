package com.spring.taskmanager.service;

import com.spring.taskmanager.model.Task;
import com.spring.taskmanager.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository repo;

    //Create task
    public Task createTask(Task task){
        task.setCreatedAt(Instant.now());
        return repo.save(task);
    }

    //Read All taskd
    public List<Task> findAllTask(){
        return repo.findAll();
    }

    //Read One Task
    public Optional<Task> findTaskById(Long id){
        return repo.findById(id);
    }

    //Update Task
    @Transactional
    public Optional<Task> updateTask(Long id, Task updates) {
        return repo.findById(id).map(task -> {
            task.setTitle(updates.getTitle());
            task.setDescription(updates.getDescription());
            task.setStatus(updates.getStatus());
            return task; // no need to call save(), Hibernate auto-flushes
        });
    }


    //Delete
    public boolean deleteTask(Long id){
        if(!repo.existsById(id)) return false;
        repo.deleteById(id);
        return true;
    }
}
