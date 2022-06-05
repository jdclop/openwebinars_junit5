package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class AnnotationNestedTests {	
	
	@Nested
	@DisplayName("About methods")
	class About_methods{
		
		@Test
		void about_button() {
			System.out.println("Soy el test ABOUT BUTTON");	
		}
		
		@Test
		void about_toggle() {
			System.out.println("Soy el test ABOUT TOGGLE");
		}
	}
	
	@Nested
	@DisplayName("Contact methods")
	class Contact_methods{
		
		@Test
		void contact_button() {
			System.out.println("Soy el test CONTACT BUTTON");
		}
		
		@Test
		void contact_toggle() {
			System.out.println("Soy el test CONTACT TOGGLE");
		}
	}
	
	@Test
	@DisplayName("Test global UNO")
	void test_global_uno() {
		System.out.println("Soy el test global UNO");
	}

	
	@Test
	@DisplayName("Test global DOS")
	void test_global_dos() {
		System.out.println("Soy el test global DOS");
	}
	
}

