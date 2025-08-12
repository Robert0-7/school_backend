package com.hmec.admission_portal.repository;

import com.hmec.admission_portal.model.AdmissionForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmissionFormRepository extends JpaRepository<AdmissionForm, Long> {
    // This interface remains empty.
    // Spring Data JPA automatically provides all the necessary methods like save(), findById(), etc.
}