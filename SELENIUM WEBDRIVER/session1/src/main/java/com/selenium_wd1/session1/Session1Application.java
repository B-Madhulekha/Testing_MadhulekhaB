package com.selenium_wd1.session1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootApplication
public class Session1Application {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebDriverManager.firefoxdriver().setup();
		WebDriver fDriver=new FirefoxDriver();
		fDriver.get("https://www.google.com");
		WebDriverManager.edgedriver().setup();
		WebDriver eDriver=new EdgeDriver();
		eDriver.get("https://www.google.com");
	}

}
