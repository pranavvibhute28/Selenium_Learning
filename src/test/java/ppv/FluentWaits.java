package ppv;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaits {

    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();

        EdgeDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        // Create Fluent Wait
        Wait<EdgeDriver> wait = new FluentWait<>(driver)

                // Maximum wait time
                .withTimeout(Duration.ofSeconds(30))

                // Polling interval
                .pollingEvery(Duration.ofSeconds(2))

                // Ignore exception
                .ignoring(NoSuchElementException.class);

        // Wait until Electronics menu appears
        WebElement el1 = wait.until(driver1 ->
                driver1.findElement(
                        By.xpath("//li[@data-currenttabindex='3']//span")
                )
        );

        // Mouse hover
        Actions action = new Actions(driver);

        action.moveToElement(el1).perform();

        System.out.println("Mouse Hover Successful");

        driver.quit();
    }
}