package spicejetproject;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ticketbooking {
	public static void main(String[] args) throws InterruptedException
	{
		
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.spicejet.com");
			Thread.sleep(30000);

	 driver.manage().window().maximize();

     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   

 

 public void i_search_ticket_from_to_Depart_on_return_on(String depcity, String arricity, String depdate,

         String returndate) throws Throwable {

     // Select round trip

     driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();



     // Enter Depart city and arrival city

     driver.findElement(By.xpath("(//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction'])")).click();

     WebElement departcity = driver.findElement(By.xpath("(//a[@value='DEL'])"));

     departcity.click();

     Thread.sleep(2000);



     WebElement arrivalcity = driver.findElement(By.xpath("(//a[@value='BLR'])[2]"));

     arrivalcity.click();



     // Select Depart date

     String dep_bookdate = depdate.split("-")[0];

     String dep_bookmonth = depdate.split("-")[1];

     String dep_bookyear = depdate.split("-")[2];



     String currentmonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText()

             .trim();

     String currentyear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText()

             .trim();

     while (!currentmonth.equals(dep_bookmonth) || (!currentyear.equals(dep_bookyear))) {

         driver.findElement(By.xpath("(//span[text()='Next'])")).click();

         currentmonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]")).getText().trim();

         currentyear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[1]")).getText().trim();

     }



     List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));



     for (WebElement e : dates) {

         if (e.getText().trim().equals(dep_bookdate)) {

             e.click();

             break;

         }

     }



     // Select Return date

     WebElement returndatepicker = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]"));

     returndatepicker.click();



     String return_bookdate = returndate.split("-")[0];

     String return_bookmonth = returndate.split("-")[1];

     String return_bookyear = returndate.split("-")[2];



     String return_currentmonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]"))

             .getText().trim();

     String return_currentyear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[2]")).getText()

             .trim();



     while (!return_currentmonth.equals(return_bookmonth) || (!return_currentyear.equals(return_bookyear))) {

         driver.findElement(By.xpath("(//span[text()='Next'])")).click();

         return_currentmonth = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]")).getText()

                 .trim();

         return_currentyear = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'])[2]")).getText()

                 .trim();

     }



     List<WebElement> return_dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));



     for (WebElement e : return_dates) {

         if (e.getText().trim().equals(return_bookdate)) {

             e.click();

             break;

         }

     }



     // Click on Find Flights button

     driver.findElement(By.xpath("(//input[@id='ctl00_mainContent_btn_FindFlights'])")).click();

     Thread.sleep(5000);

 }



 @Then("^I close driver$")

 public void i_close_driver() {

     // Close the driver

     driver.close();

 }

}
s
