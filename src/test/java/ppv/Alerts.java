/*
 * Types of Alerts *
1) simple alert
2) confirmation alert 
3) prompt alert
*/

package ppv;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");//switched to frames
		
		WebElement button = driver.findElement(By.xpath("/html/body/button"));
		button.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();//switched to alerts
		System.out.println("Alert message : "+ alert.getText());//print alert message
		Thread.sleep(2000);
		
		alert.accept();//accept alert message
		Thread.sleep(2000);
		
		button.click();
		Thread.sleep(2000);
		alert.dismiss();//dismiss the popup
		
		button.click();
		alert.sendKeys("Pranav Vibhute");//enter text in alert
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		
		driver.close();
	}

}
