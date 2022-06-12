package junit_tests;

import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class OpenwebinarSuiteTests {

	
	@Test
	@Tag("login")
	@DisplayName("Login uno")
	void pruebaLoginUno() {		
		System.out.println("Soy el Login uno");
	}
	
	@Test
	@Tag("login")
	@DisplayName("Login dos")
	void pruebaLoginDos() {		
		System.out.println("Soy el Login dos");
	}
	
	@Test
	@Tag("login")
	@DisplayName("Login tres")
	void pruebaLoginTres() {		
		System.out.println("Soy el Login tres");
	}
	
	@Test
	@Tag("login")
	@Tag("logout")
	@DisplayName("Logout uno")
	void pruebaLogoutUno() {		
		System.out.println("Soy el Logout uno");
	}
	
	@Test
	@Tag("login")
	@Tag("logout")
	@DisplayName("Logout dos")
	void pruebaLogoutDos() {		
		System.out.println("Soy el Logout dos");
	}
	
}
