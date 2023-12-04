package spicejetproject;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Onewaytrip {

public static void main(String[] args) throws InterruptedException
		{
			
				System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.spicejet.com");
				Thread.sleep(30000);
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
				
				//Select origin
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("DEL");
				
				driver.findElement(By.linkText("Delhi (DEL)")).click();
				
				//Select destination
				driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("BOM");
				
				driver.findElement(By.linkText("Mumbai (BOM)")).click();
				
				WebElement DateWidget = driver.findElement(By.id("ui-datepicker-div"));
				List<WebElement> columns = DateWidget.findElements(By.tagName("td"));
				
				for (WebElement cell: columns)
				{
					if (cell.getText().equals("24"))
					{
						cell.findElement(By.linkText("24")).click();
						break;
					}
				}
				
				Select AdultDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
				
				AdultDropdown.selectByValue("2");
				
				
				Select ChildrenDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
				
				ChildrenDropdown.selectByValue("1");
				
				
				Select InfantDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
				
				InfantDropdown.selectByValue("1");
				
				
				Select CurrencyDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
				
				CurrencyDropdown.selectByValue("INR");
				
				
				driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
				
				driver.findElement(By.xpath("//input[@type='radio'][contains(@value,'SG~ 161')]")).click();
				
				driver.findElement(By.id("ControlGroupSelectView_AgreementInputSelectView_CheckBoxAgreement")).click();
				
				driver.findElement(By.id("ControlGroupSelectView_ButtonSubmit")).click();
				

			}

public void tearDown() {
	// Close the browser window
	driver.quit();
}

		
}


