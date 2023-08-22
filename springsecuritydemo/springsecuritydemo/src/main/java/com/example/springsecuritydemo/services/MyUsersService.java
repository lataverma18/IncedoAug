package com.example.springsecuritydemo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springsecuritydemo.entities.MyUsers;
import com.example.springsecuritydemo.repository.MyUsersRepository;
@Service
public class MyUsersService implements UserDetailsService
{
	@Autowired
	MyUsersRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	 Optional<MyUsers> op=	ur.findById(username);
	 if(op.isPresent())
	 {
		 Principal p=new Principal(op.get());
		 return p;
	 }
	 else
		throw new UsernameNotFoundException("No User Found!!!");
	}
	
}
