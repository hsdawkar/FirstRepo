package PurpleStoreTestCase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PurpleStore.CreateStore;

public class CreateStoreTest {
	
	WebDriver driver;
	
	@Test
	public void tcCreateStore() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.purplestores.in/");
		driver.manage().window().maximize();
		
		FileReader reader = new FileReader("Data.properties");
		Properties prop = new Properties();
		prop.load(reader);
		
		CreateStore ob1 = new CreateStore(driver);
		ob1.openBrowser().click();
		
		ob1.uname().sendKeys(prop.getProperty("Name"));
		ob1.email().sendKeys(prop.getProperty("Email"));
		ob1.mobNo().sendKeys(prop.getProperty("Phone"));
		ob1.crClick().click();
		
		//driver.close();
	}

}
