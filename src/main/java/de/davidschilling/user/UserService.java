package de.davidschilling.user;

import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * David Schilling - davejs92@gmail.com
 */
public interface UserService extends UserDetailsService {

    User createUser(String username, String password);
}
