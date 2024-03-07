package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup_Page {
	public static void main(String[] args) throws InterruptedException {
//		launch browser
		ChromeDriver driver = new ChromeDriver();
//		maximize browser
		driver.manage().window().maximize();
//		load URL
		driver.get("https://www.facebook.com/login.php/");
//		click sign up 
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
//		enter first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vignesh");
//		enter last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("periyasamy");
//		enter email id
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number')]/following-sibling::input"))
				.sendKeys("mrblanck01@gamil.com");
//		re enter email id
		driver.findElement(By.xpath("//div[contains(text(),'Re-enter')]/following-sibling::input"))
				.sendKeys("mrblanck01@gamil.com");
//		enter password
		driver.findElement(By.xpath("//div[contains(text(),'New password')]/following-sibling::input"))
				.sendKeys("Vpdmprkgas1@");
//		select day
		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(ele);
		day.selectByValue("1");
//		select month
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(ele1);
		month.selectByIndex(11);
//		select year
		WebElement ele2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(ele2);
		year.selectByValue("2001");
//		select gender
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
		gender.click();
//		quit browser
		driver.quit();
	}
}
