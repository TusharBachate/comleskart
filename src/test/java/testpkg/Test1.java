package testpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pom.HomePage;

public class Test1 {

	WebDriver driver;
	
	HomePage HP;
	
	@BeforeClass
	public void Browserintilization() 
	{
		Base.browsersetup.getbrowser("Chrome", "dev");
	}
	
	@BeforeMethod
	public void Beforemethod() {
		HP = new HomePage(driver);
	}
	
	@Test 
	public void test1() {
		
	}
	
	@AfterMethod
	public void Aftermethod() {}
	
	@AfterClass
	public void AfterClass() {}
}
