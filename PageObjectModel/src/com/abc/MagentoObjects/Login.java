package com.abc.MagentoObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login 
{
	WebDriver driver;
	By email=By.id("email");
	By password=By.id("pass");
	By login=By.xpath("//span[text()='Login']");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeEmail()
	{
		driver.findElement(email).sendKeys("mzaidurrahman@gmail.com");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("Welcome123");
	}
	
	public void clickOnLogin()
	{
		driver.findElement(login).click();
	}
}
