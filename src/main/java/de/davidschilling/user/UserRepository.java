package de.davidschilling.user;

import org.springframework.data.jpa.repository.JpaRepository;

/**
* David Schilling - davejs92@gmail.com
*/
public interface UserRepository extends JpaRepository<User, String> {

    User findByUsername(String username);
}
