package Project1_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_EditProfilePage {

	WebDriver driver;
	
	@FindBy(xpath="(//div[@class='a-row a-ws-row']/span/span)[1]")
	WebElement edit_name; 
	
	@FindBy(id="ap_customer_name")
	WebElement name_field;
	
	@FindBy(id="cnep_1C_submit_button")
	WebElement saveChanges;
	
	@FindBy(linkText = "Login and Security")
	WebElement LoginandSecurity_Text;
	
	public void Edit_Name(WebDriver driver)
	{
		edit_name.click();
		name_field.sendKeys(Keys.CONTROL+"a");
		name_field.sendKeys(Keys.CONTROL+"x");
		name_field.sendKeys("Himanshi Chauhan");
		saveChanges.click();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Login and Security","Name is not edited successfully");
	}
	
	public Amazon_EditProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
