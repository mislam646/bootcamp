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
	
	@FindBy (how =How.XPATH, using ="//*[@id='btnLogin']")
	private static WebElement login;
	
	@FindBy (how =How.XPATH, using ="//h1[contains(text(),'Dashboard')]")
	private static WebElement dashboard;
	
	

	public WebElement getDashboard() {
		return dashboard;
	}

	public void setDashboard(WebElement dashboard) {
		AdminPage.dashboard = dashboard;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		AdminPage.login = login;
	}

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
