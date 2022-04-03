package com.citiustech.service;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.citiustech.model.PatientEntity;
import com.citiustech.model.UserEntity;
import com.citiustech.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<PatientEntity> getAllPatient() {
		List<PatientEntity> list = userRepository.getAllPatient();
		System.out.println(list);
		return list;
	}

	public List<UserEntity> getAllUser() {
		List<UserEntity> list = userRepository.getAllUser();
		return list;
	}
	
	public void updateStarus(PatientEntity entity) {
		 userRepository.updateStatus(entity.getStatus(), entity.getEmail());
	}
	
	

}
