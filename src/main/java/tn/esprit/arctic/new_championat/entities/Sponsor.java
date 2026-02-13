package tn.esprit.arctic.new_championat.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Sponsor {
    @Id
    private int idSponsor;
    private String nom;
    private String pays;
    private String budgetAnnuel;
    private Boolean bloquerContrat;
    Boolean archived;
    LocalDate dateCreation;
    LocalDate dateDerniereModification;
    @OneToMany
    private Set<Contrat> Contrat;

}
