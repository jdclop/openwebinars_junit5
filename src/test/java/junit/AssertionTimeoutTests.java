package junit;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionTimeoutTests {

	@Test
	@DisplayName("AssertTimeout")
	void asercionTimeout() {		
		
		assertTimeout(Duration.ofSeconds(2), () -> {
			Thread.sleep(5000);
		});
				
	}
	
}
