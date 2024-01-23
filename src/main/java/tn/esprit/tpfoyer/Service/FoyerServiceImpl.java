package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Foyer;
import tn.esprit.tpfoyer.Repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
 public class FoyerServiceImpl implements IfoyerService {

    FoyerRepository foyerRepository;
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }
    public Foyer retrieveFoyer(Long foyerId) {
        return foyerRepository.findById(foyerId).get();
    }
    public Foyer addFoyer(Foyer c) {
        return foyerRepository.save(c);
    }
    public void removeFoyer(Long foyerId) {
        foyerRepository.deleteById(foyerId);
    }
    public Foyer modifyFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }


}
