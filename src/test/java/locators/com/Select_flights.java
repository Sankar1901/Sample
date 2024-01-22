package locators.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Select_flights extends Search_flights {

	public static WebElement get_popup() {

		return driver.findElement(By.xpath("(//*[@class='sc-csuSiG itdrYd'])[1]"));
	}

	public static WebElement get_depart_flight() {
		return driver.findElement(By.xpath("(//*[.='roundtrip'])[3]"));
	}

	public static WebElement get_returnflight() {
		return driver.findElement(By.xpath("(//*[.='$5,834']//parent::*)[10]"));
				
	}

	public static WebElement get_continue() {
		return driver.findElement(By.xpath("(//*[.='Continue'])[1]"));
	}

}
