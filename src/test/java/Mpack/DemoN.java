package Mpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DemoN {


	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.id("alert")).click();
	}

}
