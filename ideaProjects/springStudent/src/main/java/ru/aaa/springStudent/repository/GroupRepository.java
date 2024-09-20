package ru.aaa.springStudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aaa.springStudent.models.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {
    //void deleteById(long id);
}
