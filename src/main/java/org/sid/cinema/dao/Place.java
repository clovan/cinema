package org.sid.cinema.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collection;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class Place implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long Id;
    private  int numero;
    private  double longitude, latitude, altitude;

    @ManyToOne
    private Salle salle;


@OneToMany(mappedBy = "place")
    private Collection<Ticket>tickets;
}
