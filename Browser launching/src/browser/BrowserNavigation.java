package browser;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raviy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://www.tutorialspoint.com/index.htm";
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		driver.navigate().refresh();
        driver.close();
	}
}