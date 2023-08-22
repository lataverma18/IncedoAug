package com.example.springsecuritydemo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.springsecuritydemo.services.MyUsersService;

@SpringBootApplication
@EnableWebSecurity
public class SpringsecuritydemoApplication {
	@Autowired
	MyUsersService myUsersService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringsecuritydemoApplication.class, args);
	}

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
	http.authorizeHttpRequests((authorize) -> authorize
				.requestMatchers("/casual").permitAll()
			.requestMatchers("/secured").hasAnyRole("ADMIN"));
	
		return http.formLogin(Customizer.withDefaults()).build();
	}
	@Bean
	PasswordEncoder getPasswordEncoder()
	{
		return NoOpPasswordEncoder.getInstance();
	}
	@Bean
	public AuthenticationProvider authenticationProvider()
	{
		DaoAuthenticationProvider ap=new DaoAuthenticationProvider();
		ap.setUserDetailsService(myUsersService);
		ap.setPasswordEncoder(getPasswordEncoder());
		return ap;
	}
}
