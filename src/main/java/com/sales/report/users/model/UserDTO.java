package com.sales.report.users.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sales.report.users.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserDTO {
    private String email;
    private String firstName;
    private String lastName;
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Role role;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
}
