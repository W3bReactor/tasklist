package com.example.tasklist.repository;

import com.example.tasklist.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

//@Mapper
public interface UserRepository extends JpaRepository<User, Long> {
//    Optional<User> findById(Long id);

//    Optional<User> findByUsername(String username);


//    void update(User user);

//    void create(User user);

//    void insertUserRole(
//    @Param("userId") Long userId,
//    @Param("role") Role role
//    );


    @Query(value = """
            SELECT exists(
                SELECT 1
                FROM users_tasks
                WHERE user_id = :userId
                AND task_id = :taskId
            )
            """, nativeQuery = true)
    boolean isTaskOwner(
            @Param("userId") Long userId,
            @Param("taskId") Long taskId
    );


    Optional<User> findByUsername(String username);
//    Optional<Object> findByUsername(String username);

//    void delete(Long id);
}
