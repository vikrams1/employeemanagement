package org.jt.employeemanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

  // Authentication
  @Bean
  public UserDetailsService userDetailsService() {
    var user = User.builder().username("admin").password("{noop}sagarm").roles("ADMIN").build();
    return new InMemoryUserDetailsManager(user);
  }

  // Authorization
  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.csrf(csrf -> csrf.disable())
        .authorizeHttpRequests(request -> request.requestMatchers("/**").hasRole("ADMIN").anyRequest().authenticated())
        .formLogin(Customizer.withDefaults());
    return http.build();
  }
}
