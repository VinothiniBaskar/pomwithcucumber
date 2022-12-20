package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ViewLeadPageStepDefintion extends BaseClass {
	public void verify() {
		String acualText="Vinothini";
		String Text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		Assert.assertEquals(acualText, Text);
		
//		if (text.contains("Vasanth")) {
//			System.out.println("Lead created successfully");
//		}
//		else {
//			System.out.println("Lead  not created ");
//
//		}

	}
}
