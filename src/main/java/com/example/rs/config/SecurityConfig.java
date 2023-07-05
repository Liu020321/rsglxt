//package com.example.rs.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//        @Bean
//        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//                http.csrf().disable();
//                http.authorizeHttpRequests().anyRequest().permitAll()
//                        .and()
//                        .logout().permitAll();
//                                /*
//                                 * .authorizeRequests(authorizeRequests ->
//                                 * authorizeRequests
//                                 * .antMatchers("/druid/**", "/", "/index.html", "/static/**")
//                                 * .permitAll()
//                                 * .anyRequest()
//                                 * .authenticated()
//                                 * )
//                                 * .formLogin(formLogin ->
//                                 * formLogin
//                                 * .loginPage("/login")
//                                 * .permitAll()
//                                 * )
//                                 * .logout(logout ->
//                                 * logout
//                                 * .logoutUrl("/logout")
//                                 * .permitAll()
//                                 * )
//                                 */
//
//                return http.build();
//        }
//
//}
