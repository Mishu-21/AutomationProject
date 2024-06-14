/*
 TestCase3---->Ensure login fails with incorrect email and password.


Source Page Needed:
 LoginPage 
 
 */


package Project1_Test;

import org.testng.annotations.Test;

import Project1_Source.Amazon_LoginPage;

public class TestCase3_LoginFail extends LaunchQuit
{

	@Test
	public void testcase3() throws InterruptedException
	{
		Amazon_LoginPage l1= new Amazon_LoginPage(driver);
		l1.incorrect_username();
		l1.ContinueButton();
		l1.incorrect_Password();
		l1.SignInButton();
	}
}
