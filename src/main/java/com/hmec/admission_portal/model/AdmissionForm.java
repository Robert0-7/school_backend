package com.hmec.admission_portal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
public class AdmissionForm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // --- MANDATORY FIELDS ---

    @NotBlank(message = "Student's name cannot be blank")
    private String studentName;

    @NotBlank(message = "Phone number is required")
    private String phone;

    // --- OPTIONAL FIELDS (Validation removed) ---

    private LocalDate dateOfBirth; // @NotNull and @Past removed

    private String grade; // @NotBlank removed

    private String parentName; // @NotBlank removed

    // We keep @Email to validate the format *if* a value is provided.
    @Email(message = "Please provide a valid email address")
    private String email; // @NotBlank removed

    private String address; // @NotBlank removed

    private String previousSchool;

    private String status = "PENDING";
}