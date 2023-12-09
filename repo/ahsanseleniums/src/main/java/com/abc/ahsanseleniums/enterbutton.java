package com.abc.ahsanseleniums;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class enterbutton {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//how to open a web browser and web site 
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SAM18\\eclipse-workspace\\ahsanseleniums\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
driver.manage().window().maximize();
Thread.sleep(6000);

	WebElement searchbox=driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
	searchbox.sendKeys("Laptop");
	Thread.sleep(6000);
	searchbox.sendKeys(Keys.ENTER);
	Thread.sleep(6000);
	driver.close();
	}


}
