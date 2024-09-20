package ru.aaa.springStudent.repository;

import org.springframework.stereotype.Repository;

import ru.aaa.springStudent.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {
        private final List<Student> studentList = new ArrayList<>();

        public List<Student> findAllStudent() {
            return studentList;
        }


    public Student safeStudent(Student student) {
        studentList.add(student);
        return student;
    }


    public Student findStudentById(Long id) {
       return studentList.stream()
               .filter(element ->element.getId().equals(id))
               .findFirst()
               .orElse(null);
    }


    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0,studentList.size())
                .filter(index-> studentList.get(index).getSecondName().equals(student.getSecondName()))
                .findFirst()
                .orElse(-1);
        if(studentIndex>-1){
            studentList.set(studentIndex,student);
            return student;
        }
        return null;
    }


    public void deleteStudent(Long id) {
       var student=findStudentById(id);
       if(student!= null){
           studentList.remove(student);
       }
    }
}
