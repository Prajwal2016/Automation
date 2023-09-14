package Testing;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("prajwal.vb@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		 int links=driver.findElements(By.tagName("a")).size();
		 System.out.println(links);
		 
		

	}

}
