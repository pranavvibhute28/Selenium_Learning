package ppv;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver =  new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		
		driver.switchTo().frame("iframeResult");//frames
		
		WebElement checkbox = driver.findElement(By.name("vehicle1"));
		checkbox.click();//select checkbox
		Thread.sleep(3000);
		checkbox.click();//deselect checkbox
		Thread.sleep(3000);
		
		//select all checkboxes
		
		List<WebElement> cblist = driver.findElements(By.xpath("//input[@type='checkbox']"));//get all elements list or checkbox list
		
		for(WebElement cb : cblist)
		{
			if(!cb.isSelected())//check if checkbox is selected... if not then select it
			{
				cb.click();
			}
		}
		Thread.sleep(3000);
		driver.close();

	}

}
