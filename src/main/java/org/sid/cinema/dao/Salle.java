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

public class Salle implements Serializable {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private int nombrePlace;

    @ManyToOne
    private  Cinema cinema;

    @OneToMany(mappedBy = "salle")
    private Collection<Place> places;

    @OneToMany(mappedBy = "salle")
    private Collection<Projection> projections;

}
