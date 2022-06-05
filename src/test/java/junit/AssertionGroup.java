package junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionGroup {

	@Test
	@DisplayName("AssertAll MAL")
	void asercionAllMAL() {		
		boolean verdaderoFalso = true;
		String cadena = "cadena openwebinars ERROR";
		String cadenaNull = null;
		String cadenaNotNull = "no es nulo";

		String[] cadenas = { "cadena1","cadena2" };		
		String[] esperados = { "cadena1","cadena2", "cadena3" };
		
		
		assertTrue(verdaderoFalso);						
		assertEquals("cadena openwebinars", cadena);
		assertNull(cadenaNull);			
		assertNotNull(cadenaNotNull);			
		assertArrayEquals(esperados, cadenas);
		
	}
	
	@Test
	@DisplayName("AssertAll OK")
	void asercionAllOK() {		
		boolean verdaderoFalso = true;
		String cadena = "cadena openwebinars ERROR";
		String cadenaNull = null;
		String cadenaNotNull = "no es nulo";

		String[] cadenas = { "cadena1","cadena2" };		
		String[] esperados = { "cadena1","cadena2", "cadena3" };
		
		assertAll(
			() -> {assertTrue(verdaderoFalso);},
			() -> {assertEquals("cadena openwebinars", cadena);},
			() -> {assertNull(cadenaNull);},
			() -> {assertNotNull(cadenaNotNull);},
			() -> {assertArrayEquals(esperados, cadenas);}
		);					
				
	}
	
}
