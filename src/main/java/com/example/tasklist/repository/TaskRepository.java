package com.example.tasklist.repository;

import com.example.tasklist.domain.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//@Mapper
public interface TaskRepository extends JpaRepository<Task, Long> {
//    Optional<Task> findById(Long id);


    @Query(value = """
            SELECT * FROM tasks t
            JOIN users_tasks ut ON ut.task_id = t.id
            WHERE ut.user_id = :userId
            """, nativeQuery = true)
    List<Task> findAllByUserId(@Param("userId") Long userId);

//    void assignToUserById(
//    @Param("taskId") Long id,
//    @Param("userId") Long userId
//    );

//    Замена save
//    void update(Task task);
//
//    void create(Task task);

//    void delete(Long id);
}
