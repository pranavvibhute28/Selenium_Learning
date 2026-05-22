package ppv;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			//creating javascript executors object
			JavascriptExecutor js =  (JavascriptExecutor)driver;
			
			//returns webpage title
			String s1 = "return document.title";
			String title = (String) js.executeScript(s1);
			System.out.println(title);
			
			
			
			
			driver.close();
	}

}
