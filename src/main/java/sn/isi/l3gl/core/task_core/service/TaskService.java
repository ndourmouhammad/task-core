package sn.isi.l3gl.core.task_core.service;

import org.springframework.stereotype.Service;
import sn.isi.l3gl.core.task_core.entite.Task;
import sn.isi.l3gl.core.task_core.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Version 0.0.1-SNAPSHOT
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
}
