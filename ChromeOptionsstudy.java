package ChromeOptionsstudy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsstudy {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions ch= new ChromeOptions();
		ch.addArguments("start-maximized");
		ch.addArguments("incognito");
		
		ChromeDriver driver=new ChromeDriver(ch);
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();		
		driver.quit();
	}

}
