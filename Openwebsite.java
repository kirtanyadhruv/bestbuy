package spicejetproject;

	import java.io.IOException;
	import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Openwebsite {

		public static void main(String[] args) throws InterruptedException
		{
			
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.spicejet.com");
				Thread.sleep(30000);
				System.out.println("welcome spicejet");
			
	
			

}
		}
