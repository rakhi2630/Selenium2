package Commands1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoTest {
	@Test
	public void FacebookTest() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualurl = driver.getTitle();
		System.out.println(actualurl);
	}

}
