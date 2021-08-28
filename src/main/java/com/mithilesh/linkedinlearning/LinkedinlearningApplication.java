package com.mithilesh.linkedinlearning;

import com.mithilesh.linkedinlearning.data.entity.Reservation;
import com.mithilesh.linkedinlearning.data.repository.ReservationRepository;
import com.mithilesh.linkedinlearning.data.entity.Room;
import com.mithilesh.linkedinlearning.data.repository.RoomRepository;
import com.mithilesh.linkedinlearning.data.entity.Guest;
import com.mithilesh.linkedinlearning.data.repository.GuestRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LinkedinlearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkedinlearningApplication.class, args);
	}
}

