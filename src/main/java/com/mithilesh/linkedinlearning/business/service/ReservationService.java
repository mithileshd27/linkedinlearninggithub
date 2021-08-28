package com.mithilesh.linkedinlearning.business.service;

import java.util.*;

import com.mithilesh.linkedinlearning.business.domain.RoomReservation;
import com.mithilesh.linkedinlearning.data.entity.Reservation;
import com.mithilesh.linkedinlearning.data.entity.Room;
import com.mithilesh.linkedinlearning.data.entity.Guest;
import com.mithilesh.linkedinlearning.data.repository.GuestRepository;
import com.mithilesh.linkedinlearning.data.repository.ReservationRepository;
import com.mithilesh.linkedinlearning.data.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    private final RoomRepository roomRepository;
    private final GuestRepository guestRepository;
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(RoomRepository roomRepository, GuestRepository guestRepository, ReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<RoomReservation> getRoomReservationForDate(Date date) {
        Iterable<Room> rooms = this.roomRepository.findAll();
        Map<Long, RoomReservation> roomReservationMap = new HashMap();
        rooms.forEach(room -> {
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomID(room.getRoomID());
            roomReservation.setRoomName(room.getRoomName());
            roomReservation.setRoomNumber(room.getRoomNumber());
            roomReservationMap.put(room.getRoomID(), roomReservation);
        });
        Iterable<Reservation> reservations = this.reservationRepository.findReservationByReservationDate(new java.sql.Date(date.getTime()));
        reservations.forEach(reservation -> {
            RoomReservation roomReservation = roomReservationMap.get(reservation.getRoomID());
            roomReservation.setDate(date);
            Guest guest = this.guestRepository.findById(reservation.getGuestID()).get();
            roomReservation.setFirstName(guest.getFirstName());
            roomReservation.setLastName(guest.getLastName());
            roomReservation.setGuestID(guest.getGuestID());
        });
        List<RoomReservation> roomReservations = new ArrayList<>();
        for(Long id: roomReservationMap.keySet()){
            roomReservations.add(roomReservationMap.get(id));
        }
        return roomReservations;
    }

    public List<Guest> getHotelGuests(){
        Iterable<Guest> guests = this.guestRepository.findAll();
        List<Guest> guestList = new ArrayList<>();
        guests.forEach(guest->{guestList.add(guest);});
        guestList.sort(new Comparator<Guest>() {
            @Override
            public int compare(Guest o1, Guest o2) {
                if (o1.getLastName() == o2.getLastName()){
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        return guestList;
    }
}
