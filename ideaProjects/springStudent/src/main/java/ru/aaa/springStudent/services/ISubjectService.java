package ru.aaa.springStudent.services;

import org.springframework.stereotype.Service;
import ru.aaa.springStudent.DTO.SubjectDTO;
import ru.aaa.springStudent.models.Student;
import ru.aaa.springStudent.models.Subject;

import java.util.List;
import java.util.Optional;
@Service
public interface ISubjectService {
    List<SubjectDTO> findAll();

    SubjectDTO saveSubject(Subject subject);
    Optional<SubjectDTO> findSubjectById(long id);
    SubjectDTO updateSubject(Subject subject);
    void deleteById(long id);
}
