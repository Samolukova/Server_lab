package ru.aaa.springStudent.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.aaa.springStudent.DTO.StudentDTO;
import ru.aaa.springStudent.impl.StudentServiceImpl;
import ru.aaa.springStudent.models.Group;
import ru.aaa.springStudent.models.Student;


import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping("/api/v1/students")
@AllArgsConstructor

public class StudentController {

    private final StudentServiceImpl service;
    @GetMapping
    public ResponseEntity<List<StudentDTO>> findAll(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @PostMapping("/saveStudent")
    public ResponseEntity<StudentDTO> saveStudent(@RequestBody Student student){
        return new ResponseEntity<>(service.saveStudent(student),HttpStatus.CREATED);

    }

    @PutMapping("/updateStudent")
    public ResponseEntity<StudentDTO> updateStudent(Student student){
        return new ResponseEntity<>( service.updateStudent(student),HttpStatus.CREATED);
    }
    @GetMapping("/findStudentById/{id}")
    public ResponseEntity<Optional<StudentDTO>> findStudentById(@PathVariable("id") long id) {
        return new ResponseEntity <>(service.findStudentById(id), HttpStatus.OK);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteById(@PathVariable("id") long id){
        service.deleteById(id);
    }

    @GetMapping("/studentsByGroup/{id}")
    public List<StudentDTO> studentsByGroup(@PathVariable("id") long id){
        return service.findStudentsByGroup(id);
    }
}
