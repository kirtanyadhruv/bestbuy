package bestbuyproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Signuplogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ystem.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver = new ChromeDriver();
		
		driver.get("https://www.bestbuy.com");
		
	}
	WebElement US = wait.until(ExpectedConditions.elementToBeClickable(
			By.xpath("(//div[@class='country-selection']//h4[text()='United States']/..)[1]")));
	US.click();
	WebElement accountButton = wait
			.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Account']")));
	accountButton.click();

	WebElement createAccount = wait.until(ExpectedConditions.elementToBeClickable(
			By.xpath("//a[@class='c-button c-button-outline c-button-sm create-account-btn']")));
	createAccountButton.click();
	WebElement firstNameField = driver.findElement(By.id("firstName"));
	WebElement lastNameField = driver.findElement(By.id("lastName"));
	WebElement emailField = driver.findElement(By.id("fld-e"));
	WebElement passwordField = driver.findElement(By.id("fld-p1"));
	WebElement createAccountSubmitButton = driver.findElement(By.xpath("//button[text()='Create Account']"));

	firstNameField.sendKeys("First");
	lastNameField.sendKeys("Last");
	emailField.sendKeys("dineshpria29517.com");
	passwordField.sendKeys("priya98765");
	createAccountSubmitButton.click();

public void loginTest() {
	
	driver.get("https://www.bestbuy.com");

	WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign In")));
	signInButton.click();

	WebElement signInEmailField = wait.until(ExpectedConditions.elementToBeClickable(By.id("fld-e")));
	WebElement signInPasswordField = driver.findElement(By.id("fld-p1"));
	WebElement signInSubmitButton = driver.findElement(By.xpath("//button[text()='Sign In']"));

	signInEmailField.sendKeys("dineshpriya29517@gmail.com");
	signInPasswordField.sendKeys("priya98765");
	signInSubmitButton.click();
}

	driver.quit();
}
}

	}

}
