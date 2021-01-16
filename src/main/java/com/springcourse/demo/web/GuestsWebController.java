package com.springcourse.demo.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springcourse.demo.business.domain.GuestReservation;
import com.springcourse.demo.business.domain.RoomReservation;
import com.springcourse.demo.business.service.GuestsService;
import com.springcourse.demo.business.service.ReservationService;

@Controller
@RequestMapping("/guests")
public class GuestsWebController {
	
	private final GuestsService guestService;


	
	 @Autowired
	    public GuestsWebController(GuestsService guestService) {
	        this.guestService = guestService;
	    }

	    @GetMapping
	    public String getReservations(@RequestParam(value="date", required = false)String dateString, Model model){
	        Date date = DateUtils.createDateFromDateString(dateString);
	        List<GuestReservation> guestsReservations = this.guestService.getGuests();
	        model.addAttribute("guestsReservations", guestsReservations);
	        return "guests";
	    }
	
}
