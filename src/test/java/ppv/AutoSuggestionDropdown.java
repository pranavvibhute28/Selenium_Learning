package ppv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com");
		Thread.sleep(2000);
		
//		if(driver.findElement(By.className("a5c71b0007"))!= null)
//		{
//			driver.findElement(By.xpath("//button[@type='button']")).click();
//		}
		
		WebElement wb = driver.findElement(By.name("ss"));
		
		wb.click();
		wb.sendKeys("pu");
		Thread.sleep(4000);
		wb.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		wb.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		driver.close();

	}

}
