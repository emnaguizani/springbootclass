package tn.esprit.arctic.new_championat.entities;

import jakarta.persistence.*;
import org.springframework.stereotype.Controller;

import java.util.Set;

@Entity

public class Championat {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idChampionat;
    private Catergorie Categorie;
    private String LibelleC;
    private Integer annee;
    @OneToOne
    private DetailChampionat ChampionatDetail;
    @ManyToMany
    private Set<Course> course;
}
