package tn.esprit.tpfoyer.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idChambre;
     String nomUniversite;
      long capaciteFoyer ;
    @ToString.Exclude
    @OneToOne
     Foyer foyer;
}