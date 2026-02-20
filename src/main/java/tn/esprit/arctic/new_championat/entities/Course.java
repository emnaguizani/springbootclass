package tn.esprit.arctic.new_championat.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long idCourse;

    String emplacement;
    LocalDate dateCoure;
    @ManyToMany(mappedBy = "course")
    private Set<Championat> championat;
    @OneToMany(mappedBy ="course")
    private Set<Position> positions;
}
