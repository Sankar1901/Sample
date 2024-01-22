package base.pack;



import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver = null;

	
	public static void browserlaunch() {
		driver = new ChromeDriver();
		driver.get("https://www.cheapair.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void input_Data(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void input_Data_clear(WebElement element, String data) {
		element.clear();
		element.sendKeys(data);
	}

	public static void click_Value(WebElement element) {
		element.click();
	}

	public static void select(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByValue(data);
	}

	public static void handles() {
		Set<String> windowhandle = driver.getWindowHandles();
		for (String string : windowhandle) {
			driver.switchTo().window(string);
		}
	}
}
