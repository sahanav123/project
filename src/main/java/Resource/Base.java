package Resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		
	    prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\sahana\\EclipseWorkspace\\project\\src\\main\\java\\Resource\\data.properties");
		prop.load(fis);
		
		
		
		String BrowserName = prop.getProperty("browser");
		
		if (BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		
		}
		else if(BrowserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		return driver;
	}

	
	
	
	public void takeScreenshot(String testname, WebDriver driver) throws IOException {

		File SourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationFilePath = System.getProperty("user.dir") + "\\screenshots\\" + testname + ".png";
		FileUtils.copyFile(SourceFile, new File(destinationFilePath));

	}
}
