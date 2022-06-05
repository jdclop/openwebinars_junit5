package junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionTests {

	@Test
	@DisplayName("AssertTrue")
	void asercionTrue() {		
		boolean verdaderoFalso = true;
		assertTrue(verdaderoFalso);		
	}
	
	@Test
	@DisplayName("AssertEquals")
	void asercionEquals() {		
		String cadena = "cadena openwebinars";
		
		assertEquals("cadena openwebinars", cadena);		
	}
	
	@Test
	@DisplayName("AssertNull")
	void asercionNull() {		
		String cadena = null;
		
		assertNull(cadena);		
	}
	
	@Test
	@DisplayName("AssertNotNull")
	void asercionNotNull() {		
		String cadena = "no es nulo";
		
		assertNotNull(cadena);		
	}

	@Test
	@DisplayName("AssertArrayEquals")
	void asercionArrayEquals() {		
		String[] cadenas = { "cadena1","cadena2" };		
		String[] esperados = { "cadena1","cadena2" };
		
		assertArrayEquals(esperados, cadenas);		
	}
		
}
