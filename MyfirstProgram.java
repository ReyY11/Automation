package automationtest;
import org.openqa.Seleniumtesting.firefox.FirefoxDriver;

public class MyfirstProgram {
	public static void main(String[] ar)
	{
	System.setProperty("webdriver.gecko.driver", "D:/Library/geckodriver.exe");
	FirefoxDriver driver= new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	}
}
