package com.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.AdminPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AdminSteps {
	WebDriver driver;
	AdminPage pf;
	
	@Given("^user go to Orange HRM home page$")
	public void user_go_to_Orange_HRM_home_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    pf = new AdminPage(driver);
	    
	}

	@Given("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
	  
	   //driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	   
	   pf.getUsername().sendKeys("Admin");
	   pf.getPassword().sendKeys("admin123");
	    
	}

	@When("^user click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
		
	    pf.getLogin().click();
	}
	
	@When("^user verify \"([^\"]*)\" word on page$")
	public void user_verify_word_on_page(String text) throws Throwable {
	    //String actual= pf.getDashboard().getText();
	    
		String actual= driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
	    String expected = "Dashboard";
		Assert.assertEquals("the word does not match", expected, actual);
	}

	@When("^user verify page title as \"([^\"]*)\"$")
	public void user_verify_page_title_as(String arg1) throws Throwable {
	    
	    
	}

	@Then("^user click on the admin tab$")
	public void user_click_on_the_admin_tab() throws Throwable {
	    
	    
	}

	@Then("^user select \"([^\"]*)\" under user role$")
	public void user_select_under_user_role(String arg1) throws Throwable {
	    
	    
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
	    
	    
	}

	@Then("^user verify \"([^\"]*)\" is dis played in result set$")
	public void user_verify_is_dis_played_in_result_set(String arg1) throws Throwable {
	    
	    
	}

	@Then("^user logout of Orange HRM$")
	public void user_logout_of_Orange_HRM() throws Throwable {
	    
	    
	}

}
