package com.abc.Magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.MagentoObjects.Login;
import com.abc.MagentoObjects.Main;
import com.abc.MagentoObjects.Welcome;

public class MagentoTest {

	public static void main(String[] args) 
	{
		String url="https://www.magento.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		
		Login l=new Login(driver);
		l.typeEmail();
		l.typePassword();
		l.clickOnLogin();
		
		Main m=new Main(driver);
		m.clickOnLogout();
		
		driver.close();
				
		
		
			

				
			
				

	}

}
