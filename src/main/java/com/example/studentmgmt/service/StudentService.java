package com.example.studentmgmt.service;

import com.example.studentmgmt.model.Student;
import com.example.studentmgmt.repository.StudentRepository;
import com.example.studentmgmt.exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo; // This MUST be named 'repo' to match your lines

    public List<Student> getAll() { 
        return repo.findAll(); 
    }

    public Student getById(Long id) { 
        return repo.findById(id).orElseThrow(() -> new StudentNotFoundException("Student not found: " + id)); 
    }

    public Student create(Student s) { 
        return repo.save(s); 
    }

    public Student update(Long id, Student s) {
        Student existing = getById(id);
        existing.setName(s.getName());
        existing.setEmail(s.getEmail());
        existing.setAge(s.getAge());
        return repo.save(existing);
    }

    public void delete(Long id) { 
        repo.delete(getById(id)); 
    }
}
