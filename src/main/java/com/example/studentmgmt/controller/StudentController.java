package com.example.studentmgmt.controller;
import com.example.studentmgmt.model.Student;
import com.example.studentmgmt.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController @RequestMapping("/api/students")
public class StudentController {
    @Autowired private StudentService service;
    @GetMapping public List<Student> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public Student getById(@PathVariable Long id) { return service.getById(id); }
    @PostMapping public Student create(@Valid @RequestBody Student s) { return service.create(s); }
    @PutMapping("/{id}") public Student update(@PathVariable Long id, @Valid @RequestBody Student s) { return service.update(id, s); }
    @DeleteMapping("/{id}") public void delete(@PathVariable Long id) { service.delete(id); }
}
