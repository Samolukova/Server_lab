package ru.aaa.springStudent.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "studentId", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "lessonId", nullable = false)
    private Lesson lesson;

    @Column(name = "is_present", nullable = false)
    private boolean isPresent;


}
