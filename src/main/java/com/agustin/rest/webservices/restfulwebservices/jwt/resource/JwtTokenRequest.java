package com.agustin.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

    public JwtTokenRequest() {
        super();
    }
//    {
//    	"token": ""
//    	}eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU4MjAzNzU4MCwiaWF0IjoxNTgxNDMyNzgwfQ.s1ywMS4Sh1619gmQbodfVPhsUz709Dh1HaBWMpZAOJN60UkfFE3pBdVV_c7rDI-K1sjtmnOvsh2FjD9bwzL3sQ
    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

