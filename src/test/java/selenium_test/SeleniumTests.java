package selenium_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.app.SeleniumTools;

public class SeleniumTests {

	public WebDriver driver;
	
	@Test
	@DisplayName("Login standard_user")
	void loginOK() {
		driver = SeleniumTools.getDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String titleText = driver.findElement(By.className("title")).getText();
		
		assertEquals("PRODUCTS", titleText);
		
		SeleniumTools.tearDown();
		
	}
	
	@Test
	@DisplayName("Login error user")
	void loginKO() {
		driver = SeleniumTools.getDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String titleText = driver.findElement(By.className("error-message-container")).getText();
		
		assertTrue(titleText.contains("user has been locked out."));
		
		SeleniumTools.tearDown();
		
	}
	
	
	
}