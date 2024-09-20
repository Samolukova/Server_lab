package ru.aaa.springStudent.services;

import ru.aaa.springStudent.models.Lesson;
import ru.aaa.springStudent.models.Student;

import java.util.List;
import java.util.Optional;

public interface ILessonService {
    List<Lesson> findAll();
    Lesson safeLesson(Lesson lesson);
    Optional<Lesson> findLessonById(long id);
    Lesson updateLesson(Lesson lesson);
    void deleteLesson(long id);
}
