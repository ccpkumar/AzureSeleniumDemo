package WM;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DockerWithChrome {

	

	@Test(priority = 1)
	public void freshWorkslogoTest() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setBrowserName("chrome");
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, dc);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("The tile is " + driver.getTitle());
		driver.quit();
	}

}