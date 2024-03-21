package net.achraf.demojpa.demojpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.aot.generate.GeneratedTypeReference;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
public class Patient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private Date dateNaissance;
    private boolean malade;
    private int score;
}
