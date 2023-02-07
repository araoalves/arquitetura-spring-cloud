package br.com.fornecedor.jwt;

import br.com.fornecedor.clients.AuthenticationClient;
import br.com.fornecedor.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private String _body;

	@Autowired
	private AuthenticationClient authenticationClient;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		return null;
	}

	public UserDetails loadUserByUser() {
		User user = authenticationClient.getUser();
		return UserDetailsImpl.build(user);
	}
}
