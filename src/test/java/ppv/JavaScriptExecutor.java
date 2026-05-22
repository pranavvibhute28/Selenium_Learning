package ppv;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			
			//implicit wait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			//creating javascript executors object
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			
			//returns webpage title
			String s1 = "return document.title";
			String title = (String) js.executeScript(s1);
			System.out.println(title);
			
			//set username
			WebElement username = driver.findElement(By.name("username"));
			js.executeScript("arguments[0].value='Admin';",username);
			
			Thread.sleep(4000);
			driver.close();
	}

}
