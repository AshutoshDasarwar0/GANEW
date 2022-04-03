package com.citiustech.repository;

import java.sql.Date;
import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.citiustech.model.UserModel;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserModel, String>{

	@Query(value="insert into huser (userid,title,firstname,lastname,email,dob,roleid,employeeid,registrationdate) values (?1,?2,?3,?4,?5,?6,?7,?8,?9)",nativeQuery = true)
	@Modifying(clearAutomatically = true)
	@Transactional
	public void saveUser(String userId,String title,String firstName,String lastName,String email,Date date,int role,String employeeId,Date date2);
}
