package tn.esprit.tpfoyer.Service;


import tn.esprit.tpfoyer.Entity.Reservation;

import java.util.List;

public interface IreservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(String idReservation);
    public Reservation addReservation(Reservation c);
    public void removeReservation(String idReservation);
    public Reservation modifyReservation(Reservation reservation);
}
