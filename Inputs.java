package testleaf_app;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputs {
	public static void main(String[] args) throws InterruptedException {
//		chrome driver
		ChromeDriver driver = new ChromeDriver();
//		maximize the browser
		driver.manage().window().maximize();
//		load URL
		driver.get("https://leafground.com/input.xhtml");
//		type your name
		driver.findElement(By.xpath("//input[contains(@placeholder,'Manickam')]")).sendKeys("vignesh periyasamy");
//		appen country
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys(" -india");
//		verify text box is disable
		Boolean isDisplay = driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled();
		System.out.println("text box is disable or not: " + isDisplay);
//		clear the typed text
		driver.findElement(By.xpath(
				"//div[contains(@class,'formgrid')]/child::div[@class='col-12']/child::input[contains(@value,'Can')]"))
				.clear();
//		retreive the typed text
		WebElement ele = driver.findElement(By.xpath("//input[contains(@value,'My')]"));
		System.out.println("Retrieve text is: " + ele.getAttribute("value"));
//		enter email and click tab
		driver.findElement(By.xpath("//input[contains(@placeholder,'Your')]")).sendKeys("mrblanck01@gamil.com",
				Keys.TAB);
//		tybe about you
		driver.findElement(By.xpath("//textarea[contains(@placeholder,'About')]")).sendKeys(
				"i'm vignesh,from trichy,i completed my ug graduation bca in imayam arts and science college with 8.4 cgpa");
//		quit browser
		Thread.sleep(3000);
		driver.quit();
	}
}
