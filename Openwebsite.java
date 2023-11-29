package bestbuyproject;
import java.io.IOException;
import java.time.Duration;

public class Openwebsite {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// to launch the website
		driver.get("https://www.bestbuy.com");
		
	}

}
