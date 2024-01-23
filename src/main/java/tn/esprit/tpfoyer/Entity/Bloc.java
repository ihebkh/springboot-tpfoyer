package tn.esprit.tpfoyer.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.engine.internal.Cascade;

import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long idBloc;
     String nomBloc;

     long capaciteBloc;

    @ToString.Exclude
    @ManyToOne(cascade = CascadeType.ALL)
     Foyer foyer;
    @ToString.Exclude
    @OneToMany(mappedBy="bloc")
     Set<Chambre> chambres;
}