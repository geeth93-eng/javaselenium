package popupmethods;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver driver=new ChromeDriver();
  @Test
  public void simpleboxalert() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(5000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(3000);
  }
  @Test
  public void confirmationdialogbox() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/"); 
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(5000);
	  driver.switchTo().alert().dismiss();
    Thread.sleep(3000);

  }
  @Test
  public void promptdialogbox() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	  driver.findElement(By.xpath("//*[@id=\"post-748\"]/div/div/div/div/div/div/div/button")).click();
	  Thread.sleep(5000);
	  driver.switchTo().alert().sendKeys("Geethika");
	  driver.switchTo().alert().accept();
	  
  }
  
  
}

//Here test cases will be executed based on the alphabetical order;
