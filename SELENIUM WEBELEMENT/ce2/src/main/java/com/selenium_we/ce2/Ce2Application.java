package com.selenium_we.ce2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.bonigarcia.wdm.WebDriverManager;
@SpringBootApplication
public class Ce2Application {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://moneycontrol.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();

		
		String original=driver.getWindowHandle();
		for(String windowHandle: driver.getWindowHandles()){
			if(!original.contentEquals(windowHandle)){
				driver.switchTo().window(windowHandle);
				break;
			}
		}
	}
}
