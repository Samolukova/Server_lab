package ru.aaa.springStudent.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.aaa.springStudent.DTO.GroupDTO;
import ru.aaa.springStudent.impl.GroupServiceImpl;
import ru.aaa.springStudent.models.Group;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/groups")
@AllArgsConstructor
public class GroupController {
    private final GroupServiceImpl groupService;

    @PostMapping("/saveGroup")
    public ResponseEntity<GroupDTO> saveGroup(@RequestBody Group group){
        return new ResponseEntity<>(groupService.saveGroup(group), HttpStatus.CREATED);

    }
    @GetMapping
    public ResponseEntity<List<GroupDTO>> findAll(){
        return new ResponseEntity<>(groupService.findAll(),HttpStatus.OK);
    }
    @GetMapping("/findGroupById/{id}")
    public ResponseEntity<Optional<GroupDTO>> findGroupById(@PathVariable("id") long id) {
        return new ResponseEntity<>(groupService.findGroupById(id),HttpStatus.OK);
    }
    @DeleteMapping("/deleteGroup/{id}")
    public void deleteById(@PathVariable("id") long id){
        groupService.deleteGroup(id);
    }
}
