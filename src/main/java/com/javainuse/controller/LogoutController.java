package com.javainuse.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class LogoutController {
	
	@RequestMapping({ "/logout" })
	public String logoutPage() {
			return " success...  ";

}
	
// windows.localstorage.@removeItem("token");
// windows.sessionStorage.removeIteam("token");
	

}

