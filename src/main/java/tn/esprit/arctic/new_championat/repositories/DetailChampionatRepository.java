package tn.esprit.arctic.new_championat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.new_championat.entities.DetailChampionat;
import tn.esprit.arctic.new_championat.entities.Equipe;

public interface DetailChampionatRepository  extends JpaRepository<DetailChampionat,String> {
}
