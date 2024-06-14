/*
 TestCase4--->Check if a user can successfully edit their profile information.



 
 Source Page Needed:
 login page,Home page,YourAccount Page,Edit Profile Page
 */

package Project1_Test;

import org.testng.annotations.Test;

import Project1_Source.Amazon_EditProfilePage;
import Project1_Source.Amazon_HomePage;
import Project1_Source.Amazon_LoginPage;
import Project1_Source.Amazon_YourAccountPage;

public class TestCase4_EditProfileInformation extends LaunchQuit {
	
	@Test
	public void testcase4() throws InterruptedException
	{
		Amazon_LoginPage l1= new Amazon_LoginPage(driver);
		l1.username();
		l1.ContinueButton();
		l1.Password();
		l1.SignInButton();
		
		//now to click on edit profile -->first we need to hover over my account which can be done from any page--->lets use homepage
		Amazon_HomePage h1=new Amazon_HomePage(driver);
		h1.YourAccount_Click(driver);
		
		Amazon_YourAccountPage y1= new Amazon_YourAccountPage(driver);
		y1.LoginAndSecurity_Click();
		
		
		Amazon_EditProfilePage e1=new Amazon_EditProfilePage(driver);
		e1.Edit_Name(driver);
	
	}

}
