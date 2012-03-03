package com.gailo22.chanom.service.user;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.stereotype.Service;

public class LoginServiceTest {

	private LoginServiceImpl loginServiceImpl;

	@Before
	public void setup() {
		loginServiceImpl = new LoginServiceImpl();
	}

	@Test
	public void shouldDeclareServiceAnnotationForLoginService() {
		// Given
		// When
		// Then
		assertNotNull(LoginServiceImpl.class.getAnnotation(Service.class));
	}

	@Test
	public void shouldImplementsLoginSeriveInterface() {
		// Given When Then
		assertTrue(LoginService.class.isInstance(loginServiceImpl));
	}

	@Test
	public void shouldReturnTrueIfLoginSuccess() {
		// Given
		// When
		boolean login = loginServiceImpl.login("abc", "password");
		// Then
		assertThat(login, is(true));
	}

}
