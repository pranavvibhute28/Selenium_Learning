package ppv;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newDemoMaven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.edgedriver().setup();
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");

	}

}
