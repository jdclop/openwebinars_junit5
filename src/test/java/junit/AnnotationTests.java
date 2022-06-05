package junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AnnotationTests {

	@BeforeAll
	@DisplayName("BEFORE ALL")
	static void beforeall() {		
		System.out.println("BEFORE ALL: Me ejecuto ANTES de TODOS los Test");
	}
	
	@BeforeEach
	@DisplayName("BEFORE EACH")
	void beforeeach() {		
		System.out.println("BEFORE EACH: Me ejecuto ANTES de cada Test");	
	}
	
	@Test
	@DisplayName("TEST 1")
	void test1() {		
		System.out.println("Soy el TEST 1");
	}
	
	@Test
	@DisplayName("TEST 2")
	void test2() {		
		System.out.println("Soy el TEST 2");
	}
	
	@AfterEach
	@DisplayName("AFTER EACH")
	void afterEach() {		
		System.out.println("AFTER EACH: Me ejecuto DESPUÉS de cada Test");
	}
	
	@AfterAll
	@DisplayName("AFTER ALL")
	static void afterall() {		
		System.out.println("AFTER ALL: Me ejecuto DESPUÉS de TODOS los Test");
	}
	
	
}
