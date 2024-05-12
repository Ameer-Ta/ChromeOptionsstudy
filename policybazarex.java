package ChromeOptionsstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class policybazarex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/?pb_source=google_brand&pb_medium=ppc&pb_term=Policybazaar&pb_campaign=PolicyBazaar00PolicyBazaar&gad=1&gclid=Cj0KCQjwrfymBhCTARIsADXTabnfgMlZoNMJiCRwEe_UYD_jd-fSRLIaGIJgNQU3JZUF7hSx9vi6susaAv-zEALw_wcB");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[normalize-space()='Sign in'])[1]")).click();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(0, 500);");
		driver.findElement(By.className("\"central-login-sign-up-class")).click();
		//		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9502568722");
		//		driver.findElement(By.xpath("(//a[@id='central-login-signUp-proceed-id'])[1]")).click();
		//		driver.findElement(By.xpath("(//span[@id='verify-otp-sign-with-pass'])[1]")).click();
		//		driver.findElement(By.xpath("(//input[@id='central-login-password'])[1]")).sendKeys("Yuhaan@241");
	}

}
