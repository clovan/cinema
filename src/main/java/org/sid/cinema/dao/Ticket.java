package org.sid.cinema.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class Ticket implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String  nomClient;

    private double prix;

    @Column(unique = true)
    private int codePayement;

    private  boolean reserve;

    @ManyToOne()
    private  Place place;

    @ManyToOne
    private Projection projection;
}
