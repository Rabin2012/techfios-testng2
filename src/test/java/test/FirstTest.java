package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest extends BasePage {
	WebDriver driver;
	
	@BeforeMethod
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");
	}
	@Test(priority=1)
	public void userShouldBeAbleToAddContact() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver = new ChromeDriver();

	// Set Certain properties
	// driver.manage().window().maximize();
	// driver.manage().deleteAllCookies();
	// Implicit Wait, Applies to all, Set it once at the beginning
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	// 2. Go to the techfios site,
	driver.get("http://techfios.com/test/billing/?ng=admin/");

	// 3. type user name and password and submit,
	driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
	driver.findElement(By.xpath("//button[contains(text(), 'Sign')]")).click();
		
}

	@Test(priority = 2)
	public void InvaliduserShouldBeAbleToAddContact() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcabc123");
		driver.findElement(By.xpath("//button[contains(text(), 'Sign')]")).click();

		By AlERT_MSG_LOCATOR = By.xpath("//div[@class=\"alert alert-danger fade in\"]");
		waitForElement(driver, 10, AlERT_MSG_LOCATOR);
	}
	@AfterMethod
	public void close() {
		
		driver.close();
		driver.quit();
	}
	
	}

