package com.demo.springsecurityjwt.model;


public class AuthenticationResponse {
    public String getJwt() {
        return jwt;
    }

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }
}
