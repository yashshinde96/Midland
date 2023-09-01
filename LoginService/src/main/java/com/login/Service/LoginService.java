package com.login.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.Entity.LoginEn;
import com.login.Repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository loginRepository;

	public boolean validateUser() {

		int count = 0;

		if (count != 0)
			return true;
		else
			return false;
	}
	
	
	public void saveUser(LoginEn loginen) {
		try {
		loginRepository.save(loginen);
//		return 1;
		}
		catch(Exception e) {
			System.out.println("Error --- "+e);
		}
//		return 0;
		
	}

}
