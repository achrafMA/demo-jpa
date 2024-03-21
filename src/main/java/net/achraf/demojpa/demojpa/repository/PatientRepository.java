package net.achraf.demojpa.demojpa.repository;

import net.achraf.demojpa.demojpa.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
