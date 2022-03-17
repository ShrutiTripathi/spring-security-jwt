package com.demo.springsecurityjwt.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class AuthenticationRequest {
    private String username;
    private String password;
}
