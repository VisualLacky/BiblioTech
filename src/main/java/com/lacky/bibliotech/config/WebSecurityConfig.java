package com.lacky.bibliotech.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/about").permitAll()
                .antMatchers("/errors").permitAll()
                .antMatchers("/root").permitAll()

                .antMatchers("/books").permitAll()
                .antMatchers("/books/**").permitAll()

                .antMatchers("/readers").permitAll()
                .antMatchers("/readers/**").permitAll()

                .antMatchers("/manage").permitAll()
                .antMatchers("/db-reset-menu").permitAll()

                .antMatchers("/css/**").permitAll()
                .antMatchers("/resource/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout().
                permitAll();
    }

    @Override
    public void configure(WebSecurity web) {
        web
                .ignoring()
                .antMatchers("/resources/**", "/static/**", "/css/**", "/img/**");
    }

}
