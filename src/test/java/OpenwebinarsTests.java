import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.time.Duration;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class OpenwebinarsTests {

		@Test
		@DisplayName("Aserción TRUE")
		void pruebaBoolean() {
			boolean verdadero = true;
			assertTrue(verdadero);
		}
		
		@Test
		@DisplayName("Aserción EQUALS")
		void pruebaEquals() {
			String cadenaEsperada = "esperada";
			String cadenaActual = "esperada";
			
			assertEquals(cadenaEsperada, cadenaActual);
		}
		
		@Test
		@DisplayName("Aserción ARRAY EQUALS")
		void pruebaArray() {
			
			String[] cadenasEsperadas = {"cadena1", "cadena2", "cadena3"};
			String[] cadenasActuales = {"cadena1", "cadena2", "cadena3"};
			
			assertArrayEquals(cadenasEsperadas, cadenasActuales);
			
			
		}
		
		@Test
		@DisplayName("Aserción ITERABLE")
		void pruebaIterable() {
			
			ArrayList<String> cadenasEsperadas = new ArrayList<String>();
			cadenasEsperadas.add("cadena1");
			cadenasEsperadas.add("cadena2");
			cadenasEsperadas.add("cadena3");
			ArrayList<String> cadenasActuales = new ArrayList<String>();
			cadenasActuales.add("cadena1");
			cadenasActuales.add("cadena2");
			cadenasActuales.add("cadena3");

			/*
			assertEquals(cadenasEsperadas.size(), cadenasActuales.size(), "La longitud de los iterables es diferente,se esperaba: "+cadenasEsperadas.size()+" pero fue: "+cadenasActuales.size());
			for(int i=0; i<cadenasEsperadas.size(); i++) {
				assertEquals(cadenasEsperadas.get(i), cadenasActuales.get(i), "El valor del indice "+i+" es diferente.");
			}*/
			assertIterableEquals(cadenasEsperadas, cadenasActuales);
			
			
		}

		@Test
		@DisplayName("Aserción THROWS")
		void pruebaThrows() {
			
			assertThrows(IndexOutOfBoundsException.class, ()->{
				String[] arr = {"cadena1", "cadena2", "cadena3"};
				String cadena = arr[5];
			});
			
		}
		
		@Test
		@DisplayName("Aserción TIMEOUT")
		void pruebaTimeout() {
			
			assertTimeout(Duration.ofSeconds(5), ()->{
				Thread.sleep(1);
			});
			
		}
		
		@Test
		@DisplayName("Aserción ALL")
		void pruebaAll() {
			
			assertAll(
					() -> {assertTrue(true);},
					() -> {assertFalse(false);},
					() -> {assertEquals("cadena","cadena");},
					() -> {assertEquals(2,2);}
				);
						
		}
		
		
		@Test
		@DisplayName("Asunción")
		void pruebaAsuncion() {
			boolean verdadero = false;
			
			assumeTrue(verdadero);
			
			System.out.println("Esta línea sólo se mostrará si la asunción SE CUMPLE");
			
		}
		
		@Test
		@DisplayName("Asunción THAT")
		void pruebaAsuncionThat() {
			boolean verdadero = false;
			
			assumingThat(verdadero, () -> {
				System.out.println("Esta línea sólo se mostrará si la asunción SE CUMPLE");					
			});
			
			System.out.println("Esta línea se mostrará SIEMPRE");
		}
		
		@DisplayName("Test de Repeticion")
		@RepeatedTest(value=3, name=" TEST: [{displayName}] -> {currentRepetition} de {totalRepetitions}")		
		void pruebaRepeated(RepetitionInfo ri) {
			System.out.println("Estoy en la iteración: "+ri.getCurrentRepetition());
			System.out.println("De un total de: "+ri.getTotalRepetitions());
			System.out.println("----");
		}
		
		
		@ParameterizedTest
		@CsvFileSource(resources = "./ficheroCSV.csv", numLinesToSkip = 2)
		void pruebaParametrizada(String esperado, String actual) {
			assertEquals(esperado, actual);
		}
		
}
