package ChromeOptionsstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class actionclass {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/");
		//Actions act= new Actions(driver);
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("mahammadameer0502@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("dropdown-toggle")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Tooltip']")).click();
	}

}
