package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NaviToXeroTest {
@Test
 
  public static void main(String[] args) {

  WebDriver driver=null;
	System.setProperty("webdriver.gecko.driver","C:\\Users\\rajan\\eclipse-workspace\\seleniumAutomation\\src\\utility\\geckodriver.exe");
	driver=new FirefoxDriver();
	System.out.println("Pass: Firefox driver is launched");
	 
  driver.get("https://login.xero.com/");
  	    
  	    
  driver.findElement(By.xpath("//input[@id='email']")); {
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("user@gmail.com");
	   System.out.println("Pass:User name is enterd in user name field");
	   driver.findElement(By.xpath("//input[@id='password']"));{
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pwd");
		   System.out.println("Pass:User name is entered in user name field");

		   driver.findElement(By.xpath(" //button[@id='submitButton']")); {
		    	   driver.findElement(By.xpath(" //button[@id='submitButton']")).click();
		        System.out.println("pass: Login button is clicked");
		   
		    	System.out.println("Fail: Login button does not exit, please check your application");}}}}}

