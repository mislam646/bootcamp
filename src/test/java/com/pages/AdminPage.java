package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how =How.XPATH, using ="//*[@name='txtUsername']")
	private static WebElement username;
	
	@FindBy (how =How.XPATH, using ="//*[@name='txtPassword']")
	private static WebElement password;
	
	

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		AdminPage.password = password;
	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		AdminPage.username = username;
	}
	
	

}
