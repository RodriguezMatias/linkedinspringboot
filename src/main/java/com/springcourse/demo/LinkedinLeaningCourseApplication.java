package com.springcourse.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcourse.demo.data.entity.Guest;
import com.springcourse.demo.data.entity.Reservation;
import com.springcourse.demo.data.entity.Room;
import com.springcourse.demo.data.repository.GuestRepository;
import com.springcourse.demo.data.repository.ReservationRepository;
import com.springcourse.demo.data.repository.RoomRepository;

@SpringBootApplication
public class LinkedinLeaningCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkedinLeaningCourseApplication.class, args);
	}
	
//	@RestController
//	@RequestMapping("/rooms")
//	public class RoomController{
//		@Autowired
//		private RoomRepository roomRepository;
//		
//		@GetMapping
//		public Iterable<Room> getRooms(){
//			return this.roomRepository.findAll();
//		}
//	}
//	@RestController
//	@RequestMapping("/guest")
//	public class GuestController{
//		@Autowired
//		private GuestRepository guestRepository;
//		
//		@GetMapping
//		public Iterable<Guest> getGuest(){
//			return this.guestRepository.findAll();
//		}
//	}
//	@RestController
//	@RequestMapping("/reservation")
//	public class ReservationController{
//		@Autowired
//		private ReservationRepository reservationRepository;
//		
//		@GetMapping
//		public Iterable<Reservation> getReservation(){
//			return this.reservationRepository.findAll();
//		}
//	}

}
