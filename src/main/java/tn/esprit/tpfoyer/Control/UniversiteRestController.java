package tn.esprit.tpfoyer.Control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Universite;
import tn.esprit.tpfoyer.Service.IuniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteRestController {
    IuniversiteService universiteService;

    // http://localhost:8080/tpfoyer/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }

    // http://localhost:8080/tpfoyer/universite/retrieve-universite/8
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long chId) {
        Universite universite = universiteService.retrieveUniversite(chId);
        return universite;
    }


    //http://localhost:8080/tpfoyer/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite c) {
        Universite universite = universiteService.addUniversite(c);
        return universite;
    }

    // http://localhost:8080/tpfoyer/universite/remove-universite/{universite-id}
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long chId) {
        universiteService.removeUniversite(chId);
    }
    // http://localhost:8080/tpfoyer/universite/modify-universite
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite c) {
        Universite universite = universiteService.modifyUniversite(c);
        return universite;
    }


}
