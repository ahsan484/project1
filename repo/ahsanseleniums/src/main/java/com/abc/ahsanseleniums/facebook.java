package com.abc.ahsanseleniums;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//how to open a web browser and web site 
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SAM18\\eclipse-workspace\\ahsanseleniums\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
	//driver.get("https://www.protrainingtech.com");
	driver.navigate().to("https://www.facebook.com");
driver.manage().window().maximize();

	WebElement CreateAccount=driver.findElement(By.partialLinkText("Create new"));
	CreateAccount.click();
	Thread.sleep(6000);
		

		
		
		//xpath relitive x path
		WebElement FirstName=  driver.findElement(By.xpath("//*[@name='firstname']"));
		FirstName.sendKeys("-khan");	
		
		WebElement gender = driver.findElement(By.xpath("//*[contains(text(),'Female')]"));
		gender.click();
		
		Thread.sleep(6000);
		driver.close();
		
		
		
	}

}
