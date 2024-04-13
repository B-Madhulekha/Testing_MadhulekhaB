package com.selenium_locator.pah1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.bonigarcia.wdm.WebDriverManager;
@SpringBootApplication
public class Pah1Application {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[2]/div[2]/form/div[1]/div/input")).sendKeys("Shoes");
		driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[2]/div[2]/form/div[2]/button")).click();
		Thread.sleep(1000);
		
	    WebElement element=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/a/span[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		
	    WebElement elements=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[1]/a"));
		Actions actions=new Actions(driver);
		actions.moveToElement(elements).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/nav/ul/li[3]/ul/li[1]/ul/li[2]/a")).click();
	    driver.navigate().back();
	    driver.navigate().back();

		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div/a[2]/span[2]/span[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[4]/ol/li[3]/div/a/span/span/img")).click();
	    Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[1]/div/div/div[1]/div/div[3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[1]/div/div/div[2]/div/div[2]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[2]/div/div/div[1]/div/input")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[2]/div/div/div[1]/div/input")).sendKeys("4");
		Thread.sleep(1000);

		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[2]/div/div/div[2]/button")).click();
	}

}
