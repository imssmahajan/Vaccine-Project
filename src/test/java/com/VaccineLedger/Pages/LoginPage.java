package com.VaccineLedger.Pages;

import org.openqa.selenium.By;

import com.VaccineLedger.Utility.BaseClass;

public class LoginPage extends BaseClass {

	// Objects

	static By txt_Email = By.name("email");
	static By btn_SignIn = By.xpath("//button[text()='Sign In']");
	static By btn_Verificar = By.xpath("//button[@type='submit']");
	static By otp_Column_1 = By.xpath("//input[@id='otp0']");
	static By otp_Column_2 = By.xpath("//input[@id='otp1']");
	static By otp_Column_3 = By.xpath("//input[@id='otp2']");
	static By otp_Column_4 = By.xpath("//input[@id='otp3']");

	// FUNCTIONS
	public static void login(String email) {
		driver.findElement(txt_Email).sendKeys(email);
	}

	public static void clickon_SignIn() {
		driver.findElement(btn_SignIn).click();
	}

	public static void otp_Verification() {
		driver.findElement(otp_Column_1).sendKeys("1");
		driver.findElement(otp_Column_2).sendKeys("2");
		driver.findElement(otp_Column_3).sendKeys("3");
		driver.findElement(otp_Column_4).sendKeys("4");
	}

	public static void btn_Verifiacar() {
		driver.findElement(btn_Verificar).click();
	}
}
