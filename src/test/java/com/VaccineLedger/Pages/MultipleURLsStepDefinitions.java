package com.VaccineLedger.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleURLsStepDefinitions {

	private WebDriver driver;

	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Webdrivers\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(obj);
		driver.manage().window().maximize();

		// Create an instance of the WebDriver for the Chrome browser
		//driver = new ChromeDriver();
	}

	@When("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String url) throws Throwable {
		// Navigate to the URL
		driver.navigate().to(url);
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws Throwable {
		// Close the browser
		driver.close();
	}

}
