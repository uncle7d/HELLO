package GENERIC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_actions {
	public static void mouse_hover(WebDriver driver, WebElement element)
	{
		utility_objects.actions_object(driver).moveToElement(element).perform();
	}
	public static void mouse_hover_click(WebDriver driver, WebElement element)
	{
		utility_objects.actions_object(driver).moveToElement(element).click().perform();
	}
    public static void right_click(WebDriver driver, WebElement element)
    {
    	utility_objects.actions_object(driver).contextClick(element).perform();
    }
    public static void double_click(WebDriver driver, WebElement element)
    {
    	utility_objects.actions_object(driver).doubleClick(element).perform();
    }
    public static void draganddrop(WebDriver driver, WebElement src, WebElement dst)
    {
    	utility_objects.actions_object(driver).dragAndDrop(src, dst).perform();
    }
}

