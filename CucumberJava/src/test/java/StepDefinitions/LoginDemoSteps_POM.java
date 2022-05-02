package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginDemoSteps_POM 
{
	WebDriver driver = null;
	LoginPage login;
	@Given("chrome is open")
	public void chrome_is_open()
	{
		System.out.println("=== i am inside LoginDemoSteps_POM===");
		System.out.println("Inside step- chrome is open");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
	}
	@When("user clicks on TestProject Demo")
	public void user_clicks_on_TestProject_Demo()
	{
		
		driver.getPageSource().contains("TestProject Demo");
	}
	

	@And("user on login page")
	public void user_on_login_page()
	{
		
		
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@Then("^user entering (.*) and (.*)$")
	public void user_entering_username_and_password(String username, String password) 
	{
		login = new LoginPage(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		//driver.findElement(By.id("name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
		
	}

	@And("user clicks on login")
	public void user_clicks_on_login() throws InterruptedException 
	{
		login.clickLogin();
		//driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException 
	{
		login.checkLogOutIsDisplayed();
		//driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
	}



}
