package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Etudiant;
import tn.esprit.tpfoyer.Repository.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
 public class EtudiantServiceImpl implements IetudiantService {

    EtudiantRepository etudiantRepository;
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }
    public Etudiant retrieveEtudiant(Long etudiantId) {
        return etudiantRepository.findById(etudiantId).get();
    }
    public Etudiant addEtudiant(Etudiant c) {
        return etudiantRepository.save(c);
    }
    public void removeEtudiant(Long etudiantId) {
        etudiantRepository.deleteById(etudiantId);
    }
    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
