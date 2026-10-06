package com.sarvesh.spring_sec_demo.config;

import com.sarvesh.spring_sec_demo.service.JwtService;
import com.sarvesh.spring_sec_demo.service.MyUserDetailService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private MyUserDetailService userDetailsService;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {

        String authHeader = request.getHeader("Authorization");

        String username = null;
        String token = null;

        System.out.println("\n========== JWT DEBUG ==========");
        System.out.println("Request URI: " + request.getRequestURI());
        System.out.println("Authorization header present: "
                + (authHeader != null));

        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            token = authHeader.substring(7);
            username = jwtService.extractUsername(token);

            System.out.println("JWT username: [" + username + "]");
        } else {
            System.out.println("No Bearer token found.");
        }

        if (username != null
                && SecurityContextHolder.getContext()
                .getAuthentication() == null) {

            System.out.println("Searching database for: [" + username + "]");

            UserDetails userDetails =
                    userDetailsService.loadUserByUsername(username);

            System.out.println("UserDetails username: ["
                    + userDetails.getUsername() + "]");

            boolean valid = jwtService.validateToken(token, userDetails);

            System.out.println("JWT validation result: " + valid);

            if (valid) {
                UsernamePasswordAuthenticationToken authToken =
                        new UsernamePasswordAuthenticationToken(
                                userDetails,
                                null,
                                userDetails.getAuthorities()
                        );

                authToken.setDetails(
                        new WebAuthenticationDetailsSource()
                                .buildDetails(request)
                );

                SecurityContextHolder.getContext()
                        .setAuthentication(authToken);

                System.out.println("Authentication successful.");
            } else {
                System.out.println("JWT validation failed.");
            }
        } else if (username == null) {
            System.out.println("Username is null; skipping authentication.");
        } else {
            System.out.println("Authentication already exists in context.");
        }

        System.out.println("========== END JWT DEBUG ==========\n");

        chain.doFilter(request, response);
    }
}
