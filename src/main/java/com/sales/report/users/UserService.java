package com.sales.report.users;

import com.sales.report.users.model.UserConvector;
import com.sales.report.users.model.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

@Service
@Transactional
@AllArgsConstructor
public class UserService {
    private final UserRepository repository;

    public void signup(UserDTO userDTO) {
        User user = UserConvector.from(userDTO);
        String email = user.getEmail();
        if (repository.existByEmail(email)) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, String.format("User with the email address '%s' already exists", email));
        }
        if (repository.count() == 0) {
            user.setRole(Role.ADMIN);
        } else {
            user.setRole(Role.USER);
        }
        repository.save(user);
    }
}