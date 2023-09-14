package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
      // driver.findElement(By.cssSelector("#email")).sendKeys("prajwaln564@gmail.com");
       //driver.findElement(By.cssSelector("[name=pass]")).sendKeys("heloo");
       // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("prajwal@gmail.com");
       driver.findElement(By.xpath("//input[starts-with(@type,'te')]")).sendKeys("prajwalnbn@gmail.com");
       Thread.sleep(2000);
        
	}

}
