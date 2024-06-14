package Project1_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_RegisterPage {

	
	WebDriver driver;
	@FindBy(id="ap_customer_name")
	WebElement Name;
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="ap_password_check")
	WebElement confirm_password;
	

	@FindBy(id="continue")
	WebElement continue_email;
	
	
	@FindBy(id="aacb-captcha-header")
	WebElement verify_Text;
	
	@FindBy(id="cvf-aamation-challenge-iframe")
	WebElement iframe;
	
	public void username()
	{
		Name.sendKeys("Himanshi Chauhan");
	}
	
	
	public void email()
	{
		email.sendKeys("9667203182him@gmail.com");
	}
	
	
	public void Password()
	{
		password.sendKeys("AmazonProject1@");
	}
	
	public void ReEnter_Password()
	{
		confirm_password.sendKeys("AmazonProject1@");
	}
	
	public void Continue_Button(WebDriver driver) throws InterruptedException
	{
		continue_email.click();
		Thread.sleep(1000);
		driver.switchTo().frame(iframe);
		Assert.assertTrue(verify_Text.isDisplayed(),"pass");
		
	}
	
	public Amazon_RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
