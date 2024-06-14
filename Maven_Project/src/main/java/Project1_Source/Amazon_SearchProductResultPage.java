package Project1_Source;

import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_SearchProductResultPage {

	WebDriver driver;
	@FindBy(xpath="(//span[@class='a-declarative']/span/li)[5]")
	WebElement Mens_Running_Shoes;
	
	@FindBy(xpath="(//div[@id='p_36/range-slider_slider-item']/div/input)[2]")
	WebElement slider;
	
	@FindBy(xpath="(//div[@class='s-image-padding']/span/a)[5]")
	WebElement search_Result1;
	
	@FindBy(name="s")
	WebElement sort_By;
	
	@FindBy(xpath="//span[normalize-space()='Price: Low to High']")
	WebElement price_SortedSelected;
	
	@FindBy(xpath="(//input[@class='s-range-input'])[2]")
	WebElement Rightslider;
	
	public void Click_SearchedProduct(WebDriver driver)
	{
		
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
	      w1.until(ExpectedConditions.titleIs("Amazon.in : Shoe"));
		search_Result1.click();
		//as soon as we click on any product new window is getting launched so we need to handle it here only as after clicking the product new window is launched
		//to navigate my control from parent to child window
		
		Set<String> pancid=driver.getWindowHandles();
		System.out.println(pancid);
		Iterator<String> pc=pancid.iterator();
		String parentId=pc.next();
		String childId=pc.next();
		System.out.println(parentId);
		System.out.println(childId);
		driver.switchTo().window(childId);
	}
	
	
	public void sortBy_Price_LowToHigh(WebDriver driver) throws InterruptedException
	{
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
        w1.until(ExpectedConditions.titleIs("Amazon.in : Shoe"));
		Select s=new Select(sort_By);
		s.selectByVisibleText("Price: Low to High");
	
	//	Thread.sleep(2000);
		
	}
	
	public void sortBy_Review(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		Select s=new Select(sort_By);
		s.selectByVisibleText("Avg. Customer Review");
		//Thread.sleep(2000);
	}
	
	
	public void filter_By_Category(WebDriver driver) throws InterruptedException
	{
		  WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
	      w1.until(ExpectedConditions.titleIs("Amazon.in : Shoe"));
	      Mens_Running_Shoes.click();
	      Thread.sleep(5000);
	}
	
	public void filter_By_price_WhichIsSlider() throws InterruptedException
	{
		
	      for (int i=0;i<99;i++)
	  	{
	  		Rightslider.sendKeys(Keys.ARROW_RIGHT);
	  		
	  	}
	       
	      
	}
	
	
	public Amazon_SearchProductResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
