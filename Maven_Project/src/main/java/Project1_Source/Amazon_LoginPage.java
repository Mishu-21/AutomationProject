package Project1_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Amazon_LoginPage {

	WebDriver driver;
	//Step 1
	@FindBy(id="ap_email")
	WebElement un_tf;
	
	
	@FindBy(id="continue")
	WebElement continue_Button;
	
	@FindBy(id="ap_password")
	WebElement pwd_tf;
	
	@FindBy(id="signInSubmit")
	WebElement signin_Button;
	
	@FindBy(id="nav-link-accountList")
	WebElement Hover_Account;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement seachBox;
	//Step 2
	public void username()
	{
		un_tf.sendKeys("+917834898482");
	}
	
	
	public void incorrect_username()
	{
		un_tf.sendKeys("+917834898486");
	}
	
	@FindBy(linkText="Sign Out")
	WebElement signOut;
	
	public void ContinueButton() throws InterruptedException
	{
		continue_Button.click();
		Thread.sleep(1000);
		Assert.assertTrue(signin_Button.isDisplayed(),"Not succesfully-login ie login fail");

	}
	
	public void Password()
	{
		pwd_tf.sendKeys("Himanshi21@Chauhan");
	}
	
	
	public void incorrect_Password()
	{
		pwd_tf.sendKeys("Himanshi21");

	}
	public void SignInButton()
	{
		signin_Button.click();
	}
	
	//so to logout first we need to hover over account and than click on sign-out
	public void logout(WebDriver driver)
	{
		Actions a1=new Actions( driver);
        
        a1.moveToElement(Hover_Account).perform();
        signOut.click();
	}
	//Step 3
	public Amazon_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
