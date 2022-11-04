package com.procesos.negocio.joseph.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

import javax.annotation.security.PermitAll;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig {
        @Bean
        protected SecurityFilterChain filterChain(HttpSecurity http) throws  Exception{
            http.cors().and().csrf().disable()
                    .authorizeRequests()
                    //.antMatchers("/**").permitAll()
                    .antMatchers(HttpMethod.POST,"/usuario").permitAll()
                    .antMatchers(HttpMethod.POST,"/auth/login").permitAll()
                    .anyRequest().permitAll();
            return http.build();
        }

    }
