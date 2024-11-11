package com.sales.report.users;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class User {
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Role role;
}
