package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps 
{
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open()
	{
		System.out.println("Inside step- browser is open");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page()
	{
		System.out.println("Inside step-user is on google search page");
		driver.navigate().to("https://google.com");

	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException
	{
		System.out.println("Inside step-user enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		Thread.sleep(2000);

	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException
	{
		System.out.println("Inside step- hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);


	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results()
	{
		System.out.println("Inside step- user is navigated to search results");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();

	}
}
