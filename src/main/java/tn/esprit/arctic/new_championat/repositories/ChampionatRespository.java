package tn.esprit.arctic.new_championat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.new_championat.entities.Championat;


public interface ChampionatRespository extends JpaRepository<Championat,Long> {
}
