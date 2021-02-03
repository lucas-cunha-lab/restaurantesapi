package academy.devdojo.youtube.course.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import academy.devdojo.youtube.course.Services.RestauranteService;
import academy.devdojo.youtube.course.domain.Restaurante;

@RestController
@RequestMapping(value = "/restaurantes")
public class RestauranteResource {
	
	@Autowired
	private RestauranteService service;
	
	@GetMapping(value = "/{tiposDeComida}")
	public ResponseEntity<Restaurante> findById(@PathVariable String tipoDeComida) {
		Restaurante obj = this.service.findByTipoDeComida(tipoDeComida);
		return ResponseEntity.ok().body(obj);
	}

}
