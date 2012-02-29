package com.gailo22.chanom.web.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="helloWorld")
@SessionScoped 
public class HelloWorld implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private final String text = "Hello Primefaces!";
 
	public String getText() {
		return text;
	}
 
}