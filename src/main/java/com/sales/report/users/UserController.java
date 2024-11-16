package com.sales.report.users;

import com.sales.report.security.jwt.JwtHelper;
import com.sales.report.users.model.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/auth")
public class UserController {

    private final UserService service;
    private final AuthenticationManager authenticationManager;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody UserDTO userDTO) {
        service.signup(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserDTO userDTO) {
        User user = service.findByEmail(userDTO.getEmail());
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                user.getEmail(),
                userDTO.getPassword(),
                List.of(new SimpleGrantedAuthority(user.getRole().name()))));
        String token = JwtHelper.generateToken(user);
        return ResponseEntity.ok(Map.of("token", token));
    }
}
