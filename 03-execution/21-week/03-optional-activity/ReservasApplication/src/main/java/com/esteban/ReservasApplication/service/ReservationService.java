package com.esteban.ReservasApplication.service;

import com.esteban.ReservasApplication.model.Reservation;
import com.esteban.ReservasApplication.repository.ClientRepository;
import com.esteban.ReservasApplication.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;

    public ReservationService(ReservationRepository reservationRepository,
                              ClientRepository clientRepository) {
        this.reservationRepository = reservationRepository;
        this.clientRepository = clientRepository;
    }

    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    public Reservation save(Reservation reservation) {
        // Regla de negocio: no se crea una reserva si el cliente no existe
        if (reservation.getClient() == null
                || !clientRepository.existsById(reservation.getClient().getId())) {
            throw new IllegalArgumentException("El cliente no existe");
        }
        return reservationRepository.save(reservation);
    }
}