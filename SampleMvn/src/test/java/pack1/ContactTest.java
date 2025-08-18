package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void creatContactTest()
	
	{
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		System.out.println("contact created");
		Assert.fail();
	}
	
	@Test
	public void modifyContactTest()
	
	{
		System.out.println("contact modified");
		System.out.println("hello manju");
	}

}
