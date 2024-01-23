package tn.esprit.tpfoyer.Service;


import tn.esprit.tpfoyer.Entity.Foyer;

import java.util.List;

public interface IfoyerService {
    public List<Foyer> retrieveAllFoyers();
    public Foyer retrieveFoyer(Long foyerId);
    public Foyer addFoyer(Foyer c);
    public void removeFoyer(Long foyerId);
    public Foyer modifyFoyer(Foyer foyer);
    public void assignFoyerToBloc(Long foyerId, Long BlocId);

}
