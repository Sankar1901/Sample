package pageex.com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.com.Search_flights;
import locators.com.Select_flights;

public class Search_flight_Page_ex extends Select_flights  {

	public static void trip() {
		if (get_Trip().isEnabled()) {

		} else {
			get_Trip().click();
		}

	}

	public static void from(String data) {
		input_Data_clear(get_From(), data);
		get_From().click();
		input_Data(get_From(), data);
	}

	public static void to(String data) {
		input_Data_clear(get_To(), data);
		get_To().click();
		input_Data(get_To(), data);
	}

	public static void departure_date(String data) {
		get_Depart().click();
		input_Data(get_Depart(), data);
	}

	public static void return_date(String data) {
		get_return().click();
		input_Data(get_return(), data);
	}

	public static void options_class() {
		get_Options().click();
	}

	public static void adults() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(get_Adult()));

			for (int i = 0; i <= 1; i++) {
				element.click();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void seniors() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(get_seniors()));
			for (int i = 0; i <= 1; i++) {
				element.click();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void child() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(get_child()));
			for (int i = 0; i <= 1; i++) {
				element.click();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void infants() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(get_Infants()));
			element.click();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public static void dropdown(String data) {
		get_dpDown().click();
		select(get_dpDown(), data);
		get_dpDown().click();

	}

	public static void search() {
		get_Searchflights().click();
		

	}
}
