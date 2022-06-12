import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTests {

	public static WebDriver driver;
	
	@BeforeAll
	static void before_all() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeEach
	void before_each() {
		driver.get("https://www.saucedemo.com");
	}
	
	@Test
	@DisplayName("Login correcto")
	void test1() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String products = "";
		products = driver.findElement(By.className("title")).getText();
		
		assertEquals("PRODUCTOS",products);
	}
	
	@Test
	@DisplayName("Login incorrecto")
	void test2() {
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String mensajeError = ""; 
		mensajeError = driver.findElement(By.className("error-message-container")).getText();
		
		assertTrue(mensajeError.contains("login exitoso"), "El mensaje fue: "+mensajeError);
	}
	
	@AfterEach
	void after_each() {
		driver.manage().deleteAllCookies();
	}
	
	@AfterAll
	static void after_all() {
		if(driver != null) {
			driver.quit();
		}
	}
	
}
