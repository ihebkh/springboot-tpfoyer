package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Universite;
import tn.esprit.tpfoyer.Repository.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
 public class UniversiteServiceImpl implements IuniversiteService {

    UniversiteRepository universiteRepository;
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }
    public Universite retrieveUniversite(Long universiteId) {
        return universiteRepository.findById(universiteId).get();
    }
    public Universite addUniversite(Universite c) {
        return universiteRepository.save(c);
    }
    public void removeUniversite(Long universiteId) {
        universiteRepository.deleteById(universiteId);
    }
    public Universite modifyUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
}
