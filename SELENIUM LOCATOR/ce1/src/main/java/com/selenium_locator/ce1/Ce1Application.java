package com.selenium_locator.ce1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootApplication
public class Ce1Application {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Laptops")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("MacBook air")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Add to cart")).click();
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Cart")).click();
	}
}
