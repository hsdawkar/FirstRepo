package PurpleStoreTestCase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PurpleStore.storeSetup;

public class storeSetupTest {
	
	WebDriver driver;
	
	@Test
	public void testStoreSetup() throws Exception
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://purplestores.in/signup.php?k=48dc9b7120d05f513380683985a9d7a4");
		driver.manage().window().maximize();
		
		FileReader read = new FileReader("Data.properties");
		Properties prop = new Properties();
		prop.load(read);
		
		storeSetup ob2 = new storeSetup(driver);
		
		ob2.storeName().sendKeys(prop.getProperty("Store"));
		ob2.radio().click();
		ob2.checkB().click();
		ob2.OTP().sendKeys(prop.getProperty("otp"));
		//ob2.creat().click();
	}

}
