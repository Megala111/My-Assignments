package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Window {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String string = driver.getWindowHandle();
		System.out.println(string);
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> set = driver.getWindowHandles();
		System.out.println(set.size());
		//driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		//driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		

	}

}
