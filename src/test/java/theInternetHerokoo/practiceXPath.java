package theInternetHerokoo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceXPath {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//1. Relative XPath
		//driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("prabhat");
		//2. Absolute XPath
		//driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]"
				//+ "/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("prabhat");
		//3. Starts with XPath
		//driver.findElement(By.xpath("//input[starts-with(@name,'UserFirst')]")).sendKeys("prabhat");
		//4. COntains XPath
		//driver.findElement(By.xpath("//input[contains(@name,'Last')]")).sendKeys("ranjan");
		//5.text xpath
		//System.out.println((driver.findElement(By.xpath("//a[text()='Main Services Agreement']")).getText()));
		//6.AND Attribute
		driver.findElement(By.xpath("//input[@name='UserFirstName'and @id='UserFirstName-Zael']")).sendKeys("prabhat");
		//7. OR xpath
		//driver.findElement(By.xpath("//input[@name='UserLastName'or @id='UserLastName-06n5']")).sendKeys("ranjan");
		//8. parent xpath
		//select[@name='CompanyCountry']//parent::div
		//9. child xpath
		//select[@name='CompanyCountry']//child::option
		//10. descandant xpath
		//div[@class='form-container-v2 sfdc-form-day sfdc-form-closed sfdc-form-small bg-default']//descendant::div
		//11.descandant or self
		//div[@class='form-container-v2 sfdc-form-day sfdc-form-closed sfdc-form-small bg-default']//descendant-or-self::div
		//12. Ancestor xpath
		//div[@class='form-container-v2 sfdc-form-day sfdc-form-closed sfdc-form-small bg-default']//ancestor::div
		//13. Ancestor or self
		//div[@class='form-container-v2 sfdc-form-day sfdc-form-closed sfdc-form-small bg-default']//ancestor-or-self::div
		//14. Following xpath
		//div[@class='form-container-v2 sfdc-form-day sfdc-form-closed sfdc-form-small bg-default']//following::div
		//15. Following Sibling
		//div[@class='form-container-v2 sfdc-form-day sfdc-form-closed sfdc-form-small bg-default']//following-sibling::div
		//16. Preceding xpath
		//select[@id='CompanyCountry-uSna']//preceding::option
		//17. preceding sibling
		//select[@id='CompanyCountry-uSna']//preceding-sibling::option
		
		
		
		

	}

}
