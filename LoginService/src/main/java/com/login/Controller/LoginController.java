package com.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.login.Entity.LoginEn;
import com.login.Service.LoginService;

@Controller
public class LoginController {
	
	
	@Autowired
	LoginService loginService;
	
	
	@GetMapping("/")
	public String getLoginPage() {
		
		return "/Login/login2";
	}
	
/*	@RequestMapping(path="/login",method=RequestMethod.POST)
	public String homePage(HttpServletRequest request) {
		System.out.println("in home page");
		String username=request.getParameter("username");
		System.out.println("username = "+username);

		return "home";
	}  */  
	
/*	-----------%%%%% /Users/yash/Desktop/Spring_Boot/Midland  Above method is used in older time to get form parameter %%%%%%------------*/
	
	@RequestMapping(path="/login",method=RequestMethod.POST)
	public String homePage(
			@RequestParam("username") String userName,
			@RequestParam("password") String password
			) 
	{
		System.out.println("username = "+userName);
		System.out.println("username = "+password);
		
		LoginEn loginEn=new LoginEn();
		loginEn.setUserName(userName);
		loginEn.setPassword(password);
		
		loginService.saveUser(loginEn);

		return "/Login/login2";
	}  
	
/*%%%%%%%%%%%------ Above is using @Requestparam Annotation ------%%%%%%%%%%%%*/	
		
}
