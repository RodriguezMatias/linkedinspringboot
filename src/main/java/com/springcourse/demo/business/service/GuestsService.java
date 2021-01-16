package com.springcourse.demo.business.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcourse.demo.business.domain.GuestReservation;
import com.springcourse.demo.business.domain.RoomReservation;
import com.springcourse.demo.data.entity.Guest;
import com.springcourse.demo.data.entity.Reservation;
import com.springcourse.demo.data.entity.Room;
import com.springcourse.demo.data.repository.GuestRepository;
import com.springcourse.demo.data.repository.ReservationRepository;
import com.springcourse.demo.data.repository.RoomRepository;

@Service
public class GuestsService {
	
	private final RoomRepository roomRepository;
	private final GuestRepository guestRepository;
	private final ReservationRepository reservationRepository;
	
	
	@Autowired
	public GuestsService(RoomRepository roomRepository, GuestRepository guestRepository,
			ReservationRepository reservationRepository) {
		this.roomRepository = roomRepository;
		this.guestRepository = guestRepository;
		this.reservationRepository = reservationRepository;
	}



	public List<GuestReservation> getGuests(){
        Iterable<Guest> guests = this.guestRepository.findAll();
        Map<Long, GuestReservation> guestsReservationMap = new HashMap();
        guests.forEach(guest -> {
            GuestReservation guestReservation = new GuestReservation();
            guestReservation.setCountry(guest.getCountry());
            guestReservation.setEmailAddress(guest.getEmailAdress());
            guestReservation.setFirstName(guest.getFirstName());
            guestReservation.setLastName(guest.getFirstName());
            guestReservation.setPhoneNumber(guest.getPhoneNumber());
            guestReservation.setState(guest.getState());
            guestsReservationMap.put(guest.getGuestId(), guestReservation);
        });
       
        
        List<GuestReservation>  guestsReservation = new ArrayList<>();
        for(Long id: guestsReservationMap.keySet()){
        	guestsReservation.add(guestsReservationMap.get(id));
        }
        guestsReservation.sort(new Comparator<GuestReservation>() {
            @Override
            public int compare(GuestReservation o1, GuestReservation o2) {
                if (o1.getFirstName() == o2.getFirstName()){
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
        return guestsReservation;
    }
}
