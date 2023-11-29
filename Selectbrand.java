package bestbuyproject;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class Selectbrand {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static voidmain(String[] args) throws InterruptedException
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver = new ChromeDriver();
			driver.get("https://www.bestbuy.com");
		}
		public void testSelectAndAddBrand() {
			
	        WebElement hamburgerMenuIcon = driver.findElement(By.id("header-menu-button"));
	        hamburgerMenuIcon.click();

	    WebElement brandsCategory = driver.findElement(By.xpath("//a[contains(text(),'Brands')]"));
	        brandsCategory.click();

	          WebElement LGBrand = driver.findElement(By.xpath("//a[contains(text(),'LG')]"));
	    LG.click();

	}
}
			
