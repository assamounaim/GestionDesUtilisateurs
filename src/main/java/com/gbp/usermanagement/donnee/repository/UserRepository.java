package com.gbp.usermanagement.donnee.repository;

import com.gbp.usermanagement.donnee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
