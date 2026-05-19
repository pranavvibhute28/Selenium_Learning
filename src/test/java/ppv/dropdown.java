package ppv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement id= driver.findElement(By.id("Skills"));
		
		Select s = new Select(id);
		
		s.selectByIndex(3);
		Thread.sleep(3000);
		
		s.selectByValue("Android");
		Thread.sleep(3000);
		
		s.selectByVisibleText("C");
		Thread.sleep(3000);
		driver.close();

	}

}
