package tn.esprit.tpfoyer.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level=AccessLevel.PRIVATE)

public class Chambre {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    long idChambre ;
    Long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeC;
    @ToString.Exclude
    @ManyToOne
     Bloc bloc;
    @ToString.Exclude
    @OneToMany
     Set<Reservation> reservations;



}
