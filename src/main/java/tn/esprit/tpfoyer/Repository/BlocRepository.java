package tn.esprit.tpfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyer.Entity.Bloc;
import tn.esprit.tpfoyer.Entity.Chambre;
import tn.esprit.tpfoyer.Entity.TypeChambre;

import java.util.List;

public interface BlocRepository extends JpaRepository<Bloc, Long> {


}
