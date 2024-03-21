package net.achraf.demojpa.demojpa;

import net.achraf.demojpa.demojpa.entities.Patient;
import net.achraf.demojpa.demojpa.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemoJpaApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null, "Benn", new Date(), true, 500));
        patientRepository.save(new Patient(null, "Gil", new Date(), false, 440));
        patientRepository.save(new Patient(null, "john", new Date(), false, 600));
        List<Patient> patients = patientRepository.findAll();
        patients.forEach(patient -> {
            System.out.println(patient.toString());
        });

        Patient patient=patientRepository.findById(Long.valueOf(1)).get();
        System.out.println("***************");
        System.out.println(patient.getId());
        System.out.println(patient.getNom());
        System.out.println(patient.getDateNaissance());
        System.out.println(patient.getScore());
        System.out.println("***************");

        patientRepository.deleteById(Long.valueOf(2));
        }

    }
