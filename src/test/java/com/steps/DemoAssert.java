package com.steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAssert {

	public static void main(String[] args) {
		//Setting the system property
		//System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Opening browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//entering credentials
		driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
		//click on login button
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		
		//verify word on page
		String actual= driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
	    String expected = "Dashboard";
		Assert.assertEquals("the word does not match", expected, actual);

	}

}
