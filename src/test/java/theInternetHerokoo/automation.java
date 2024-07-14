package theInternetHerokoo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//finding searchbar with following xpath:
		WebElement searchbar = driver.findElement(By.xpath("//input[@class='navbar__search--input']"));
		searchbar.sendKeys("selenium");
		searchbar.sendKeys(Keys.RETURN);
		driver.quit();
		

	}

}
