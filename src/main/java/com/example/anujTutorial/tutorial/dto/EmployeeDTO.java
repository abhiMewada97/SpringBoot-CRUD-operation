package com.example.anujTutorial.tutorial.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long id = 12L;
    private String name = "Abh";
    private LocalDate dateOfJoining = LocalDate.of(2001,12,3);
    private boolean isActive = true;
}
