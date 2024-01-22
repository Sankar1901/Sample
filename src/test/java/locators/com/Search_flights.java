package locators.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.pack.Baseclass;

public class Search_flights extends Baseclass  {
	
	public static WebElement get_Trip() {
		return driver.findElement(By.xpath("(//*[@class='tgl-btn'])[1]"));
				
	}
	public static WebElement  get_From() {
		return driver.findElement(By.id("from1"));

	}
	public static WebElement get_To() {
		return driver.findElement(By.id("to1"));
	}
	
	public static WebElement get_Depart() {
		return driver.findElement(By.id("departs"));
	}
	public static WebElement get_return() {
		return driver.findElement(By.id("returns"));
	}
	
	public static WebElement get_Options() {
		return driver.findElement(By.id("options"));
	}

	public static WebElement get_Adult() {
		return driver.findElement(By.xpath("(//*[@type='button'])[2]"));
	}
	public static WebElement get_seniors() {
		return driver.findElement(By.xpath("(//*[@type='button'])[4]"));
	} 
	public static WebElement get_child() {
		return driver.findElement(By.xpath("(//*[@type='button'])[6]"));
	}
	public static WebElement get_Infants() {
		return driver.findElement(By.xpath("(//*[@type='button'])[8]"));
	}
	public static WebElement get_dpDown() {
		return driver.findElement(By.id("cabin"));
	}
	public static WebElement get_Searchflights() {
		return driver.findElement(By.xpath("(//*[@type='submit'])[1]"));
	}

}
