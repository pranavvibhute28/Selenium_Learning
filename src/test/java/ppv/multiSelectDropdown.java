package ppv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiSelectDropdown {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationcentral.com/demo/dropdown.html");
		driver.findElement(By.xpath("/html/body/div[2]/main/div/div[1]/button[3]")).click();
		
		WebElement id = driver.findElement(By.xpath("//*[@id=\"multi-select-dropdown\"]/select"));
		
		Select s= new Select(id);
		
		s.selectByVisibleText("Option 3");
		Thread.sleep(2000);
	
		s.selectByIndex(0);
		Thread.sleep(2000);
		
		s.selectByValue("option2");
		Thread.sleep(2000);
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
