package tn.esprit.tpfoyer.Service;


import tn.esprit.tpfoyer.Entity.Etudiant;

import java.util.List;

public interface IetudiantService {
    public List<Etudiant> retrieveAllEtudiants();
    public Etudiant retrieveEtudiant(Long etudiantId);
    public Etudiant addEtudiant(Etudiant c);
    public void removeEtudiant(Long etudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}
