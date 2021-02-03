package academy.devdojo.youtube.course.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import academy.devdojo.youtube.course.Services.UsuarioService;
import academy.devdojo.youtube.course.domain.Usuario;

@Service
public class JwtUserDetailsService implements UserDetailsService{
	
	@Autowired
    private UsuarioService usuarioService;

	@Override
	public UserDetails loadUserByUsername(Integer id) throws UsernameNotFoundException {
		Usuario user = usuarioService.getId(id);
		
		if (user.getId().equals(id)) {
			return new User(email, user.getPassword(),
					new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with Id: " + id);
		}
	}
}
