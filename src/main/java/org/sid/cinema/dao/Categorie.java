package org.sid.cinema.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor

public class Categorie implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String  name;

    @OneToMany(mappedBy = "categorie")
    private Collection<Film> films;
}

