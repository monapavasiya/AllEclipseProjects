package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDemoSteps 
{
	WebDriver driver = null;
	
	@Before(order =1)
	//@Before("@smoke")
	public void browserSetup() 
	{
		System.out.println("I am inside browser setup");
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Before(order = 0)
	public void setup2()
	{
		System.out.println("i am inside setup2 \n");
	}
	
	@After(order = 1)
	public void teardown()
	{
		System.out.println("I am inside tearDown");
		driver.close();
		driver.quit();
	}
	
	@After(order = 2)
	public void tearDown2()
	{
		System.out.println("I am inside teardown2 \n");
	}
	
	@BeforeStep
	public void beforeSteps()
	{
		System.out.println("--- I am inside beforesteps---");
	}
	
	@AfterStep
	public void afterSteps()
	{
		System.out.println("--- I am inside afterstep---");
	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {

	}


}
