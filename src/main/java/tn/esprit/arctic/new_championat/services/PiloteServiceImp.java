package tn.esprit.arctic.new_championat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.new_championat.entities.Pilote;
import tn.esprit.arctic.new_championat.repositories.PiloteRepository;
@Service
@AllArgsConstructor
public class PiloteServiceImp implements IPiloteService {
    PiloteRepository pr;
    @Override
    public String addPilote(Pilote p) {
         pr.save(p);
         return "Pilote added";
    }
}
