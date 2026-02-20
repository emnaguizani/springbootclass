package tn.esprit.arctic.new_championat.services;

import tn.esprit.arctic.new_championat.entities.Sponsor;

import java.util.List;

public interface ISponsorService {
    Sponsor ajouterSponsor(Sponsor sponsor);

    List<Sponsor> ajouterSponsors(List<Sponsor> sponsors);

    Sponsor modifierSponsor(Sponsor sponsor);

    void supprimerSponsor(Long idSponsor);

    List<Sponsor> listSponsors();

    Sponsor recupererSponsor(Long idSponsor);

    Boolean archiverSponsor(Long idSponsor);
}
