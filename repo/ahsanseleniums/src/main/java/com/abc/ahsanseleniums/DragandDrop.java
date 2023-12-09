
		package com.abc.ahsanseleniums;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
		public class DragandDrop {
			public static WebDriver driver;
			public static void main(String[] args) throws InterruptedException 
			{
				// TODO Auto-generated method stub
		//how to open a web browser and web site 
				
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SAM18\\eclipse-workspace\\ahsanseleniums\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			
		driver.manage().window().maximize();
		
driver.switchTo().frame(0);

			WebElement dragable=driver.findElement(By.xpath("//*[@id='draggable']"));
			WebElement dropable=driver.findElement(By.xpath("//*[@id='droppable']"));
			
			Thread.sleep(6000);
			
			Actions ob= new Actions(driver);
			ob.dragAndDrop(dragable, dropable).build().perform();
			
			Thread.sleep(6000);
			driver.close();
			
			}
		}
				
	