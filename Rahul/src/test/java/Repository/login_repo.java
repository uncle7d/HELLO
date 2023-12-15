package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_repo {
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement user_name;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pass_word;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	
	public login_repo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getuser_name()
	{
		return user_name;
	}
	
	public WebElement getpass_word()
	{
		return pass_word;
	}
	public WebElement getlogin()
	{
		return login;
	}

}
