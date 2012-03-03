package com.gailo22.chanom.web.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.gailo22.chanom.service.user.LoginService;

@ManagedBean(name="loginBean")
@SessionScoped 
public class LoginBean {

	private String username;
	private String password;

	private LoginService loginSevice;
	
	@Autowired
	public LoginBean(LoginService loginService) {
		this.loginSevice = loginService;
	}

	public String doLogin() {
		return (loginSevice.login(username, password)) ? "userHome" : null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
