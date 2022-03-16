package com.selenium.demo2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://m.facebook.com/");
        
        TakesScreenshot screenshot =(TakesScreenshot)driver;
        
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        
        try {
        	FileHandler.copy(src, new File("D:\\Selenium\\Screenshots\\test.png"));
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
