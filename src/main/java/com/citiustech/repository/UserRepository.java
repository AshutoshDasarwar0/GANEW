package com.citiustech.repository;

import java.util.Collection;
import java.util.List;
import javax.transaction.Transactional;

import org.aspectj.weaver.tools.Trace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.citiustech.model.PatientEntity;
import com.citiustech.model.UserEntity;


@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<PatientEntity,String> {
	
	@Query(value="select firstname || lastname as fullName, p.email, registrationdate, status, patientId , rolename from patient p ,uservalidation uv, role r where p.email = uv.email and uv.role = r.roleId;",nativeQuery = true)
	public List<PatientEntity> getAllPatient();


	@Query(value="select firstname || lastname as fullName, p.email, registrationdate, uv.status, userId , rolename from huser p ,uservalidation uv, role r where p.email = uv.email and uv.role = r.roleId;",nativeQuery = true)
	public List<UserEntity> getAllUser();
	
	@Query(value="update uservalidation  set status =?1 where email=?2",nativeQuery = true)
	@Modifying(clearAutomatically = true)
	@Transactional
	public void updateStatus(String status,String email);
	

}
