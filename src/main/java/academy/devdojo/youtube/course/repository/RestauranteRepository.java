package academy.devdojo.youtube.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import academy.devdojo.youtube.course.domain.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, String> {

}
