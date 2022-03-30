package com.simplilearn.automatingweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShineAutomateLogin {

	public static void main(String[] args) {
		
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
		
        //For filling up the Registration Form
		driver.get("https://www.shine.com/myshine/login/");
		WebElement Email=driver.findElement(By.cssSelector("#id_email_login"));
		Email.sendKeys("dugganabhanu@gmail.com");
		
		WebElement Password=driver.findElement(By.cssSelector("#id_password"));
		Password.sendKeys("Bhanu@66");
		
		WebElement Button= driver.findElement(By.cssSelector("#cndidate_login_widget > form > ul.cls_base_1 > li.login_mid2.msitelogin_mid2.mt-3.d-flex.align-items-center.justify-content-between > div > button"));
		Button.submit();
		
	}

}