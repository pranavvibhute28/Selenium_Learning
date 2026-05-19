package ppv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(2000);
		
		WebElement draggable = driver.findElement(By.id("angular"));//Id of draggable item
		WebElement droppable = driver.findElement(By.id("droparea"));//ID of drop area
		
		Actions action = new Actions(driver);//create action
		
		action.dragAndDrop(draggable, droppable).perform();//perform drag and drop action
		Thread.sleep(2000);
		driver.close();

	}

}
