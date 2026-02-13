package tn.esprit.arctic.new_championat.services;

import tn.esprit.arctic.new_championat.entities.Sponsor;
import tn.esprit.arctic.new_championat.repositories.SponsorRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class SponsorServiceImpe implements ISponsorService {
    SponsorRepository sp;

    @Override
    public Sponsor ajouterSponsor(Sponsor sponsor) {
        sponsor.setDateCreation(LocalDate.from(LocalDateTime.now()));
        sponsor.setArchived(false);
        sponsor.setBloquerContrat(false);
        return (sp.save(sponsor));
    }

    @Override
    public List<Sponsor> ajouterSponsors(List<Sponsor> sponsors) {
        sponsors.forEach(sponsor -> {
            sponsor.setDateCreation(LocalDate.from(LocalDateTime.now()));
            sponsor.setArchived(false);
            sponsor.setBloquerContrat(false);
        });
        return (sp.saveAll(sponsors));
    }

    @Override
    public Sponsor modifierSponsor(Sponsor sponsor) {
        sponsor.setDateDerniereModification(LocalDate.from(LocalDateTime.now()));
        return sp.save(sponsor);
    }

    @Override
    public void supprimerSponsor(Long idSponsor) {
        sp.deleteById(idSponsor);
    }

    @Override
    public List<Sponsor> listSponsors() {

        return sp.findAll();
    }

    @Override
    public Sponsor recupererSponsor(Long idSponsor) {
        return sp.findById(idSponsor).orElse(null);
    }

    @Override
    public Boolean archiverSponsor(Long idSponsor) {
        Sponsor sponsor = sp.findById(idSponsor).orElse(null);
        if (sponsor == null) {
            return false;
        }
        sponsor.setArchived(Boolean.TRUE);
        sp.save(sponsor);
        return sponsor.getArchived();
    }
}
