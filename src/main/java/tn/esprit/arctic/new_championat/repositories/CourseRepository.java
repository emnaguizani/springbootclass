package tn.esprit.arctic.new_championat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.arctic.new_championat.entities.Course;
import tn.esprit.arctic.new_championat.entities.Equipe;

public interface CourseRepository  extends JpaRepository<Course,Long> {
}
