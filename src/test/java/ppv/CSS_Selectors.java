package ppv;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS_Selectors {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		
//		driver.manage().window().maximize();
		
//		driver.get("https://www.salesforce.com/products/free-trial/developer/");
//		driver.findElement(By.cssSelector("input#:r2:")).sendKeys("hiii");
//		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("hii");
//		driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input")).sendKeys("fghjk");
		
//		driver.get("https://www.saucedemo.com/");
//		driver.findElement(By.cssSelector("input#user-name")).sendKeys("hiii");

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.cssSelector("input.form-control[placeholder='First Name']")).sendKeys("pranav");
//		driver.findElement(By.cssSelector("textarea.'form-control ng-pristine ng-valid ng-touched\'")).sendKeys("islampur");
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("islampur");
		
		driver.findElement(By.cssSelector("select#Skills>option[value='Android']"));
		List<WebElement> options = driver.findElements(By.xpath("//*[@id=\"Skills\"]/option[1]"));
		
		System.out.println(options);
		


	}

}
