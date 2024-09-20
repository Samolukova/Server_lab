package ru.aaa.springStudent.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@Entity
@Table(name = "student_group")
public class Group {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @Setter(AccessLevel.NONE)
    @Getter(AccessLevel.NONE)

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Student> students;
}
