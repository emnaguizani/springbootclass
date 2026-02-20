package tn.esprit.arctic.new_championat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.new_championat.entities.Position;

public interface PositionRepository  extends JpaRepository<Position,Long> {
}
