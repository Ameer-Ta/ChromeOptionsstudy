package ChromeOptionsstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownclass {

	public static void main(String[] args) throws InterruptedException {

		//		WebDriver driver = new ChromeDriver();
		//		Thread.sleep(3000);
		//		driver.get("https://www.facebook.com/");
		//		driver.manage().window().maximize();
		//		driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
		//driver.findElement(By.name("firstname")).sendKeys("ameer");
		//driver.findElement(By.name("lastname")).sendKeys("mohammad");
		//driver.findElement(By.name("reg_email__")).sendKeys("mohammadameer.yuhaan2019@gmail.com");
		//driver.findElement(By.name("reg_passwd__")).sendKeys("Yuhaan@241");
		//		WebElement day=driver.findElement(By.xpath("(//select[@id='day'])[1]"));
		//		Select dobd= new Select(day);
		//		dobd.selectByVisibleText("10");
		//		

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
//		WebElement drpcountryEle=driver.findElement(By.xpath("//select[@id='input-country']"));
//		Select drpcountry=new Select(drpcountryEle);
//		drpcountry.selectByVisibleText("Denmark");
//		List<WebElement>alloptions=drpcountry.getOptions();
//		for(WebElement option:alloptions)
//		{
//			if(option.getText().equals("cuba"))
//			{
//				option.click();
//				break;
//			}
//		}
	}

}
