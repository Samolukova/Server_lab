package ru.aaa.springStudent.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.aaa.springStudent.enums.StudentStatus;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class StudentDTO {

        private Long id;
        private String firstName;
        private String secondName;
        private String middleName;
        private String groupName;
        private Enum<StudentStatus> status;

}
