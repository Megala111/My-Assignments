package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindow {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(" https://www.irctc.co.in/");
		driver.findElement(By.xpath("//a[text()=' FLIGHTS '] ")).click();
		String window = driver.getWindowHandle();
		System.out.println(window);
        Set<String> window1= driver.getWindowHandles();
        List<String> list1=new ArrayList<String>(window1);
        driver.switchTo().window(list1.get(1));
        System.out.println(driver.getTitle());
        driver.close();
        driver.switchTo().window(list1.get(0));
        System.out.println(driver.getTitle());
        driver.quit();
        
        
        
        
        
	}

}
