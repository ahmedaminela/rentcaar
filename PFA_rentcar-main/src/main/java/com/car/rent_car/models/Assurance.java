package com.car.rent_car.models;

import jakarta.persistence.*;
import lombok.*;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data

public class Assurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private Date date_fin;
    private Double prix_assurance;
    
    @OneToOne
    @JoinColumn(name = "voiture_id")
    private Voiture voiture;

    // Other fields, getters, setters, and constructors

}
