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

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
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
	    driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
	    String salesforce = driver.findElement(By.xpath("(//h1[text()='Salesforce Architect'])/following-sibling::div[1]")).getText();
	    System.out.println(salesforce);
	    WebElement scroll = driver.findElement(By.xpath("//h1[text()='What is an Architect?']"));
	    builder.scrollToElement(scroll).perform();
	    List<WebElement> certificateList = driver.findElements(By.xpath("(//div[@class='credentials-card_title'])/a"));
	    for (int i = 0; i < certificateList.size(); i++) {
			System.out.println(certificateList.get(i).getText());
		}
	    Thread.sleep(2000);
	    WebElement architect = driver.findElement(By.xpath("//a[text()='Application Architect']"));
	    driver.executeScript("arguments[0].click();",architect);
	    List<WebElement> certicateList2 = driver.findElements(By.xpath("(//div[@class='credentials-card_title'])/a"));
	    for (int i = 0; i < certicateList2.size(); i++) {
			System.out.println(certicateList2.get(i).getText());
		}
	    
	    
	    
	}

}
