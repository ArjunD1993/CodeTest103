package com.form.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationFormService implements RegistrationFormInterface{

	@Autowired
	private RegistrationFormRepository formRepostory;
	@Override
	public int saveUserFormData(RegistrationForm form) {
		// TODO Auto-generated method stub
		
		try {
		 formRepostory.save(form);
		 return 1;
		}
		catch(Exception e) {
			return 0;
		}
	}

}
