package com.example.anujTutorial.tutorial.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
    private Long id;
    private String name;
    private LocalDate dateOfJoining;
    private boolean isActive;
}
