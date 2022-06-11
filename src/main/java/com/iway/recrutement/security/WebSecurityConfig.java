package com.iway.recrutement.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;

import com.iway.recrutement.model.Role;

import java.util.Arrays;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors().configurationSource(
                request -> {
                    CorsConfiguration cors = new CorsConfiguration();
                    cors.setAllowedMethods(
                            Arrays.asList(
                                    HttpMethod.GET.name(),
                                    HttpMethod.POST.name(),
                                    HttpMethod.PUT.name(),
                                    HttpMethod.DELETE.name()
                            ));
                    cors.applyPermitDefaultValues();
                    return cors;
                }).and()
                .csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        /*
            ROLE_RH,
			ROLE_RESPONSABLE_RECRUTEMENT,
			ROLE_RESPONSABLE_ENTRETIEN,
			ROLE_CANDIDAT,
			ROLE_MANAGER;
         */
        
        
        // Entry points
        
        http.authorizeRequests()//
                .antMatchers("/signup").permitAll()//
                .antMatchers("/login").permitAll()//
                .antMatchers("/offres_candidat").permitAll()//
                .antMatchers("/candidats").hasAnyAuthority(Role.ROLE_MANAGER.getAuthority())
                .antMatchers("/candidats/**").hasAnyAuthority(Role.ROLE_MANAGER.getAuthority())
                .antMatchers("/candidature_Spontanees/**").permitAll()
                .antMatchers("/candidatures/**").permitAll()
                .antMatchers("/candidatures").permitAll()
                .antMatchers("/entretiens/*").permitAll()//
                .antMatchers("/entretiens/**").hasAnyAuthority(Role.ROLE_MANAGER.getAuthority())
                .antMatchers("/offres_landingPage/**").permitAll()//
                
                .antMatchers("/candidats/status/*").permitAll()
                .antMatchers("/h2-console/**/**").permitAll()
                .antMatchers("/public/**","/**.js","/**.css","/**.ico","/**.otf","/assets/**", "/resources/**","/resources/**/**","/resources/static/**","/resources/static/**/**","/resources/reports/**").permitAll()
                .antMatchers("/offres/**").hasAnyAuthority(Role.ROLE_MANAGER.getAuthority())
                //  .antMatchers("/api/users/find_all").hasAnyAuthority(Role.ROLE_RESPONSABLE_RECRUTEMENT.getAuthority(),Role.ROLE_MANAGER.getAuthority())
                //  .antMatchers("/api/users/find_all").hasAnyAuthority(Role.ROLE_RH.getAuthority())
                //  .antMatchers("/api/users/find_all").hasAnyAuthority(Role.ROLE_RESPONSABLE_ENTRETIEN.getAuthority())
                //  .antMatchers("/api/users/find_all").hasAnyAuthority(Role.ROLE_RESPONSABLE_RECRUTEMENT.getAuthority())
                //.antMatchers("/candidature_Spontanees_candidat/{id}").hasAnyAuthority(Role.ROLE_CANDIDAT.getAuthority())

//                .antMatchers("/api/**").access("hasRole(ROLE_DIRECTION) or hasRole(ROLE_ADMINISTRATION)")
                // Disallow everything else..
                .anyRequest().authenticated();

        // If a user try to access a resource without having enough permissions
//        http.exceptionHandling().accessDeniedPage("/login");

        // Apply JWT
        http.apply(new JwtTokenFilterConfigurer(jwtTokenProvider));
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        // Allow swagger to be accessed without authentication
        web.ignoring()
                .antMatchers("/v2/api-docs")//
//                .antMatchers("/swagger-resources/**")//
//                .antMatchers("/swagger-ui.html")//
                .antMatchers("/configuration/**")//
                .antMatchers("/webjars/**")//
                .antMatchers("/public")

                // Un-secure H2 Database (for testing purposes, H2 console shouldn't be unprotected in production)
                .and()
                .ignoring()
                .antMatchers("/h2-console/**/**")
                .antMatchers("/resources/**/**");
    }

//gc-front/dist/1.c6e2e95af9e4608f6502.js
    @Bean
    public AuthenticationManager customAuthenticationManager() throws Exception {
        return authenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
    	int passwordLong=12;
        return new BCryptPasswordEncoder(passwordLong);
    }


}