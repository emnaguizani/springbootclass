package tn.esprit.arctic.new_championat.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Pilote {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idPilote;
    private String libellePilote;
    private Integer nbPointsTotal;
    private Integer classEmementGeneral;
    private Catergorie catergorie;
    @OneToMany
    private Set<Position> positions;
    @ManyToOne
    Equipe equipe;
}
