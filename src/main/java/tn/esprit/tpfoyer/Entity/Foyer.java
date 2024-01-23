package tn.esprit.tpfoyer.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idFoyer;
     String nomFoyer;
     long capaciteFoyer;

    @ToString.Exclude
    @OneToOne(mappedBy = "foyer")
     Universite universite;

    @ToString.Exclude
    @OneToMany(mappedBy="foyer")
     Set<Bloc> blocs;

}
