package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageStepDefintion extends BaseClass{

	@Given("Enter the username as {string}")
	public LoginPageStepDefintion enter_the_username_as(String string) {
		driver.findElement(By.id("username")).sendKeys(string);
		return this;
		
	}
	@Given("Enter the password as {string}")
	public LoginPageStepDefintion enter_the_password_as(String string) {
		driver.findElement(By.id("password")).sendKeys(string);
		return this;
	}
	@When("Click on  Login button")
	public WelcomePageStepDefintion click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePageStepDefintion();
	}
	

}