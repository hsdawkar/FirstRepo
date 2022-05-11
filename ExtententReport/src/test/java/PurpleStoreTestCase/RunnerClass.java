package PurpleStoreTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunnerClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.purplestores.in/");
		driver.manage().window().maximize();
		
		CreateStoreTest obj = new CreateStoreTest();
		obj.tcCreateStore();
		
		storeSetupTest obj1 = new storeSetupTest();
		obj1.testStoreSetup();
	}

}
