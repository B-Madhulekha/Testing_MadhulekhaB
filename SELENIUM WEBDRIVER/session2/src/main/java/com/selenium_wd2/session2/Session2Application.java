package com.selenium_wd2.session2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootApplication
public class Session2Application {

	public static void main(String[] args) {
		WebDriverManager.iedriver().setup();
	    WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.shoppersstop.com");
		driver.findElement(By.xpath("/html/body/main/header/div[1]/div/div[2]/div[2]/ul/li[4]/a/i")).click();
	}

}
