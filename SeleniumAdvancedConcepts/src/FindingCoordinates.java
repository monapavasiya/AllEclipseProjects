import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingCoordinates
{

	public static  void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\16474\\Documents\\Mona_QA_jars\\geckodriver.exe");
        WebDriver wd = new FirefoxDriver();
		wd.get("https://www.facebook.com/");
        Point p = wd.findElement(By.xpath("//button[@id='u_0_d_IF']")).getLocation();
		System.out.println(p.x);
		System.out.println(p.y);
		

	}

}
