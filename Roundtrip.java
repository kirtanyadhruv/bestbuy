package spicejetproject;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Roundtrip 
{
public static void main(String[] args) throws InterruptedException
		{
			
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.spicejet.com");
				Thread.sleep(30000);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
				
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
				
				driver.findElement(By.linkText("Mumbai (BOM)")).click();
				
				driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
				
				driver.findElement(By.linkText("Bengaluru (BLR)")).click();
				
					
				WebElement FromDateWidget = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]"));
				
				List<WebElement> columns1 = FromDateWidget.findElements(By.tagName("td"));
				
				for(WebElement cell1: columns1)
				{
					if(cell1.getText().equals("27"))
					{
						cell1.findElement(By.linkText("27")).click();
						break;
					}
				}
				
				
				WebElement ToDateWidget = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]"));
				
				List<WebElement> columns2 = ToDateWidget.findElements(By.tagName("td"));
				
				for(WebElement cell2: columns2)
				{
					if(cell2.getText().equals("1"))
					{
						cell2.findElement(By.linkText("1")).click();
						break;
					}
				}
				
				
				
					
				Select AdultDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
				
				AdultDropdown.selectByValue("2");
				
				Select ChildDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
				
				ChildDropdown.selectByValue("2");
				
				Select InfantDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
				
				InfantDropdown.selectByValue("2");
				
				Select Currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
				
				Currency.selectByValue("USD");
				
				driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
				
	
			}

		
public void tearDown() {
	// Close the browser window
	driver.quit();
}

		}
