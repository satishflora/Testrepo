package com.test;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testdrivermanager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
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