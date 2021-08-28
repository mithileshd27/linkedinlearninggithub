package com.mithilesh.linkedinlearning.data.repository;

import com.mithilesh.linkedinlearning.data.entity.Guest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
    
}
