package com.hcl.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration

@EnableWebSecurity

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override

	protected void configure(AuthenticationManagerBuilder auth)

			throws Exception {

	}

	@Override

	protected void configure(HttpSecurity http) throws Exception {

		http.csrf().disable().authorizeRequests().anyRequest().permitAll();

	}

	@Override

	public void configure(WebSecurity web) throws Exception {

		web

				.ignoring()

				.antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/images/**");

	}

}