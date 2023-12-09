package com.abc.ahsanseleniums;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class calander {
		public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
					
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAM18\\eclipse-workspace\\ahsanseleniums\\src\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		
	driver.manage().window().maximize();

		WebElement Cal=driver.findElement(By.partialLinkText("//*[id='d1-btn']"));
		Cal.click();
		Thread.sleep(6000);
			

			
			
			//xpath relitive x path
			WebElement startdate=  driver.findElement(By.xpath("//*[@aria-label=' Nov 19,2023']"));
			startdate.click();	
			Thread.sleep(6000);
			startdate.click();
			Thread.sleep(6000);
			WebElement okbutton = driver.findElement(By.xpath("//*[@date-stid=\"apply-date-picker\"]"));
			okbutton.click();
			
			Thread.sleep(6000);
			driver.close();
			
			
			
		}

	}

	

