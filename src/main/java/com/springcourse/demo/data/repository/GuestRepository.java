package com.springcourse.demo.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springcourse.demo.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest,Long> {

}
