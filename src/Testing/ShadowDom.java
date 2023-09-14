package Testing;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://books-pwakit.appspot.com/");
		
         WebElement root=driver.findElement(By.tagName("book-app"));//showdow Host/root ele
         
         JavascriptExecutor js=(JavascriptExecutor)driver;
         WebElement hello1=(WebElement) js.executeScript("return arguments[0].shadowRoot", root);
         
          WebElement appheader1=hello1.findElement(By.tagName("app-header"));
           WebElement appheader2=appheader1.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
         WebElement  bookinput=appheader2.findElement(By.tagName("book-input-decorator"));
         
         bookinput.findElement(By.cssSelector("input#input")).sendKeys("Testinng");
	}
 
}
