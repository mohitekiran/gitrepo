import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class searchGoogle {

	static WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\libs\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test(priority=1)
	public void searchAndClick() {
		driver.get("https://www.google.com/");
		driver.manage().window().fullscreen();

		WebElement googleSearchBox = driver.findElement(By.id("lst-ib"));
		googleSearchBox.sendKeys("Wikipedia");
		googleSearchBox.sendKeys(Keys.ENTER);
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
