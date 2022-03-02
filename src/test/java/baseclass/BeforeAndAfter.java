package baseclass;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.PropertiesReader;

public class BeforeAndAfter {

	public int oBrowserType = 1;
	public static WebDriver driver;
	public String oURL;
	public String sPropName="Config";
	
	@BeforeClass 
	public void browserInvoke() throws Throwable {

		switch (oBrowserType) {
		case 1:
			System.out.println("The user option is:" + oBrowserType + " so its Invoking chrome browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case 2:
			System.out.println("The user option is:" + oBrowserType + " so its Invoking chrome browser");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Invalid browser type value");
			break;
		}
		oURL=PropertiesReader.getValueFromPropertyFile(sPropName,"url");
		driver.get(oURL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void browserClose() {
		driver.close();
	}
}