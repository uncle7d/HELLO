package GENERIC;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class utility_objects {

	public static Actions actions_object(WebDriver driver)
	{
		Actions act= new Actions(driver);
		return act;	
	}

	public static Select select_object(WebElement element)
	{
		Select sel=new Select(element);
		return sel;
	}
	
	public static Robot Robot_object() throws AWTException
	{
		Robot rbt= new Robot();
		return rbt;
	}
	public static JavascriptExecutor javascript_object(WebDriver driver)
	{
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		return jse;
	}
}
