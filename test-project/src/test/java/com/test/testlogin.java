package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testlogin 
{
	
	public static void main (String[] args)
	
	{
	System.setProperty("webdriver.chrome.driver", "/home/trantorchd.com/satish.kumar/eclipse-workspace/test-project/browserdriver/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 String baseURL = "https://www.browserstack.com/";
	 String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	 String actualTitle = "";
	 driver.get(baseURL);
	 actualTitle = driver.getTitle();
	 
	 if(expectedTitle.equalsIgnoreCase(actualTitle))
	 {
	        System.out.println("Test Passed!");
	        } 
	else 
	    {
	            System.out.println("Test Failed");
	        }
	  driver.close();
	}
}