package junit;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssumptionTests {

	@Test
	@DisplayName("Assume MAL")
	void asuncionMAL() {		
		boolean verdaderoFalso = true;

		assumeFalse(verdaderoFalso);
		//A PARTIR DE AQUÍ SÓLO SE CONTINUARÁ SI LA ASUNCIÓN SE CUMPLE
		
		System.out.println("Esto se imprimirá sólo si la asunción se cumple (asuncionMAL)");
	}
	
	@Test
	@DisplayName("Assume OK")
	void asuncionOK() {		
		boolean verdaderoFalso = false;

		assumeFalse(verdaderoFalso);
		//A PARTIR DE AQUÍ SÓLO SE CONTINUARÁ SI LA ASUNCIÓN SE CUMPLE
		
		System.out.println("Esto se imprimirá sólo si la asunción se cumple (asuncionOK)");
	}
		
	@Test
	@DisplayName("AssumeThat")
	void asuncionThatMAL() {		
		
		boolean asuncion = false;
		
		assumingThat(asuncion, () -> {
			System.out.println("Esto SÓLO se imprimirá cuando la asunción se cumpla");	
		});
		
		System.out.println("Esto se imprimirá SIEMPRE");
		
	}
	
	
	
}
