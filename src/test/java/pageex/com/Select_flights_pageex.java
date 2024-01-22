package pageex.com;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select_flights_pageex extends Search_flight_Page_ex {

	public static void popup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(get_popup()));
		element.click();
	}

	public static void departing_Flight() {
		get_depart_flight().click();
		

	}

	public static void returning_Flight() {
		try {
			Thread.sleep(1000);
			get_returnflight().click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	public static void continue_nextpage() {

		get_continue().click();
	}
}
