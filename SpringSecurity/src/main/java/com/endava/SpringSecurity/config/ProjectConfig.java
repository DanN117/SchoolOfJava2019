package com.endava.SpringSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {

        // return NoOpPasswordEncoder.getInstance();        // pentru testare doar
        // return BCryptPasswordEncoder.getInstance();      // truecrypt


        return new PasswordEncoder() {
            @Override
            public String encode(CharSequence charSequence) {
                return charSequence.toString();
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                return charSequence.equals(s);
            }
        };
    }

    @Override
    @Bean
    public UserDetailsService userDetailsServiceBean() {
        UserDetails u = new UserDetails() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                return Arrays.asList( () -> "ADMIN" );
            }

            @Override
            public String getPassword() {
                return "12345";
            }

            @Override
            public String getUsername() {
                return "thedude";
            }

            @Override
            public boolean isAccountNonExpired() {
                return false;
            }

            @Override
            public boolean isAccountNonLocked() {
                return false;
            }

            @Override
            public boolean isCredentialsNonExpired() {
                return false;
            }

            @Override
            public boolean isEnabled() {
                return false;
            }
        };

        UserDetailsService us = username -> u;


        UserDetailsManager imus = new InMemoryUserDetailsManager();

        UserDetails user1 = User.withUsername("bill")
                .password("12345")
                .authorities("ADMIN")
                .build();

        UserDetails user2 = User.withUsername("john")
                .password("12345")
                .authorities("MANAGER")
                .build();

        imus.createUser(user1);
        imus.createUser(user2);

        return imus;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        // ANT /hello     /hello/*     /hello/**   /*/hello/**   ->  /abc/hello/etc/etc/etc/etc/etc          sort of regex
        http.authorizeRequests()
                .antMatchers("/hello").access("hasAuthority('ADMIN')")
        //        .antMatchers("/hello", "/world).authenticated()

                .anyRequest().permitAll();

    }


}
