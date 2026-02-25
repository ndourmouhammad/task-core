package sn.isi.l3gl.core.task_core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.isi.l3gl.core.task_core.entite.Task;
import sn.isi.l3gl.core.task_core.entite.TaskStatus;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    long countByStatus(TaskStatus status);
}
