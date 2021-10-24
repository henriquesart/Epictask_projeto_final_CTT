package br.com.fiap.epictask.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.fiap.epictask.model.Account;
import br.com.fiap.epictask.repository.AccountRepository;

@Service
public class AuthenticationService implements UserDetailsService {
	
	@Autowired
	private AccountRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Account> user = repository.findByEmail(username);
		if(user.isEmpty()) throw new UsernameNotFoundException("user not found");
		return user.get();
	}

	public static PasswordEncoder getPasswordEnconder() {
		return new BCryptPasswordEncoder();
	}

}
