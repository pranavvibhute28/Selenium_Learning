package ppv;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandels {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

//        Thread.sleep(15000);

        // Open website
        driver.get("https://azure.microsoft.com/en-in/pricing/purchase-options/azure-account");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Store parent window
        String parentWindow = driver.getWindowHandle();

        // Click Sign In button
        driver.findElement(By.xpath("//span[@class='btn__text']")).click();
        
        // Get all windows
        Set<String> windows = driver.getWindowHandles();
        
//        Iterator<String>  iterator = windows.iterator();
        for(String window : windows)
        {
        	if(!window.equals(parentWindow))
        	{
        		driver.switchTo().window(window);
        	}
        }
        
        driver.findElement(By.name("loginfmt")).sendKeys("pranavvvibhute4141@gmail.com");
        Thread.sleep(5000);
        
        driver.quit();
    }
}
