package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class AnnotationRepeatedTests {

	@RepeatedTest(value = 3, name = "{displayName} - {currentRepetition} / {totalRepetitions}")
	@DisplayName("RepeatedTest")	
	void testRepetido(RepetitionInfo ri) {
		System.out.println("Imprimo número de iteración: "+ri.getCurrentRepetition());
		System.out.println("Imprimo número total de iteraciones: "+ri.getTotalRepetitions());
	}	
	
}
