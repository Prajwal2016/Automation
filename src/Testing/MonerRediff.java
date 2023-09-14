package Testing;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonerRediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[contains(text(),'Polycab India')]/self::a	")).click();
     List<WebElement> lists= driver.findElements(By.xpath("//a[contains(text(),'Polycab India')]/ancestor::tr/child::td"));
     System.out.println("the size of :" + lists.size());
    
	}

}
