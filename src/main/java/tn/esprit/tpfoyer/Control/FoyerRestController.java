package tn.esprit.tpfoyer.Control;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Foyer;
import tn.esprit.tpfoyer.Service.IfoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {
    IfoyerService foyerService;

    // http://localhost:8080/tpfoyer/foyer/retrieve-all-foyers
    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = foyerService.retrieveAllFoyers();
        return listFoyers;
    }

    // http://localhost:8080/tpfoyer/foyer/retrieve-foyer/8
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long chId) {
        Foyer foyer = foyerService.retrieveFoyer(chId);
        return foyer;
    }


    //http://localhost:8080/tpfoyer/foyer/add-foyer
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer c) {
        Foyer foyer = foyerService.addFoyer(c);
        return foyer;
    }

    // http://localhost:8080/tpfoyer/foyer/remove-foyer/{foyer-id}
    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long chId) {
        foyerService.removeFoyer(chId);
    }
    // http://localhost:8080/tpfoyer/foyer/modify-foyer
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer c) {
        Foyer foyer = foyerService.modifyFoyer(c);
        return foyer;
    }
    @Operation(description = "2")
    // http://localhost:8089/tp8/projet/affecter-projet-detail-a-projets/1/1
    @PutMapping("/affecter_bloc_açfoyer/{foyer-id}/{bloc-id}")
    public void affecterbloctofoyer(@PathVariable("foyer-id") Long proejtId,
                                             @PathVariable("bloc-id") Long proejtDetailsId) {
        projetService.assignProjetDetailToProjet(proejtId, proejtDetailsId);
    }







}
