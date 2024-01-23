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

public class Reservation {
    @Id
     String idReservation;
     Date anneeUniversitaire;
     Boolean estValide;
    @ToString.Exclude
    @ManyToMany
     Set<Etudiant> etudiants;
}