package com.mithilesh.linkedinlearning.business.domain;

import java.util.Date;

public class RoomReservation {
    private long roomID;


    public long getRoomID() {
    	return this.roomID;
    }
    public void setRoomID(long roomID) {
    	this.roomID = roomID;
    }

    private long guestID;


    public long getGuestID() {
    	return this.guestID;
    }
    public void setGuestID(long guestID) {
    	this.guestID = guestID;
    }

    private String roomName;


    public String getRoomName() {
    	return this.roomName;
    }
    public void setRoomName(String roomName) {
    	this.roomName = roomName;
    }

    private String roomNumber;


    public String getRoomNumber() {
    	return this.roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
    	this.roomNumber = roomNumber;
    }

    private String firstName;


    public String getFirstName() {
    	return this.firstName;
    }
    public void setFirstName(String firstName) {
    	this.firstName = firstName;
    }

    private String lastName;


    public String getLastName() {
    	return this.lastName;
    }
    public void setLastName(String lastName) {
    	this.lastName = lastName;
    }

    private Date date;


    public Date getDate() {
    	return this.date;
    }
    public void setDate(Date date) {
    	this.date = date;
    }
}
