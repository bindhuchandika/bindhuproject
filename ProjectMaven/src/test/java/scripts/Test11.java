package scripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {
	public static void main(String[] args) throws IOException, InterruptedException {
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
		   driver.get("http://localhost:8888/");
		   driver.findElement(By.name("user_name")).sendKeys("admin");
		   driver.findElement(By.name("user_password")).sendKeys("admin");
		   driver.findElement(By.id("submitButton")).click();
		   driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		   driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
		   driver.findElement(By.xpath("(//td[@class='small'])[2]")).click();
	       driver.findElement(By.linkText("Sign Out")).click();
}
}
