package tn.esprit.arctic.new_championat.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idCourse;
    String emplacement;
    LocalDate dateCoure;
    @ManyToMany(mappedBy = "course")
    private Set<Championat> championat;
    @OneToMany
    private Set<Position> positions;
}
