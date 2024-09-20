package ru.aaa.springStudent.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aaa.springStudent.Converter;
import ru.aaa.springStudent.DTO.GroupDTO;
import ru.aaa.springStudent.models.Group;
import ru.aaa.springStudent.models.Student;
import ru.aaa.springStudent.repository.GroupRepository;
import ru.aaa.springStudent.services.IGroupService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class GroupServiceImpl implements IGroupService {
    private GroupRepository groupRepository;
    @Override
    public List<GroupDTO> findAll() {
        List<Group> groups = groupRepository.findAll();
        return groups.stream().map(Converter::toGroupDTO).collect(Collectors.toList());

    }


    @Override
    public GroupDTO saveGroup(Group group) {
        Group savedGroup=groupRepository.save(group);
        return new GroupDTO(group.getId(),group.getName());
    }

    @Override
    public Optional<GroupDTO> findGroupById(long id) {
        return groupRepository.findById(id).map(group -> {
            return new GroupDTO(group.getId(),group.getName());
        });
    }

    @Override
    public GroupDTO updateGroup(Group group) {
        if (groupRepository.existsById(group.getId())) {
        }
        Group existingGroup = groupRepository.findById(group.getId())
                .orElseThrow(()->new RuntimeException("Группа с ID" + group.getId() + " не найдена"));
        existingGroup.setName(group.getName());
        groupRepository.save(existingGroup);
        return Converter.toGroupDTO(existingGroup);
    }

    @Override
    public void deleteGroup(long id) {
        groupRepository.deleteById(id);
    }
}
