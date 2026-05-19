package ppv;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImpliciteWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		//implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://demo.automationtesting.in/Slider.html");
		
		WebElement slider = driver.findElement(By.id("slider"));
		
		Actions action =new Actions(driver);
		
		action.dragAndDropBy(slider, 50, 0).perform();
		
		driver.close();

	}

}
