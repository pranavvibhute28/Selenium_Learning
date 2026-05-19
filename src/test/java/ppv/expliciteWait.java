package ppv;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class expliciteWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ebay.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-currenttabindex='3']//span")));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();

		WebElement submenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Cameras and photo']")));
		
		submenu.click();
//		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
