package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BrowserStack {
	RemoteWebDriver driver= null;

	@Test
	public void brDemo() throws MalformedURLException {
		String username = "sadique_0LdMNr";
		String password = "DppHDKzrBJC9oeyQuLQh";

		MutableCapabilities capabilities = new MutableCapabilities();
		HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
		capabilities.setCapability("browserName", "Chrome");
		bstackOptions.put("os", "Windows");
		bstackOptions.put("osVersion", "10");
		bstackOptions.put("browserVersion", "120.0");
		bstackOptions.put("consoleLogs", "info");
		capabilities.setCapability("bstack:options", bstackOptions);

		 driver = new RemoteWebDriver(
				new URL("https://" + username + ":" + password
						+ "@hub-cloud.browserstack.com/wd/hub"),
				capabilities);
		driver.get("https://flipkart.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[.='Mobiles & Tablets']")).click();
		driver.close();
		System.out.println("browser closed");
	}

}
