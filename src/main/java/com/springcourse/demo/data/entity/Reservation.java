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
	private Long roomId;
	
	@Column (name="GUEST_ID")
	private Long guestId;
	
	@Column (name="RES_DATE")
	private Date reservationDate;;

	public long getReservationID() {
		return reservationID;
	}

	public void setReservationID(long reservationID) {
		this.reservationID = reservationID;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomName(Long roomName) {
		this.roomId = roomName;
	}

	public Long getGuestId() {
		return guestId;
	}

	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	
	
	
}
