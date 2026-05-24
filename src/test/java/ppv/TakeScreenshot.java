package ppv;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//create screenshot object of takescreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//capture screenshot and saves it in temporary file
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		//create destination where we need to save the screenshot (./ss/screenshot.png)-> save in currunt directory
		File destination = new File("C:\\Users\\lenovo\\Downloads\\Pranav_vibhute\\ss\\screenshot.png");
		
		//copies temporary screenshot into desired destination
		FileUtils.copyFile(source, destination);
		
		driver.close();

	}

}
