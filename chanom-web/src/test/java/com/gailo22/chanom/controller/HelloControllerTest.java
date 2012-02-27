package com.gailo22.chanom.controller;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

public class HelloControllerTest {

	@Test
	public void shouldReturnHelloFromHelloChanom() throws Exception {	
		// Given
        HelloController controller = new HelloController();
        
        // When
        String viewName = controller.helloChanom(null);	
        
        // Then
        assertThat(viewName, IsEqual.equalTo("hello"));
    }
}
