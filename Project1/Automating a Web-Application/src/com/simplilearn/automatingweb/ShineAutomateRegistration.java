package com.simplilearn.automatingweb;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShineAutomateRegistration {

	public static void main(String[] args) {
		//set property for web driver
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
	    
         WebDriver driver = new ChromeDriver();
		
         //For filling up the Registration Form
		driver.get("https://www.shine.com/registration/parser/");
		
		WebElement name=driver.findElement(By.cssSelector("#id_name"));
		name.sendKeys("Bhanu Prasanthi");
		
		WebElement email=driver.findElement(By.cssSelector("#id_email"));
		email.sendKeys("dugganabhanu@gmail.com");
		
		WebElement phone= driver.findElement(By.cssSelector("#id_cell_phone"));
		phone.sendKeys("9494082527");
		
		WebElement pass=driver.findElement(By.cssSelector("#id_password"));
		pass.sendKeys("Bhanu@66");
		
		WebElement check= driver.findElement(By.cssSelector("#id_privacy"));
		if(!check.isSelected())
		{
			check.click();
		}
		
		WebElement button= driver.findElement(By.cssSelector("#registerButton"));
		button.submit();
       
	}

}