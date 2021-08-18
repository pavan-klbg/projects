package com.cg.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.project.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer > {

}
