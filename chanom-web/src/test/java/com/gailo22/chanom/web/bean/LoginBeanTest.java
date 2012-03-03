package com.gailo22.chanom.web.bean;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.gailo22.chanom.service.user.LoginService;

public class LoginBeanTest {

	private LoginBean loginBean;
	@Mock
	private LoginService mockLoginService;

	@Before
	public void setup() {
		initMocks(this);
		loginBean = new LoginBean(mockLoginService);
	}

	@After
	public void tearDown() {
		loginBean = null;
	}

	@Test
	public void shouldReturnSuccessViewWhenUsernameAndPasswordAreCorrect() {
		// Given
		when(mockLoginService.login(Mockito.anyString(), Mockito.anyString()))
				.thenReturn(true);
		// When
		String viewName = loginBean.doLogin();
		// Then
		assertThat(viewName, equalTo("userHome"));
	}

	@Test
	public void shouldReturnNullWhenLoginFailed() {
		// Given
		when(mockLoginService.login(Mockito.anyString(), Mockito.anyString()))
				.thenReturn(false);
		// When
		String viewName = loginBean.doLogin();
		// Then
		assertThat(viewName, equalTo(null));
	}

}
