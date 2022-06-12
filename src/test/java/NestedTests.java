import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedTests {

	@BeforeAll
	static void beforeall() {
		System.out.println("Soy BEFORE ALL");
	}
	
	@AfterAll
	static void afterall() {
		System.out.println("Soy AFTER ALL");
	}
	
	@BeforeEach
	void before_each() {
		System.out.println("Soy BEFORE EACH");
	}
	
	@AfterEach
	void after_each() {
		System.out.println("Soy AFTER EACH");
	}
	
	@Nested
	@DisplayName("Nested ABOUT METHODS")
	class About_methods{
		
		@BeforeEach
		void before_each() {
			System.out.println("Soy BEFORE EACH de ABOUT");
		}
		
		@AfterEach
		void after_each() {
			System.out.println("Soy AFTER EACH de ABOUT");
		}
		
		@Test
		@DisplayName("Test About METHOD 1")
		void pruebaAboutMethod1() {		
			System.out.println("Test About METHOD 1");
		}
		
		@Test
		@DisplayName("Test About METHOD 2")
		void pruebaAboutMethod2() {		
			System.out.println("Test About METHOD 2");
		}
	}
	
	
	@Nested
	@DisplayName("Nested CONTACT METHODS")
	class Contact_methods{
		
		@BeforeEach
		void before_each() {
			System.out.println("Soy BEFORE EACH de CONTACT");
		}
		
		@AfterEach
		void after_each() {
			System.out.println("Soy AFTER EACH de CONTACT");
		}
		
		@Test
		@DisplayName("Test Contact METHOD 1")
		void pruebaContactMethod1() {		
			System.out.println("Test Contact METHOD 1");
		}
		
		@Test
		@DisplayName("Test Contact METHOD 2")
		void pruebaContactMethod2() {		
			System.out.println("Test Contact METHOD 2");
		}
	}
	
	@Test
	@DisplayName("Logout GLOBAL uno")
	void pruebaLogoutUno() {		
		System.out.println("Soy el Logout GLOBAL uno");
	}
	
	@Test
	@DisplayName("Logout GLOBAL Dos")
	void pruebaLogoutDos() {		
		System.out.println("Soy el Logout GLOBAL dos");
	}
	
	
}
