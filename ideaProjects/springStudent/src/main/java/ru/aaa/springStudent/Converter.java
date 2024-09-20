package ru.aaa.springStudent;

import ru.aaa.springStudent.DTO.GroupDTO;
import ru.aaa.springStudent.DTO.StudentDTO;
import ru.aaa.springStudent.models.Group;
import ru.aaa.springStudent.models.Student;

public class Converter {
    public static StudentDTO toStudentDTO(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setSecondName(student.getSecondName());
        studentDTO.setMiddleName(student.getMiddleName());
        studentDTO.setStatus(student.getStatus());
        if (student.getGroup() != null) {
            studentDTO.setGroupName(student.getGroup().getName());
        } else {
            studentDTO.setGroupName("No Group");
        }
        return studentDTO;
    }
    public static GroupDTO toGroupDTO(Group group){
        return new GroupDTO(group.getId(), group.getName());
    }
}