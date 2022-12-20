package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateLeadStepDefinition extends BaseClass {

	
	
	@When("Enter the companyName as (.*)$")
	public CreateLeadStepDefinition enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	
	@And("Enter the firstName as (.*)$")
	public CreateLeadStepDefinition enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}
	@And("Enter the LastName as (.*)$")
	public CreateLeadStepDefinition enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}
	
	@And("Click on the CreateLeads Button")
	public ViewLeadPageStepDefintion clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		String titile=driver.getTitle();
		if (titile.contains("View Lead")) {
			System.out.println("View Lead Page is displayed");
		}
		else {
			System.out.println("View Lead Page is  not displayed");

		}
		return new ViewLeadPageStepDefintion();
	}

}