package com.rcotrina.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	@Bean
	public BCryptPasswordEncoder passwordCodifica() {
		
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder encoder = passwordCodifica();
		UserBuilder usuarios = User.builder().passwordEncoder(password ->{return encoder.encode(password);});
		auth.inMemoryAuthentication()
		.withUser(usuarios.username("Administrador").password("123").roles("ADMIN","USER"))
		.withUser(usuarios.username("iDestroyer").password("123").roles("USER"))
		.withUser(usuarios.username("Renato").password("123").roles("ADMIN","USER"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/","/css/**","/js/**","/imagenes/**","/webfonts/**").permitAll()
		.anyRequest().authenticated()
		.and().formLogin().loginPage("/").defaultSuccessUrl("/principal/").permitAll()
		.and().logout().permitAll();
	}
	
	
	
	

}
