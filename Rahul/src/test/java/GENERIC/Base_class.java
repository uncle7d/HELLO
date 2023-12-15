package GENERIC;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Repository.login_repo;

public class Base_class implements Framework_constants{
	
	public WebDriver driver;
	public WebDriverWait wait;
   public  login_repo  login;
	
	
	@BeforeClass
	public void launch_app()
	{
		System.setProperty(chrome_key, Chrome_value);
		driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	    wait= new WebDriverWait(driver, time_out);
		
	}
    @BeforeMethod
    public void login_app() throws IOException, InterruptedException
    {
		
	String user = getDataFromPropertyFile.getdata("username"); 
	String pass = getDataFromPropertyFile.getdata("password");
		 
    login= new login_repo(driver);
    Thread.sleep(2000);
    login.getuser_name().sendKeys(user);
    Thread.sleep(2000);
    login.getpass_word().sendKeys(pass);	
    login.getlogin().click();
    }
    @AfterClass
    public void close_app()
    {
    	driver.quit();
    }
	
}
