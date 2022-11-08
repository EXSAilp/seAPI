package se.project.API.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.project.API.model.Students;

import java.util.List;
import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Students, UUID> {
    Students findByName(String name);
    List<Students> findByStudentId(String studentId);
}
