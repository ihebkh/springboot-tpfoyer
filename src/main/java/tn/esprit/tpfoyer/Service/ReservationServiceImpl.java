package tn.esprit.tpfoyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entity.Reservation;
import tn.esprit.tpfoyer.Repository.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
 public class ReservationServiceImpl implements IreservationService {

    ReservationRepository reservationRepository;
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }
    public Reservation retrieveReservation(String reservationId) {
        return reservationRepository.findById(reservationId).get();
    }
    public Reservation addReservation(Reservation c) {
        return reservationRepository.save(c);
    }
    public void removeReservation(String reservationId) {
        reservationRepository.deleteById(reservationId);
    }
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
