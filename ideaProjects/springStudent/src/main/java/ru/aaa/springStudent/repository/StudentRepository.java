package ru.aaa.springStudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aaa.springStudent.DTO.StudentDTO;
import ru.aaa.springStudent.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteById(long id);
    List<Student> findAllByGroupId(long id);

}
