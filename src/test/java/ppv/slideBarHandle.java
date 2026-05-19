package ppv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slideBarHandle {
	public static void main(String args[]) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://demo.automationtesting.in/Slider.html");
		Thread.sleep(2000);
		
		WebElement slider = driver.findElement(By.id("slider"));
		
		Actions action =new Actions(driver);
		
		action.dragAndDropBy(slider, 50, 0).perform();
		
		Thread.sleep(2000);
		
		driver.close();
	

	}

}
