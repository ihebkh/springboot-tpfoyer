package tn.esprit.tpfoyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entity.Chambre;
import tn.esprit.tpfoyer.Entity.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findAllByTypeC(TypeChambre tc);
    Chambre findChambreByNumeroChambre(long numC);
}

