package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static Properties prop;
	public static WebDriver driver;
	
	public Main() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\eclipse"
					+ "\\BDDPOMOctBatch\\src\\main\\java\\properties\\config.properties"); 
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void intialization() {
		System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromePath"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("qaUrl"));
	}
	
	public void tearDown() {
		driver.close();
	}
}
