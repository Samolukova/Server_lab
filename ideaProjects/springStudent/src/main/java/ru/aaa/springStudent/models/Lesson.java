package ru.aaa.springStudent.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;

@Data
@Entity
public class Lesson {
    @Id
    @GeneratedValue
    private Long lessonId;
    private Time startTime;
    @ManyToOne
    @JoinColumn(name = "teacherId", nullable = false)
    private Teacher teacher;
    @ManyToOne(optional = false)
    @JoinColumn(name = "subjectId", nullable = false)
    private Group group;
}
