package ru.aaa.springStudent.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.aaa.springStudent.impl.SubjectServiceImpl;
import ru.aaa.springStudent.models.Subject;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/subjects")
@AllArgsConstructor
public class SubjectController {
    private final SubjectServiceImpl service;

    @PostMapping("/saveSubject")
    public String saveSubject(@RequestBody Subject subject){
        service.saveSubject(subject);
        return "Учебная дисциплина сохранена";

    }
    @GetMapping
    public List<Subject> findAll(){
        return null;
    }
    @GetMapping("/getSubject/{id}")
    public Optional<Subject> getById(@PathVariable("id") long id){
       return null;
               //service.findSubjectById(id);

    }
    @DeleteMapping("/deleteSubject/{id}")
    public void deleteById(@PathVariable("id") long id){
        service.deleteById(id);
    }

}
