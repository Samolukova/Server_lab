package ru.aaa.springStudent.services;

import ru.aaa.springStudent.models.Student;
import ru.aaa.springStudent.models.Teacher;

import java.util.List;
import java.util.Optional;

public interface ITeacherService {
    List<Teacher> findAll();
    Teacher safeTeacher(Teacher teacher);
    Optional<Teacher> findTeacherById(long id);
    Teacher updateTeacher(Teacher teacher);
    void deleteTeacher(long id);
}
