import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.emulation.Emulation;

public class MockingGeoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://Users//befor//New folder//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		DevTools dts = driver.getDevTools();
		
		dts.createSession();
		
		Map<String,Object> coordinates = new HashMap<String,Object>();
		coordinates.put("latitude", 48);
		coordinates.put("longitude", 11);
		coordinates.put("accuracy", 1);
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		
		dts.send(Emulation.setGeolocationOverride(Optional.of(48), Optional.of(11), Optional.of(1)));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Netflix",Keys.ENTER);
		driver.findElement(By.cssSelector(".LC20lb")).click();
		
		String title = driver.findElement(By.cssSelector(".our-story-card-title")).getText();
		System.out.println(title);
	}

}
