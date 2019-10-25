package com.subu2code.expenses_tracker.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {


	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		UserBuilder users = User.withDefaultPasswordEncoder();
		
		auth.inMemoryAuthentication()
		.withUser(users.username("subu").password("qwert").roles("User"))
		.withUser(users.username("suresh").password("asdf").roles("User"))
		.withUser(users.username("admin").password("admin").roles("Admin"));
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/").permitAll()
		.antMatchers("/income").hasAnyRole("User","Admin")
		.antMatchers("/expense").hasAnyRole("User","Admin")
		.antMatchers("/expenseCategory").hasAnyRole("User","Admin")
		.antMatchers("/incomeCategory").hasAnyRole("User","Admin")
		.antMatchers("/spend").hasAnyRole("User","Admin")
		.antMatchers("/login").permitAll()
		.antMatchers("/signup").permitAll()
		.and()
			.formLogin().loginPage("/login")
			.loginProcessingUrl("/authenticateUser")
			.defaultSuccessUrl("/").permitAll()		
		.and()
			.logout().logoutUrl("/logout")
			.logoutSuccessUrl("/").permitAll(); 
	}
	

}
