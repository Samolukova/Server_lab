package ru.aaa.springStudent.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aaa.springStudent.Converter;
import ru.aaa.springStudent.DTO.StudentDTO;
import ru.aaa.springStudent.models.Group;
import ru.aaa.springStudent.models.Student;
import ru.aaa.springStudent.repository.GroupRepository;
import ru.aaa.springStudent.repository.StudentRepository;
import ru.aaa.springStudent.services.IStudentService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class StudentServiceImpl implements IStudentService {
    private final StudentRepository repository;
    private final GroupRepository groupRepository;
    @Override
    public List<StudentDTO> findAll() {
        List<Student> students = repository.findAll();
        return students.stream().map(Converter::toStudentDTO).collect(Collectors.toList());

    }

    @Override
    public StudentDTO saveStudent(Student student) {
        repository.save(student);
        return Converter.toStudentDTO(student);

    }

    @Override
    public Optional<StudentDTO> findStudentById(long id) {
        return repository.findById(id).map(student -> {
            return Converter.toStudentDTO(student);
        });
    }

    @Override
    public StudentDTO updateStudent(Student student) {
        Student existingStudent = repository.findById(student.getId())
                .orElseThrow(() -> new RuntimeException("Студент с ID " + student.getId() + " не найден"));
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setSecondName(student.getSecondName());
        existingStudent.setMiddleName(student.getMiddleName());
        existingStudent.setStatus(student.getStatus());
        existingStudent.setGroup(student.getGroup());
        repository.save(existingStudent);
        return Converter.toStudentDTO(existingStudent);
    }



    @Override
    public void deleteById(long id) {
       repository.deleteById(id);
    }

    @Override
    public List<StudentDTO> findStudentsByGroup(long id) {
        if(groupRepository.existsById(id)){
            List<Student> students=repository.findAllByGroupId(id);
            return students.stream().map(Converter::toStudentDTO).collect(Collectors.toList());
        }
        else{
            new RuntimeException("Группа с ID " + id + " не найдена");
            return null;
        }
    }

}
