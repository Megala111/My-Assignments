package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.xpath(" //a[contains(text(),'CRM/SFA')] ")).click();
	    driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]")).click();
	    driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	    driver.findElement(By.xpath("(//img[contains(@src,'/images/fieldlookup.gif')])[1]")).click();
	    Set<String> setFrom= driver.getWindowHandles();
	    List<String> listFrom=new ArrayList<String>(setFrom);
	    driver.switchTo().window(listFrom.get(1));
	    driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	    driver.switchTo().window(listFrom.get(0));
	    driver.findElement(By.xpath("(//img[contains(@src,'/images/fieldlookup.gif')])[2]")).click();
	    Set<String> setTo= driver.getWindowHandles();
	    List<String> listTo=new ArrayList<String>(setTo);
	    driver.switchTo().window(listTo.get(1));
	    driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
	    driver.switchTo().window(listTo.get(0));
	    driver.findElement(By.className("buttonDangerous")).click();
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    System.out.println(driver.getTitle());
	
	}

}
