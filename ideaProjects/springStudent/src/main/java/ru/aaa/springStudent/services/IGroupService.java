package ru.aaa.springStudent.services;

import ru.aaa.springStudent.DTO.GroupDTO;
import ru.aaa.springStudent.models.Group;
import ru.aaa.springStudent.models.Student;

import java.util.List;
import java.util.Optional;

public interface IGroupService {
    List<GroupDTO> findAll();
    GroupDTO saveGroup(Group group);
    Optional<GroupDTO> findGroupById(long id);
    GroupDTO updateGroup(Group group);
    void deleteGroup(long id);
}
