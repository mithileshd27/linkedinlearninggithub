package com.mithilesh.linkedinlearning.data.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "RESERVATION")
public class Reservation {
    @Id
    @Column(name="RESERVATION_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long reservationID;
    @Column(name = "ROOM_ID")
    private long roomID;
    @Column(name = "GUEST_ID")
    private long guestID;
    @Column(name = "RES_DATE")
    private Date reservationDate;

    public long getReservationID() {
    	return this.reservationID;
    }
    public void setReservationID(long reservationID) {
    	this.reservationID = reservationID;
    }

    public long getRoomID() {
    	return this.roomID;
    }
    public void setRoomID(long roomID) {
    	this.roomID = roomID;
    }

    public long getGuestID() {
    	return this.guestID;
    }
    public void setGuestID(long guestID) {
    	this.guestID = guestID;
    }

    public Date getReservationDate() {
    	return this.reservationDate;
    }
    public void setReservationDate(Date reservationDate) {
    	this.reservationDate = reservationDate;
    }
}
