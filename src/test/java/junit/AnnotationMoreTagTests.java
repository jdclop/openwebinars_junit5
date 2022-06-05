package junit;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AnnotationMoreTagTests {

	@Test
	@DisplayName("Login happy path OTRO")
	@Tag("login")
	void loginHappyPath() {		
		System.out.println("Soy el happy path del login");
	}
	
	@Test
	@DisplayName("Login Wrong Name path OTRO")
	@Tag("login")
	void loginWrongNamePath() {		
		System.out.println("Soy el wrong name path del login");
	}
	
	
	@Test
	@DisplayName("Login Wrong Password path OTRO")
	@Tag("login")
	@Tag("este_no")
	void loginWrongPasswordPath() {		
		System.out.println("Soy el wrong password path del login");
	}
	
	@Test
	@DisplayName("Logout Happy path OTRO")
	@Tag("logout")
	void logoutHappyPath() {		
		System.out.println("Soy el Happy path del logout");
	}
	
	@Test
	@DisplayName("Logout Wrong path OTRO")
	@Tag("logout")
	void logoutWrongPath() {		
		System.out.println("Soy el Wrong path del logout");
	}
}
