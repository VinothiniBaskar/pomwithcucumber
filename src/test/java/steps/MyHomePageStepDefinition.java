package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;

public class MyHomePageStepDefinition extends BaseClass{
	@Given ("Click Leads Button")
	public MyLeadsPageStepDefiniton clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPageStepDefiniton();
	}

}
