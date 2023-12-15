package Business_logic;

import org.testng.annotations.Test;

import GENERIC.Base_class;

public class end_to_endScript extends Base_class {
	
	@Test
	public void login() throws InterruptedException
	{
		Thread.sleep(10000);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
