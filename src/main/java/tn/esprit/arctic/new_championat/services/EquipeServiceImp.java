package tn.esprit.arctic.new_championat.services;

import tn.esprit.arctic.new_championat.entities.Equipe;
import tn.esprit.arctic.new_championat.repositories.EquipeRepository;

public class EquipeServiceImp implements IEquipeService{
    EquipeRepository er;
    @Override
    public Equipe ajouterEquipe(Equipe equipe) {
        return er.save(equipe);
    }
}
