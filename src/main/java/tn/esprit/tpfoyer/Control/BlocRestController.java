package tn.esprit.tpfoyer.Control;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Bloc;
import tn.esprit.tpfoyer.Service.IblocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Bloc")
public class BlocRestController {
    IblocService blocService;

    // http://localhost:8080/tpfoyer/Bloc/retrieve-all-blocs
    @GetMapping("/retrieve-all-bloc")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocService.retrieveAllBlocs();
        return listBlocs;
    }

    // http://localhost:8080/tpfoyer/Bloc/retrieve-Bloc/8
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("Bloc-id") Long chId) {
        Bloc Bloc = blocService.retrieveBloc(chId);
        return Bloc;
    }


    //http://localhost:8080/tpfoyer/Bloc/add-Bloc
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc c) {
        Bloc Bloc = blocService.addBloc(c);
        return Bloc;
    }

    // http://localhost:8080/tpfoyer/Bloc/remove-Bloc/{Bloc-id}
    @DeleteMapping("/remove-Bloc/{Bloc-id}")
    public void removeBloc(@PathVariable("Bloc-id") Long chId) {
        blocService.removeBloc(chId);
    }
    // http://localhost:8080/tpfoyer/Bloc/modify-Bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc c) {
        Bloc Bloc = blocService.modifyBloc(c);
        return Bloc;
    }
    @Operation(description = "1")
    //http://localhost:8089/tp8/bloc/ajouter-bloc-et-bloc-detail
    @PostMapping("/ajouter-bloc-et-bloc-detail")
    public Bloc addBlocAndBlocDetail(@RequestBody Bloc b) {
        Bloc bloc = blocService.addFoyerAndBlocAndAssign(b);
        return bloc;
    }


}
