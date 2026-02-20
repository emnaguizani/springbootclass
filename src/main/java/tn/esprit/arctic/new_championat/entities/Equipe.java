package tn.esprit.arctic.new_championat.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipe {
    @Id
    private Long idEquipe;
    private String labelle;
    private Integer nbPoints;
    private Integer classementGeneral;
    @OneToMany
    private Set<Pilote> pilotes;
    @OneToMany
    private Set<Contrat> contrats;
}
