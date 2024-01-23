package tn.esprit.tpfoyer.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idEtudiant;
     String nomEt;
     String prenomEt;
     long cin;
     String ecole;
     Date dateNaissance;
    @ToString.Exclude
    @ManyToMany(mappedBy="etudiants")
     Set<Reservation> reservations;
}
