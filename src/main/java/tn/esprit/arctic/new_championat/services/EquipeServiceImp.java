package tn.esprit.arctic.new_championat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic.new_championat.entities.Equipe;
import tn.esprit.arctic.new_championat.repositories.EquipeRepository;
@Service
@AllArgsConstructor
public class EquipeServiceImp implements IEquipeService{
    EquipeRepository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }
}
