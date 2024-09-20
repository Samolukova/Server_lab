package ru.aaa.springStudent.models;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.*;
import lombok.*;
import ru.aaa.springStudent.enums.StudentStatus;

@Data
@Entity
@Getter
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String SecondName;
    private String MiddleName;

    @Getter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "groupId", nullable = true)  // Разрешаем null для внешнего ключа
    private Group group;

    @Enumerated(EnumType.STRING)
    private StudentStatus status;


}
