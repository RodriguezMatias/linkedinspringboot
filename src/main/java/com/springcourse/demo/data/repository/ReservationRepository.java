package com.springcourse.demo.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springcourse.demo.data.entity.Reservation;
import com.springcourse.demo.data.entity.Room;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Long> {

}
