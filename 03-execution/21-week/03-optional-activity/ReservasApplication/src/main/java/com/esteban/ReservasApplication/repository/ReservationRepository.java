package com.esteban.ReservasApplication.repository;

import com.esteban.ReservasApplication.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {}