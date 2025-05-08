package com.ezyxip.scribe.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ezyxip.scribe.models.UserSecure;

@Repository
public interface UserSecureRepository extends JpaRepository<UserSecure, Long>{
    
}
