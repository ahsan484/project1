package com.abc.ahsanseleniums;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class browsers {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//how to open a web browser and web site 
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SAM18\\eclipse-workspace\\ahsanseleniums\\src\\Drivers\\chromedriver.exe");
driver=new ChromeDriver();
	//driver.get("https://www.protrainingtech.com");
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(6000);
	//driver.navigate().back();
	//Thread.sleep(2000);
	driver.navigate().forward();
	//System.out.println(driver.getCurrentUrl());
	//String windowhandle=driver.getWindowHandle();
	//System.out.println(windowhandle);
	WebElement CreateAccount=driver.findElement(By.partialLinkText("Create new"));
	CreateAccount.click();
	Thread.sleep(6000);
	
	WebElement first_name=  driver.findElement(By.name("firstname"));
	first_name.sendKeys("Ahsan");
	WebElement last_name=  driver.findElement(By.name("lastname"));
	last_name.sendKeys("Mustafa");
	WebElement email=  driver.findElement(By.name("reg_email__"));
	email.sendKeys("ahsan.mustafa484@gmail.com");
	
	WebElement reenter_email= driver.findElement(By.name("reg_email_confirmation__"));
	reenter_email.sendKeys("ahsan.mustafa484@gmail.com");
	
	WebElement passwords=  driver.findElement(By.name("reg_passwd__"));
	passwords.sendKeys("Password");	
	Thread.sleep(6000);
	
	WebElement bday_month=  driver.findElement(By.name("birthday_month"));
	Select ob1= new Select(bday_month);
	ob1.selectByVisibleText("Dec");
	
	WebElement bday_date=  driver.findElement(By.name("birthday_day"));
	Select ob2= new Select(bday_date);
	ob2.selectByVisibleText("10");
	Thread.sleep(6000);
	
	WebElement bday_year=  driver.findElement(By.name("birthday_year"));
	Select ob3= new Select(bday_year);
	ob3.selectByVisibleText("2000");
	
	Thread.sleep(6000);
	
	//xpath relitive x path
	WebElement FirstName=  driver.findElement(By.xpath("//*[@name='firstname']"));
	FirstName.sendKeys("-khan");	
	
	
	
	
	
	}

}
