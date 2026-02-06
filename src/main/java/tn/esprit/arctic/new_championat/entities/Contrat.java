package tn.esprit.arctic.new_championat.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Contrat {
    @Id
    private int idContrat;
    private Float montant;
    private String annee;
    private boolean achived;
    @ManyToOne
    Equipe equipe;
    @ManyToOne
    Sponsor sponsor;
}
