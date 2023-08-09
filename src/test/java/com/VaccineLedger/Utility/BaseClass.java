
package com.VaccineLedger.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {

	public static WebDriver driver;

	public static void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "G:\\Software\\Webdrivers\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions obj = new ChromeOptions();
		obj.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(obj);
		driver.manage().window().maximize();

	}

	public static void openapplication(String url) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to(url);
		driver.manage().deleteAllCookies();
	}

	public static void closeapplication() {
		driver.quit();

	}
	
	
	
	
}
