package Project1_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_HomePage {

	WebDriver driver;
	
	@FindBy(id="nav-link-accountList")
	WebElement Hover_Account;
	
	@FindBy(linkText = "Your Account")
	WebElement your_Account;
	

	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	
	public void searchBox_Shoe(WebDriver driver)
	{
		searchbox.sendKeys("Shoe");
		searchbox.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Amazon.in : Shoe","Successfully searched");
	}
	
	
	public void YourAccount_Click(WebDriver driver)
	{
		Actions a1=new Actions( driver);
        
        a1.moveToElement(Hover_Account).perform();
        your_Account.click();
	}
	
	public Amazon_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
