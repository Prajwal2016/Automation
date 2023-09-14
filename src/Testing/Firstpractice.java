package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.edureka.co");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
