package spicejetproject;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flightstatus {

	public static void main(String[] args) throws InterruptedException
	{
		
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.spicejet.com");
			Thread.sleep(30000);

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	
driver.findElement(By.xpath(".//*[@id='externalLinks']/ul/li[1]")).click();
	
	driver.findElement(By.id("FlifoSearchInputCompactFlightStatus_originStation")).click();
	
	//Select OriginAirport = new Select(driver.findElement(By.id("FlifoSearchInputCompactFlightStatus_originStation")));
	Select OriginAirport = new Select(driver.findElement(By.xpath(".//*[@id='FlifoSearchInputCompactFlightStatus_originStation']")));
	OriginAirport.selectByValue("MAA");
	
	Select DestinationAirport = new Select(driver.findElement(By.id("FlifoSearchInputCompactFlightStatus_destinationStation")));
	DestinationAirport.selectByValue("DXB");
	

}
