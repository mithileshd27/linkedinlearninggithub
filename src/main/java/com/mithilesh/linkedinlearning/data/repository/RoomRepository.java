package com.mithilesh.linkedinlearning.data.repository;

import com.mithilesh.linkedinlearning.data.entity.Room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    
}
