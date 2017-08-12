package com.autotest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.autotest.framework.BasePage;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) throws Exception {
		super(driver,
				"C:/Users/Sridhar/workspace/autotest/src/main/resources/com/autotest/pages/AccountPage.properties");
		// TODO Auto-generated constructor stub
	}

	// 3. Get account info
	public String getAccountInfo() {
		WebElement acctInf = driver.findElement(By.className(props.getProperty("accountInfo")));
		return acctInf.getAttribute("innerHTML");

	}

}
