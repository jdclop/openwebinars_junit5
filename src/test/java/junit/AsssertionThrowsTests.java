package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AsssertionThrowsTests {

	
	@Test
	@DisplayName("AssertThrows OK")
	void asercionThrowOK() {		
		
		IndexOutOfBoundsException e = assertThrows(IndexOutOfBoundsException.class, () -> {
			String[] cadena = {"cadena1", "cadena2"};
			String indice4 = cadena[3];
		});			
	}
	
	@Test
	@DisplayName("AssertThrows OK Mensaje")
	void asercionThrowOKMensaje() {		
		
		IndexOutOfBoundsException e = assertThrows(IndexOutOfBoundsException.class, () -> {
			String[] cadena = {"cadena1", "cadena2"};
			String indice4 = cadena[3];
		});
		
		assertEquals("Index 3 out of bounds for length 2", e.getMessage());	
	}
	
	@Test
	@DisplayName("AssertThrows MAL")
	void asercionThrowMAL() {		
		
		IndexOutOfBoundsException e = assertThrows(IndexOutOfBoundsException.class, () -> {
			Integer.parseInt("esto no es un index OUT");
		});
		
		assertEquals("Index 3 out of bounds for length 2", e.getMessage());	
	}
}
