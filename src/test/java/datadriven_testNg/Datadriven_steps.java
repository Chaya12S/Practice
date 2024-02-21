package datadriven_testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Datadriven_steps {
	WebDriver driver;
	@Given("User Opens the browser and navigates to V1 Training Form website")
	public void user_opens_the_browser_and_navigates_to_v1_training_form_website() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/simple-form");
		driver.manage().window().maximize(); 
	}

	@When("User entres First Name,Last Name,Email")
	public void user_entres_first_name_last_name_email() {
		driver.findElement(By.id("firstName")).sendKeys("Chaya");
		driver.findElement(By.id("lastName")).sendKeys("BV");
		driver.findElement(By.id("email")).sendKeys("chaya@gmail.com"); 
	  
	}

	@When("Contact Number, Message")
	public void contact_number_message() {
		driver.findElement(By.id("number")).sendKeys("1234566778");
		driver.findElement(By.xpath("//div[@class='field']//textarea")).sendKeys("hello world"); 
	
	}

	@When("User Clicks on Submit")
	public void user_clicks_on_submit() {
	driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	    
	}

	@Then("Confirmation Popup is displayed")
	public void confirmation_popup_is_displayed() {
			System.out.println("Confirmation is Displayed");
			driver.quit();
	}
	    
	}

	

