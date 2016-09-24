package com.tribles.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	SecurityConfiguration(){
		super();
		System.out.println("inside SecurityConfiguration cons...");
	}
	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception{
		System.out.println("inside configure of web security");
		httpSecurity.authorizeRequests().antMatchers("/").permitAll().and()
		            .authorizeRequests().antMatchers("/console/**").permitAll();
		
		 httpSecurity.csrf().disable();
	        httpSecurity.headers().frameOptions().disable();
	}
}
