package Amz.Amazon;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Amztestcase1 {

	@Test
	
	public void open_Amazon() throws InterruptedException {
		
		String expected_title="Amazon.com. Spend less. Smile more.";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		String actual_title = driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertEquals(expected_title, actual_title);
		Thread.sleep(3000);
		driver.quit();
	
	}
}
