package junit;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AnnotationTagTests {

	@Test
	@DisplayName("Login happy path")
	@Tag("login")
	void loginHappyPath() {		
		System.out.println("Soy el happy path del login");
	}
	
	@Test
	@DisplayName("Login Wrong Name path")
	@Tag("login")
	void loginWrongNamePath() {		
		System.out.println("Soy el wrong name path del login");
	}
	
	
	@Test
	@DisplayName("Login Wrong Password path")
	@Tag("login")
	void loginWrongPasswordPath() {		
		System.out.println("Soy el wrong password path del login");
	}
	
	@Test
	@DisplayName("Logout Happy path")
	@Tag("logout")
	void logoutHappyPath() {		
		System.out.println("Soy el Happy path del logout");
	}
	
	@Test
	@DisplayName("Logout Wrong path")
	@Tag("logout")
	void logoutWrongPath() {		
		System.out.println("Soy el Wrong path del logout");
	}
}
