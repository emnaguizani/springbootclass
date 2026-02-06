package tn.esprit.arctic.new_championat.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class DetailChampionat {
    @Id
    String code;
    String description;
    @OneToOne(mappedBy = "ChampionatDetail")
    private Championat championat;
}
