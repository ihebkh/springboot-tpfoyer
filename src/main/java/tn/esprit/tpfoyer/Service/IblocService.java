package tn.esprit.tpfoyer.Service;


import tn.esprit.tpfoyer.Entity.Bloc;

import java.util.List;

public interface IblocService {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long blocId);
    public Bloc addBloc(Bloc c);
    public void removeBloc(Long blocId);
    public Bloc modifyBloc(Bloc bloc);
    public Bloc addFoyerAndBlocAndAssign(Bloc bloc);

}
