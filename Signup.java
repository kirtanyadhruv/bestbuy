package spicejetproject;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Signup {

	public static void main(String[] args) throws InterruptedException
	{
		
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.spicejet.com");
			Thread.sleep(30000);
			
	
			WebElement firstNameField = driver.findElement(By.id("firstName"));
			WebElement lastNameField = driver.findElement(By.id("lastName"));
			WebElement Countrynameselect = driver.findElement(By.id("form-control form-select "));
			WebElement Dobselect = driver.findElement(By.id("dobDate"));
			WebElement Mobilenumber = driver.findElement(By.id("tel"));
			WebElement emailField = driver.findElement(By.id("email_id"));
			WebElement password = driver.findElement(By.id("new-password"));
			WebElement confirmpassword= driver.findElement(By.id("c-password"));
			WebElement createAccountSubmitButton = driver.findElement(By.xpath("//button[text()='Create Account']"));

			firstNameField.sendKeys("firstNam");
			lastNameField.sendKeys("lastName");
			Countrynameselect.sendkeys("INDIA");
			Dobselect.sendkeys("04.08.89");
			Mobilenumber.sendkeys("9136585881");
			emailField.sendKeys("dineshpriya29517@gmail.com");
			password.sendKeys("Dhruv@1234567890");
			confirmpassword.sendkeys("Dhruv@1234567890");
			createAccountSubmitButton.click();
	}
	

		public void loginTest() {
			
			WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign In")));
			signInButton.click();

			// Fill in the login form
			WebElement signInEmailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("email_id")));
			WebElement signInPasswordField = driver.findElement(By.id("password"));
			WebElement signInSubmitButton = driver.findElement(By.xpath("//button[text()='Sign In']"));

			signInEmailField.sendKeys("dineshpriya29517@gmail.com");
			signInPasswordField.sendKeys("Dhruv@1234567890");
			signInSubmitButton.click();

		}

		public void tearDown() {
			// Close the browser window
			driver.quit();
		}
		}