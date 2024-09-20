package ru.aaa.springStudent.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aaa.springStudent.DTO.GroupDTO;
import ru.aaa.springStudent.DTO.SubjectDTO;
import ru.aaa.springStudent.models.Group;
import ru.aaa.springStudent.models.Subject;
import ru.aaa.springStudent.repository.SubjectRepository;
import ru.aaa.springStudent.services.ISubjectService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class SubjectServiceImpl implements ISubjectService{
    private SubjectRepository subjectRepository;
    @Override
    public List<SubjectDTO> findAll() {
        List<Subject> subjectDTOS = subjectRepository.findAll();
        return subjectDTOS.stream().map(subject -> {
            SubjectDTO dto =new SubjectDTO(
                    subject.getIdSubject(),
                    subject.getSubjectName());
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public SubjectDTO saveSubject(Subject subject) {
        Subject subject1=subjectRepository.save(subject);
        SubjectDTO dto=new SubjectDTO(subject1.getIdSubject(),subject1.getSubjectName());
        return dto;
    }

    @Override
    public Optional<SubjectDTO> findSubjectById(long id) {
        //return subjectRepository.findById(id);
        return null;
    }

    @Override
    public SubjectDTO updateSubject(Subject subject) {
        return null;
    }

    @Override
    public void deleteById(long id) {
        subjectRepository.deleteById(id);

    }
}
