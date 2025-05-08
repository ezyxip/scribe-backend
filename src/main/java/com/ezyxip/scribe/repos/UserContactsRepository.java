package com.ezyxip.scribe.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ezyxip.scribe.models.UserContacts;

@Repository
public interface UserContactsRepository extends JpaRepository<UserContacts, Long>{
    
}
