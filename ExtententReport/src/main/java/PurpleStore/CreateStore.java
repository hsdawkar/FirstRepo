package PurpleStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateStore {
	
	WebDriver driver;
	
	public CreateStore(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By op = By.xpath("//header/div[1]/nav[1]/ul[1]/li[4]/a[1]");
	public WebElement openBrowser()
	{
		return driver.findElement(op);
	}
	
	By un = By.id("name");
	public WebElement uname()
	{
		return driver.findElement(un);
	}
	
	By em = By.xpath("//input[@id='email']");
	public WebElement email()
	{
		return driver.findElement(em);
	}
	
	By mob = By.xpath("//input[@id='phone']");
	public WebElement mobNo()
	{
		return driver.findElement(mob);
	}
	
	By crAc = By.xpath("//input[@type='submit' and @value='Create Store']");
	public WebElement crClick()
	{
		return driver.findElement(crAc);
	}

}
