package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class BaseTest {
	public static WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	//String path=System.getProperty(System.getProperty("user.dir")+"src\\test\\resources\\config1.properties");
  
	@BeforeSuite
   public void  initBrowser() throws IOException, FileNotFoundException
   {
    WebDriverManager.chromedriver().setup();
   
   driver=new ChromeDriver();
   driver.manage().window().maximize();
  // prop=new Properties();
//   fis=new FileInputStream(path);
	//prop.load(fis);
	driver.get("https://opensource-demo.orangehrmlive.com/");
   
  // driver.get(prop.getProperty("url"));
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   }
   
   @AfterSuite
   public void tearsDown()
   {
	   driver.close();
   }
    
   
   
   
   }
	

