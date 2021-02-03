package academy.devdojo.youtube.course.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academy.devdojo.youtube.course.domain.Restaurante;
import academy.devdojo.youtube.course.domain.Usuario;
import academy.devdojo.youtube.course.exception.ObjectNotFoundException;
import academy.devdojo.youtube.course.repository.RestauranteRepository;

@Service
public class RestauranteService {

	
	@Autowired
	RestauranteRepository restauranteRepository;
	
	public Restaurante findByTipoDeComida(String tipoDeComida) {
		Optional<Restaurante> obj = restauranteRepository.findById(tipoDeComida);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id:" + tipoDeComida + ", Tipo: " + Usuario.class.getName()));
	}
}
