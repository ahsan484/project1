package com.abc.ahsanseleniums;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise1 {
	static WebDriver driver;
	
		
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	//how to open a web browser and web site 
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAM18\\eclipse-workspace\\ahsanseleniums\\src\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
		//driver.get("https://www.protrainingtech.com");
		driver.navigate().to("https://www.homedepot.com/");
	driver.manage().window().maximize();

		WebElement myAccount=driver.findElement(By.xpath("//*[@class='MyAccount__label SimpleFlyout__link--bold'][1]"));
		myAccount.click();
		//Thread.sleep(6000); we can also use implicit wait so as soon as it found element it will proceed further 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);//implecit wait 

		WebElement signin=driver.findElement(By.xpath("(//*[@class='bttn__content'])[2]"));
		signin.click();
		Thread.sleep(6000);
		
		WebElement createnew=driver.findElement(By.xpath("//*[@class='bttn__content']"));
		createnew.click();
		Thread.sleep(6000);
		
		WebElement personal=driver.findElement(By.xpath("(//*[@class='bttn__content'])[1]"));
		personal.click();
		Thread.sleep(6000);
		
		
		WebElement email=  driver.findElement(By.name("email"));
		email.sendKeys("ahsan.mustafa484@gmail.com");
		
		
		
		WebElement passwords=  driver.findElement(By.xpath("//*[@id='password-input-field']"));
		passwords.sendKeys("Selinium1234");	
		Thread.sleep(6000);
		
		
		WebElement phone=  driver.findElement(By.xpath("//*[@id='phone']"));
		phone.sendKeys("7037281508");
		WebElement checkbox=driver.findElement(By.xpath("(//*[@class='checkbox-btn__label-test u__text-align--left'])[2]"));
		checkbox.click();
		Thread.sleep(6000);
		WebElement createAc=driver.findElement(By.xpath("//*[@class='bttn__content']"));
		createAc.click();
		Thread.sleep(6000);
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.close();
	}
		

}
