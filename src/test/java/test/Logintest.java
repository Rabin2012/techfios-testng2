package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Logintest {
	@Test
	public void Demoguru() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://techfios.com/test/billing/?ng=login/");
			
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[contains(text(), 'Sign')]")).click();		
					
			//driver.findElement(By.xpath("//*[contains(text(),'REGISTER')]")).click();
			
					 /** 
			 * driver.findElement(By.id("First Name")).sendKeys("Rabin ");
			 * driver.findElement(By.id("Last name")).sendKeys("Basnet");
			 * 
			 * driver.findElement(By.id("phone")).sendKeys("6827158397");
			 * driver.findElement(By.id("email")).sendKeys("rabinbasnet@gmail.com");
			 * driver.findElement(By.id("address")).sendKeys("5637 Coventry park Drive");
			 * driver.findElement(By.id("city")).sendKeys("Haltom");
			 * driver.findElement(By.id("state")).sendKeys("Texas");
			 * driver.findElement(By.id("Postal Code")).sendKeys("76117");
			 * driver.findElement(By.id("submit")).click();
			 */
		driver.close();
		driver.quit();
		}

}
