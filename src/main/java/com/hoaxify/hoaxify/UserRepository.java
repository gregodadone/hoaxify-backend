package com.hoaxify.hoaxify;

import com.hoaxify.hoaxify.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
