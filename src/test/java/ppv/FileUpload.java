package ppv;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		String path = "C:\\Users\\lenovo\\Downloads\\Pranav_vibhute\\Pranav_Vibhute_Resume_.pdf";
		
		driver.findElement(By.id("imagesrc")).sendKeys(path);
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
