package com.sales.report.security.jwt;

import com.sales.report.users.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.crypto.SecretKey;
import java.security.Key;
import java.security.KeyFactory;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

public class JwtHelper {
    private static final Key SECRET_KEY = Jwts.SIG.HS256.key().build();
    private static final int Hours = 12;

    public static String generateToken(User user) {
        Instant now = Instant.now();
        return Jwts.builder()
                .subject(user.getEmail())
                .claim("role", user.getRole().name())
                .issuedAt(Date.from(now))
                .expiration(Date.from(now.plus(Hours, ChronoUnit.HOURS)))
                .signWith(SECRET_KEY)
                .compact();
    }

    public static String extractUsername(String token) {
        return getTokenBody(token).getSubject();
    }

    public static String extractRole(String token) {
        return getTokenBody(token).get("role", String.class);
    }

    public static boolean validateToken(String token, UserDetails userDetails) {
        String username = extractUsername(token);
        String role = extractRole(token);
        String userDetailsRole = userDetails.getAuthorities().stream()
                .findFirst()
                .map(GrantedAuthority::getAuthority)
                .orElse(null);
        return username.equals(userDetails.getUsername()) && role.equals(userDetailsRole) && !isTokenExpired(token);

    }

    private static Claims getTokenBody(String token) {
        return Jwts.parser()
                .verifyWith((SecretKey) SECRET_KEY)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    private static boolean isTokenExpired(String token) {
        return getTokenBody(token).getExpiration().before(new Date());
    }
}
