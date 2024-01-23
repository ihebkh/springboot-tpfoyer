package tn.esprit.tpfoyer.Control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entity.Reservation;
import tn.esprit.tpfoyer.Service.IreservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
    IreservationService reservationService;

    // http://localhost:8080/tpfoyer/reservation/retrieve-all-reservations
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        List<Reservation> listReservations = reservationService.retrieveAllReservations();
        return listReservations;
    }

    // http://localhost:8080/tpfoyer/reservation/retrieve-reservation/8
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") String chId) {
        Reservation reservation = reservationService.retrieveReservation(chId);
        return reservation;
    }


    //http://localhost:8080/tpfoyer/reservation/add-reservation
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation c) {
        Reservation reservation = reservationService.addReservation(c);
        return reservation;
    }

    // http://localhost:8080/tpfoyer/reservation/remove-reservation/{reservation-id}
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String chId) {
        reservationService.removeReservation(chId);
    }
    // http://localhost:8080/tpfoyer/reservation/modify-reservation
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation c) {
        Reservation reservation = reservationService.modifyReservation(c);
        return reservation;
    }


}
