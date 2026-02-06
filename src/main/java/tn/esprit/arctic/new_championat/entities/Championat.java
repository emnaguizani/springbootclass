package tn.esprit.arctic.new_championat.entities;

import jakarta.persistence.*;

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
    private DetailChampionat detailChampionat;
    @ManyToMany
    private Set<Course> course;
}
