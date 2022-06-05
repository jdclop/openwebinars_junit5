package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionIterableTests {


	@Test
	@DisplayName("AssertIterableEquals MAL")
	void asercionIterableEqualsMAL() {		
		ArrayList<String> cadenas = new ArrayList<String>();
		cadenas.add("cadena1");
		cadenas.add("cadena2");
		cadenas.add("cadena3");
		cadenas.add("cadena4");
		
		ArrayList<String> esperados = new ArrayList<String>();
		esperados.add("cadena1");
		esperados.add("cadena2");
		esperados.add("cadena2");
		//esperados.add("cadena4");
				
		assertEquals(esperados.size(), cadenas.size(), "El tamaño de los iterables es diferente");
			
		for(int i=0; i<cadenas.size(); i++) {
			assertEquals(esperados.get(i), cadenas.get(i), "falló el índice: "+i);
		}
		
	}		
	
	@Test
	@DisplayName("AssertIterableEquals")
	void asercionIterableEquals() {		
		ArrayList<String> cadenas = new ArrayList<String>();
		cadenas.add("cadena1");
		cadenas.add("cadena2");
		cadenas.add("cadena3");
		cadenas.add("cadena4");
		
		ArrayList<String> esperados = new ArrayList<String>();
		esperados.add("cadena1");
		esperados.add("cadena2");
		esperados.add("cadena3");
		esperados.add("cadena4");
		
		assertIterableEquals(esperados, cadenas);		
	}
	
}
