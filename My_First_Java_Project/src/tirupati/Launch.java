package tirupati;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.selenium.dev/documentation/webdriver/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(9000);
		driver.navigate().forward();
		Thread.sleep(9000);
		

	}

}
