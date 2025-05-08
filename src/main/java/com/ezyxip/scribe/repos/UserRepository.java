package com.ezyxip.scribe.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ezyxip.scribe.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
