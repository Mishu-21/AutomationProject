package Project1_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_YourAccountPage {
	
	WebDriver driver;
	@FindBy(xpath="(//div[@class='ya-card-row']/div/a)[2]")
	WebElement login_and_security;
	
	@FindBy(xpath="(//div[@class='ya-card-row']/div/a)[1]")
	WebElement your_Order;
	
	@FindBy(xpath="//select[@name='timeFilter']")
	WebElement dropDown_Order;
	
	@FindBy(id="Write-a-product-review_2")
	WebElement product_Review;
	
	@FindBy(xpath="(//button[@class='ryp__star__button'])[5]")
	WebElement Star5Rating;
	
	@FindBy(xpath="//span[.='Clear']")
	WebElement starRatingClear_SoThatNextTimeRune_CanGiveRating;
	public void LoginAndSecurity_Click()
	{
		login_and_security.click();
	}
	
	public void YourOrder_Click() throws InterruptedException
	{
		your_Order.click();
		Thread.sleep(1000);
		Select s=new Select(dropDown_Order);
		s.selectByVisibleText("2023");
		Thread.sleep(1000);
		product_Review.click();
		Thread.sleep(1000);
		Star5Rating.click();
		Thread.sleep(2000);
		starRatingClear_SoThatNextTimeRune_CanGiveRating.click();
	}
	
	public Amazon_YourAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	
}
