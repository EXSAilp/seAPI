package se.project.API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.project.API.model.Students;
import se.project.API.service.StudentService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Students> getAll() {
        return service.getAll();
    }
    @PostMapping
    public Students create(@RequestBody Students students) {
        return service.create(students);
    }

    @PutMapping
    public Students update(@RequestBody Students students) {
        return service.update(students);
    }

    @DeleteMapping("/delete/{id}")
    public Students delete(@PathVariable UUID id) {
        return service.delete(id);
    }

    @GetMapping("/{id}")
    public Students getStudentById(@PathVariable UUID id) {
        return service.getStudentById(id);
    }

    @GetMapping("/id/{sID}")
    public List<Students> getScoreById(@PathVariable String sID) {
        return service.getByStudentID(sID);
    }

    @GetMapping("/name/{name}")
    public Students getStudentByName(@PathVariable String name) {
        return service.getStudentByName(name);
    }
}
