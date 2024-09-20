package ru.aaa.springStudent.services;

import org.springframework.stereotype.Service;
import ru.aaa.springStudent.DTO.StudentDTO;
import ru.aaa.springStudent.models.Group;
import ru.aaa.springStudent.models.Student;

import java.util.List;
import java.util.Optional;

@Service
public interface IStudentService {

    List<StudentDTO> findAll();
    StudentDTO saveStudent(Student student);
    Optional<StudentDTO> findStudentById(long id);
    StudentDTO updateStudent(Student student);
    void deleteById(long id);
    List<StudentDTO> findStudentsByGroup(long id);

}
