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
				
				//set username and password
				WebElement username = driver.findElement(By.name("username"));
				WebElement Pass = driver.findElement(By.name("password"));
//				String s2 = "arguments[0].value='Admin';"
//						+ "arguments[1].value='admin123';";
//				js.executeScript(s2,username,Pass);
				String s2 =
					    "arguments[0].value='Admin';" +
					    "arguments[0].dispatchEvent(new Event('input',{bubbles:true}));" +
					    "arguments[1].value='admin123';" +
					    "arguments[1].dispatchEvent(new Event('input',{bubbles:true}));";

					js.executeScript(s2, username, Pass);
				
				System.out.println(username.getAttribute("value"));
				System.out.println(Pass.getAttribute("value"));
				
				//highlighting a webelement
				WebElement btn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				
				String s3 = "arguments[0].style.backgroundColor = 'red';"+
							"arguments[0].click();";
				js.executeScript(s3, btn);
				Thread.sleep(2000);
				
				//Scroll till co-ordinates
				js.executeScript("window.scrollBy(0,100)");
				Thread.sleep(2000);
				
				//Scroll till element
				WebElement search = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[3]/p[1]"));
				String s4 = "arguments[0].scrollIntoView(true);";
				js.executeScript(s4, search);
				Thread.sleep(2000);
				driver.close();
		}
	
	}
