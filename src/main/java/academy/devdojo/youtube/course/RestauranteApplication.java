package academy.devdojo.youtube.course;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import academy.devdojo.youtube.course.domain.Restaurante;
import academy.devdojo.youtube.course.domain.Usuario;
import academy.devdojo.youtube.course.repository.RestauranteRepository;
import academy.devdojo.youtube.course.repository.UsuarioRepository;

@SpringBootApplication
public class RestauranteApplication implements CommandLineRunner{


	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RestauranteRepository restauranteRepository;	

	public static void main(String[] args) {
		SpringApplication.run(RestauranteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Valdir Cezar", "valdir", "123");
		Usuario u2 = new Usuario(null, "Albert Einstein", "albert", "123");
		
		Restaurante r1 = new Restaurante("Parmegiana Center","Italiana","Filé de peixe a parmegiana","delicioso filé de peixe com molho de tomate natural","suco de laranja, suco de melancia, coca-cola, sprite" );
		Restaurante r2 = new Restaurante("Japa's Food","Japonesa","Sushi, Yakissoba","delicioso Yakisoba com cogumelos e frango","suco de laranja, suco de melancia, coca-cola, sprite" );
		Restaurante r3 = new Restaurante("Asalamaleikon arabe","Arabe","Filé Arabe","delicioso filé arabe com parcas","suco de laranja, suco de melancia, coca-cola, sprite" );
		
		
		restauranteRepository.saveAll(Arrays.asList(r1, r2, r3));
		usuarioRepository.saveAll(Arrays.asList(u1, u2));
		
	}


}
