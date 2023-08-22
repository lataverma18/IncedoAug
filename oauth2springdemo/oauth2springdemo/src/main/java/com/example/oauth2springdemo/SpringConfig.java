package com.example.oauth2springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringConfig {
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
	{
		return http.authorizeHttpRequests(auth->{
			auth.requestMatchers("/casual").permitAll();
			auth.requestMatchers("/secured").authenticated();
		})
		.oauth2Login(Customizer.withDefaults())
		.formLogin(Customizer.withDefaults()).
		build();
	}

}
