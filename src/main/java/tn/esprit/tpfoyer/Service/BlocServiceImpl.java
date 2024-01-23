package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Bloc;
import tn.esprit.tpfoyer.Entity.Chambre;
import tn.esprit.tpfoyer.Entity.Foyer;
import tn.esprit.tpfoyer.Repository.BlocRepository;
import tn.esprit.tpfoyer.Repository.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
 public class BlocServiceImpl implements IblocService {

    BlocRepository blocRepository;
   FoyerRepository foyerRepository;
    /*public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

     */
    @Scheduled(fixedDelay = 5000)
    public List<Bloc> retrieveAllBlocs() {
     //   log.info("In method retrieveAllBlocs : ");
        List<Bloc> listB = blocRepository.findAll();
        log.info("nombre total des chambre :"+listB.size());
        for (Bloc B: listB) {
            log.info("Bloc :" +B);
        }
     //   log.info("out of method retrieveAllBlocs : ");
        return listB;
    }
    public Bloc retrieveBloc(Long blocId) {
        return blocRepository.findById(blocId).get();
    }
    public Bloc addBloc(Bloc c) {
        return blocRepository.save(c);
    }
    public void removeBloc(Long blocId) {
        blocRepository.deleteById(blocId);
    }
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
    public Bloc addFoyerAndBlocAndAssign(Bloc bloc) {
        return blocRepository.save(bloc);
    }
    public void assignBlocToFoyer(Long BlocId, Long FoyerId) {
        Bloc bloc = blocRepository.findById(BlocId).get();
        Foyer foyer = foyerRepository.findById(FoyerId).get();
// on set le fils dans le parent :
        foyer.getBlocs().add(bloc);
        foyerRepository.save(foyer);
    }

}
