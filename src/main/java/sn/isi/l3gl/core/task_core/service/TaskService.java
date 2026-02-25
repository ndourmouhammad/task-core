package sn.isi.l3gl.core.task_core.service;

import org.springframework.stereotype.Service;
import sn.isi.l3gl.core.task_core.entite.Task;
import sn.isi.l3gl.core.task_core.entite.TaskStatus;
import sn.isi.l3gl.core.task_core.repository.TaskRepository;

import java.util.List;

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

    // Ajout dans la Version 0.1.0-SNAPSHOT
    public List<Task> listTasks() {
        return taskRepository.findAll();
    }
    // Ajout dans la Version 0.2.0-SNAPSHOT
    public Task updateStatus(Long id, TaskStatus newStatus) {
        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tâche introuvable avec l'ID : " + id));
        task.setStatus(newStatus);
        return taskRepository.save(task);
    }

    // Ajout dans la Version 0.3.0-SNAPSHOT
    public long countCompletedTasks() {
        return taskRepository.countByStatus(TaskStatus.DONE);
    }
}
