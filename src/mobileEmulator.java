import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.emulation.Emulation;

public class mobileEmulator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//befor//New folder//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools dts = driver.getDevTools();
		
		dts.createSession();
		
		dts.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()));
		
		driver.get("https://phptravels.net/");
		
		driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]")).click();
		Thread.sleep(3000);
		
	}

}
