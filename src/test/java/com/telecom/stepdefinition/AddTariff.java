package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.telecom.resources.Commonaction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddTariff extends Commonaction {
      Commonaction common = new Commonaction();
      
	@Given("user enter telecom website")
	public void user_enter_telecom_website() {
	    common.launch("http://www.demo.guru99.com/telecom/");
		
	}
	@Given("click add tariff plan")
	public void click_add_tariff_plan() {
		
	   common.clickTariff(driver.findElement(By.xpath("//*[text()='Add Tariff Plan']")));
	}

	@When("user enter all Fields using one dim list concept")
	public void user_enter_all_Fields_using_one_dim_list_concept(DataTable dataTable) {
		List<String> data = dataTable.asList(String.class);
		driver.findElement(By.id("rental1")).sendKeys(data.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(data.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(data.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(data.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(data.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(data.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(data.get(6));
	  
	}

	@When("click Submit button")
	public void click_Submit_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	   
	}

	@Then("navigate to congratulation page")
	public void navigate_to_congratulation_page() {
	    WebElement congrats = driver.findElement(By.xpath("//*[text()='Congratulation you add Tariff Plan']"));
	    String compare = congrats.getText();
	    Assert.assertEquals(compare, "Congratulation you add Tariff Plan");
	    System.out.println("The Assert  are equal");
	    driver.quit();
	}

	@When("user enter all Fields using one dim map concept")
	public void user_enter_all_Fields_using_one_dim_map_concept(DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(data.get("rental"));
		driver.findElement(By.id("local_minutes")).sendKeys(data.get("flocal"));
		driver.findElement(By.id("inter_minutes")).sendKeys(data.get("fintmin"));
		driver.findElement(By.id("sms_pack")).sendKeys(data.get("fsms"));
		driver.findElement(By.id("minutes_charges")).sendKeys(data.get("lperm"));
		driver.findElement(By.id("inter_charges")).sendKeys(data.get("intperm"));
		driver.findElement(By.id("sms_charges")).sendKeys(data.get("smsp"));
	}

	@When("user enter all Fields{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_all_Fields(String rental, String flocal, String fintmin, String fsms, String lperm, String intperm, String smsp) {
		driver.findElement(By.id("rental1")).sendKeys(rental);
		driver.findElement(By.id("local_minutes")).sendKeys(flocal);
		driver.findElement(By.id("inter_minutes")).sendKeys(fintmin);
		driver.findElement(By.id("sms_pack")).sendKeys(fsms);
		driver.findElement(By.id("minutes_charges")).sendKeys(lperm);
		driver.findElement(By.id("inter_charges")).sendKeys(intperm);
		driver.findElement(By.id("sms_charges")).sendKeys(smsp);
	}

    
}
