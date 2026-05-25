package ppv;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSSLCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.edgedriver().setup();
		
		//create edge options to customize browser behaviour
		EdgeOptions options = new EdgeOptions();
		
		//Accept invalid SSL certifications
		options.setAcceptInsecureCerts(true);
		
		//Browser Starts with SSL validation disabled
		EdgeDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
		

	}

}
