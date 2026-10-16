package com.esteban.ReservasApplication.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typeDocument;
    private String document;
    private String name;
    private String address;
    private String phone;
    private String email;
}