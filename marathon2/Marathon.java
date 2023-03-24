package marathon2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class Marathon {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get(" https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
	    driver.findElement(By.xpath("//input[@id='Login']")).click();
	    driver.findElement(By.xpath("//span[text()='Learn More']")).click();
	    Set<String> window = driver.getWindowHandles();
	    List<String> list=new ArrayList<String>(window);
	    driver.switchTo().window(list.get(1));
	    driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	    Shadow dom =new Shadow(driver);
	    dom.findElementByXPath("//span[text()='Learning']").click();
	    WebElement learn = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
	    Actions builder=new Actions(driver);
	    builder.moveToElement(learn).perform();
	    WebElement certificate = dom.findElementByXPath("//a[text()='Salesforce Certification']");
	    driver.executeScript("arguments[0].click();",certificate);
	    driver.findElement(By.xpath("//a[text()='Administrator']")).click();
	    System.out.println(driver.getTitle());
	    WebElement admin = driver.findElement(By.xpath("//div[text()='Related Credentials']"));
	    builder.scrollToElement(admin).perform();
	    List<WebElement> certificates = driver.findElements(By.xpath("//div[text()='Certification']/following::a[1]"));
	    System.out.println(certificates.size());
	    for (WebElement webElement : certificates) {
	    	System.out.println(webElement.getText());
			
		}
	
	
	}
	
	
	
	
	
	

}
