package com.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.autotest.framework.BasePage;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) throws Exception {
		super(driver, "C:/Users/Sridhar/workspace/autotest/src/main/resources/com/autotest/pages/HomePage.properties");
		// TODO Auto-generated constructor stub
	}

	// 3. Create navigate to home page method

	public void navigate() {
		driver.get(props.getProperty("url"));
	}

	// 3.1 click on login link

	public void clickLoginLink() {
		WebElement loginLink = driver.findElement(By.xpath(props.getProperty("loginLink")));
		loginLink.click();
	}

	// 4. Create login method
	public void login(String username, String password) {
		WebElement unWe = driver.findElement(By.id(props.getProperty("username")));
		WebElement psWe = driver.findElement(By.id(props.getProperty("password")));
		WebElement loginButton = driver.findElement(By.xpath(props.getProperty("loginButton")));
		unWe.sendKeys(username);
		psWe.sendKeys(password);
		loginButton.click();
	}

}
