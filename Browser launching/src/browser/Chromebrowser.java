package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raviy\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	    WebDriver driver = new ChromeDriver();
	    String URL = "https://www.facebook.com/";
	    driver.get(URL);
	    driver.manage().window().maximize();
	    WebElement email = driver.findElement(By.id("email"));
	    email.sendKeys("rkreddy243@gmail.com");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("priyamadam@1");
	}
	
}