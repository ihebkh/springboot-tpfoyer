package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Chambre;
import tn.esprit.tpfoyer.Repository.ChambreRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
 public class ChambreServiceImpl implements IchambreService {

    ChambreRepository chambreRepository;
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }


    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId).get();
    }
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    // @Scheduled(fixedDelay = 10000) // 10000 millisecondes
     /*
    public List<Chambre> retrieveAllChambres() {
        List<Chambre> listC = chambreRepository.findAll();
        for (Chambre c: listC) {
            log.info("Chambre :" + c);
        }
        return listC;
    }

      */




}
