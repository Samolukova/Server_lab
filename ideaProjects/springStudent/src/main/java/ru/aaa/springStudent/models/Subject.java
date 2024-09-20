package ru.aaa.springStudent.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Subject {
    @Id
    @GeneratedValue
    private Long idSubject;
    private String subjectName;
}
