package com.telecom.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonaction {
  public static WebDriver driver;
 
	public void launch( String url) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void clickTariff(WebElement ele) {
	  ele.click();

	}
}
