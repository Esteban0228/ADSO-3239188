package com.esteban.ReservasApplication.repository;

import com.esteban.ReservasApplication.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {}