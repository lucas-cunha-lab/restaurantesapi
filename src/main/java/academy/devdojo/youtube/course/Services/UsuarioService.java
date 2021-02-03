package academy.devdojo.youtube.course.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import academy.devdojo.youtube.course.domain.Usuario;
import academy.devdojo.youtube.course.exception.ObjectNotFoundException;
import academy.devdojo.youtube.course.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario findById(Integer id) {

		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id:" + id + ", Tipo: " + Usuario.class.getName()));
	}
}
