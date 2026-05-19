package ppv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html?utm_source=chatgpt.com");
		
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(btn).perform();
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}
