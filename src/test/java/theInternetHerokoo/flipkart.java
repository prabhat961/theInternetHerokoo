package theInternetHerokoo;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Print Page title
		System.out.println(driver.getTitle());
		
		//Getting all the header icon
		List<WebElement>list = driver.findElements(By.xpath("//img[@class='_2puWtW _3a3qyb']"));
		System.out.println("No. of options available:"+list.size());
		for(WebElement ele: list) {
			System.out.println(ele.getText());
			driver.quit();
		}

	}

}
