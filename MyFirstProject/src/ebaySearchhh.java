import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ebaySearchhh
{ 
	WebDriver driver;           //declare web driver
	
	
	
	public void launchbrowser() 
	{
		System.setProperty("webdriver.gecko.driver", "C:/Users/16474/Documents/Mona_QA_jars/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
	}
	
	
	public void searchProduct() throws InterruptedException 
	{
	
		Thread.sleep(2000);
		driver.findElement(By.id("gh-ac")).sendKeys("JBL speakers");
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(" Daily Deals")).click();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		ebaySearchhh obj = new ebaySearchhh();
		obj.launchbrowser();
		obj.searchProduct();
		
	}
    
	

}
