package com.goihram.haj.trackerservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goihram.haj.trackerservice.model.TrackerRequest;
import com.goihram.haj.trackerservice.model.TrackerResponse;
import com.goihram.haj.trackerservice.model.UserInformation;

@RestController
@RequestMapping("/user")
public class UserRegistrationController {

	
	@RequestMapping("register")
	public TrackerResponse<String> registerUser(TrackerRequest<UserInformation> registrationRequest)
	{
		return null;
		
	}
	
	
	
	
}
