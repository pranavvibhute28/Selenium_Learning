package ppv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements_Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(list);
		
		System.out.println("get size : "+driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).getSize());
		System.out.println("get location : "+driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).getLocation());
		System.out.println("is enabled : "+driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).isEnabled());
		System.out.println("is displayed : "+ driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).isDisplayed());
		System.out.println("get tag name : " + driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).getTagName());
		System.out.println("get text : " + driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).getText());
		
		
		
		driver.navigate().to("https://www.google.com/");
		
		driver.close();
		

	}

}
