package ppv;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		List<WebElement> wb = driver.findElements(By.name("radiooptions"));
		
		for(WebElement value : wb)
		{
			if(value.getAttribute("value").equals("Male"))
			{
				value.click();
			}
		}
		driver.close();
	}

}
