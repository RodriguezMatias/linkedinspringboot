package com.springcourse.demo.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESERVATION")
public class Reservation {

	@Id
	@Column(name="RESERVATION_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long reservationID;
	
	@Column (name="ROOM_ID")
	private Integer roomName;
	
	@Column (name="GUEST_ID")
	private Integer guestId;
	
	@Column (name="RES_DATE")
	private Date resDate;

	public long getReservationID() {
		return reservationID;
	}

	public void setReservationID(long reservationID) {
		this.reservationID = reservationID;
	}

	public Integer getRoomName() {
		return roomName;
	}

	public void setRoomName(Integer roomName) {
		this.roomName = roomName;
	}

	public Integer getGuestId() {
		return guestId;
	}

	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	public Date getResDate() {
		return resDate;
	}

	public void setResDate(Date resDate) {
		this.resDate = resDate;
	}
	
	
}
