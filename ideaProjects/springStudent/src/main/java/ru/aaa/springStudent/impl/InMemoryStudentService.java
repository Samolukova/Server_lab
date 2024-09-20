package ru.aaa.springStudent.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aaa.springStudent.models.Student;
import ru.aaa.springStudent.repository.InMemoryStudentDAO;
import ru.aaa.springStudent.services.IStudentService;


import java.util.List;
import java.util.Optional;
/*
@Service
@AllArgsConstructor
public class InMemoryStudentService implements IStudentService
{
    private final InMemoryStudentDAO repository;
    @Override
    public List<Student> findAll() {

          return repository.findAllStudent();
    }

    @Override
    public Student safeStudent(Student student) {
        return repository.safeStudent(student);
    }

    @Override
    public Optional<Student> findStudentById(long id) {
        return Optional.ofNullable(repository.findStudentById(id));
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteStudent(id);
    }
}
*/