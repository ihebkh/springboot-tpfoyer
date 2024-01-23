package tn.esprit.tpfoyer.Service;


import tn.esprit.tpfoyer.Entity.Universite;

import java.util.List;

public interface IuniversiteService {
    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long universiteId);
    public Universite addUniversite(Universite c);
    public void removeUniversite(Long universiteId);
    public Universite modifyUniversite(Universite universite);
}
