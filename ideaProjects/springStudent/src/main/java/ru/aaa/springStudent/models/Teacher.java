package ru.aaa.springStudent.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue
    private Long teacherId;
    private String firstName;
    private String SecondName;
    private String MiddleName;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
    private List<Lesson> lessons;

}
