/*
 TestCase2---->verify login is successful with correct email and password.


Source Page Needed:
 LoginPage 
 */


package Project1_Test;

import org.testng.annotations.Test;

import Project1_Source.Amazon_LoginPage;

public class TestCase2_LoginSuccessful extends LaunchQuit{

	@Test
	public void testcase2()throws InterruptedException 
	{
		Amazon_LoginPage l1= new Amazon_LoginPage(driver);
		l1.username();
		l1.ContinueButton();
		l1.Password();
		l1.SignInButton();
		
	}
	
}
