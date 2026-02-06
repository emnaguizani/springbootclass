package tn.esprit.arctic.new_championat.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Position {
    @Id
    Long idPosition;
    Integer classement;
    Integer nbPoints;
    @ManyToOne
    Course course;
    @ManyToOne
    Pilote pilote;
}
