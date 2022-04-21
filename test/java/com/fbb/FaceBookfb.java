package com.fbb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookfb {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	
	WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("Pavi");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("123456");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();	
		
		
	}

}
