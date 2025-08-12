package com.hmec.admission_portal.controller;

import com.hmec.admission_portal.model.AdmissionForm;
import com.hmec.admission_portal.repository.AdmissionFormRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admissions")
@CrossOrigin(origins = "*") // Allows requests from any frontend for development
public class AdmissionController {

    private final AdmissionFormRepository admissionFormRepository;

    // This is constructor injection - a modern best practice.
    public AdmissionController(AdmissionFormRepository admissionFormRepository) {
        this.admissionFormRepository = admissionFormRepository;
    }

    @PostMapping("/submit")
    public ResponseEntity<AdmissionForm> submitAdmissionForm(@Valid @RequestBody AdmissionForm form) {
        AdmissionForm savedForm = admissionFormRepository.save(form);
        return new ResponseEntity<>(savedForm, HttpStatus.CREATED);
    }
}