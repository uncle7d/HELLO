package GENERIC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_javascript {
	
	public static void pass_data(WebDriver driver,String data, WebElement element)
	{
		utility_objects.javascript_object(driver).executeScript("argurments[0]='"+data+"'", element);
	}
	public static void click_element(WebDriver driver, WebElement element)
	{
		utility_objects.javascript_object(driver).executeScript("arguments[0].click();", element);
	}
	public static void scroll_to_element(WebDriver driver, WebElement element)
	{
		utility_objects.javascript_object(driver).executeScript("arguments[0].scrollIntoView();", element);
	}

}
