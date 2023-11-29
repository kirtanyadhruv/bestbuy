package bestbuyproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class Searchaddtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver = new ChromeDriver();
			driver.get("https://www.bestbuy.com");
			
				
				WebElement hamburgerMenuIcon = driver.findElement(By.id("header-menu-button"));
				hamburgerMenuIcon.click();

				
				WebElement homeappliances = driver.findElement(By.linkText("MultiovenMicrowave, coffee maker ");

				scrollToElement(homeappliances);
				homeappliances.click();

				WebElement homeappliances = driver.findElement(By.linkText("MultiovenMicrowave"));
				MultiovenMicrowave.click();
			
		WebElement addToCartButton = driver.findElement(By.cssSelector(".btn-primary.add-to-cart-button"));
				addToCartButton.click();

			
			}
		driver.quit();
			}


}
