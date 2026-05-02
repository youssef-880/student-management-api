package com.example.studentmgmt.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity @Table(name = "students") @Data
public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name is required") private String name;
    @Email(message = "Invalid email") @NotBlank private String email;
    @Min(value = 1, message = "Age must be > 0") private Integer age;
}
