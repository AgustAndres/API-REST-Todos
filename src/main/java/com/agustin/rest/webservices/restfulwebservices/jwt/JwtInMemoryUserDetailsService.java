package com.agustin.rest.webservices.restfulwebservices.jwt;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

  static List<JwtUserDetails> inMemoryUserList = new ArrayList<>();

  static {
    inMemoryUserList.add(new JwtUserDetails(1L, "in28minutes",
        "$2a$10$3zHzb.Npv1hfZbLEU5qsdOju/tk2je6W6PnNnY.c1ujWPcZh4PL6e", "ROLE_USER_2"));
    inMemoryUserList.add(new JwtUserDetails(2L, "agustin",
            "$2a$10$16VFOJwzQQo44neb8JI3X.bCL7C8mGA.yj4zs5PbAiTB64OLs4BQG", "ROLE_USER_2"));
    inMemoryUserList.add(new JwtUserDetails(3L, "1",
            "$2a$10$16VFOJwzQQo44neb8JI3X.bCL7C8mGA.yj4zs5PbAiTB64OLs4BQG", "ROLE_USER_2"));
    //$2a$10$OsOjPK4UCyeBiMkcIEhbdOuYVZTBfY.pLukvI5HyGYIxgcNXINdRm
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Optional<JwtUserDetails> findFirst = inMemoryUserList.stream()
        .filter(user -> user.getUsername().equals(username)).findFirst();

    if (!findFirst.isPresent()) {
      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
    }

    return findFirst.get();
  }

}


