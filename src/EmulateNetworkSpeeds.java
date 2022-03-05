import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.network.Network;

public class EmulateNetworkSpeeds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://Users//befor//New folder//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools dts = driver.getDevTools();
		
		dts.createSession();
		dts.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		dts.send(Network.emulateNetworkConditions(true, 4000, 20000, 100000, Optional.empty()));
		
		dts.addListener(Network.loadingFailed(), loadingfailed->
		{
			System.out.println(loadingfailed.getErrorText());
			System.out.println(loadingfailed.getTimestamp());
		});
		
		long startTime = System.currentTimeMillis();
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.id("fixedban"));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		driver.quit();
	}

}
