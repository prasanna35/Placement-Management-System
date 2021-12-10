package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.placement.entities.Admin;
import com.placement.entities.Recruiter;
import com.placement.entities.Student;

public interface AdminRepository extends JpaRepository<Admin, Long>  {

	Admin findByEmailAndPassword(String email,String password);
	Admin findByEmail(String email);
}
