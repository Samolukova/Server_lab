package ru.aaa.springStudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aaa.springStudent.models.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
