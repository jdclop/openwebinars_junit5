package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AnnotationParameterizedTests {

	@ParameterizedTest
	@DisplayName("ParameterizedTest UN VALOR")
	@ValueSource(strings = "primer valor")
	void parameterizedUnValor(String entrada) {
		System.out.println("VALOR DE ENTRADA: "+entrada);
	}
	
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest MULTIPLES VALORES")
	@ValueSource(ints = {1,2,3,4,5})
	void parameterizedMultivalor(int entrada) {
		System.out.println("VALOR DE ENTRADA: "+entrada);
	}
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest CSV SOURCE")
	@CsvSource({"esperado,actual",
				"valido,valido",
				"valorEsperado,valorActual",
				"uno,dos",
				"igual,igual"})
	void parameterizedCsvsource(String valor1,String valor2) {
		assertEquals(valor1,valor2);
	}
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest CSV SOURCE con DELIMITADOR")
	@CsvSource(value = {"esperado:actual",
						"valido:valido",
						"valorEsperado:valorActual",
						"uno:dos",
						"igual:igual"},
				delimiter = ':')
	void parameterizedCsvsourceDelimiter(String valor1,String valor2) {
		assertEquals(valor1,valor2);
	}
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest CSV SOURCE FILE")
	@CsvFileSource(resources = "/valores.csv")
	void parameterizedCsvsourceFile(String valor1,String valor2) {
		assertEquals(valor1,valor2);
	}
	
	@ParameterizedTest
	@DisplayName("ParameterizedTest CSV SOURCE FILE con CABECERA")
	@CsvFileSource(resources = "/valores_ConCabecera.csv", numLinesToSkip = 1)
	void parameterizedCsvsourcefileConcabecera(String valor1,String valor2) {
		assertEquals(valor1,valor2);
	}
	
	@ParameterizedTest(name = "[Iteración {index}]:   {arguments}")
	@DisplayName("ParameterizedTest CSV SOURCE FILE con CABECERA y DATOS")
	@CsvFileSource(useHeadersInDisplayName = true, resources = "/valores_ConCabecera.csv")
	void parameterizedCsvsourcefileConcabeceraYDatos(String valor1,String valor2) {
		assertEquals(valor1,valor2);
	}
	
}
