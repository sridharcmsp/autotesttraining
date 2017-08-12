package com.autotest.framework;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BasePage {
	protected WebDriver driver;
	protected Properties props;

	public BasePage(WebDriver driver, String filePath) throws Exception {
		// 1. Initialise driver
		this.driver = driver;
		// 2. Initialise properties
		InputStream in = new FileInputStream(filePath);
		this.props = new Properties();
		props.load(in);
	}

}
