package tn.esprit.arctic.new_championat.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.Set;

@Entity
public class Sponsor {
    @Id
    private int idSponsor;
    private String nom;
    private String pays;
    private String budgetAnnuel;
    private Boolean bloquerContrat;
    @OneToMany
    private Set<Contrat> Contrat;

}
