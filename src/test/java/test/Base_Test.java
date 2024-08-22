package test;

import base.BasePage;
import com.utils.Constants;
import com.utils.LoginAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

public class Base_Test {
    public WebDriver driver;
    //LoginAction loginAction;


//    public void setupLoad() throws Exception {
//        loginAction = new LoginAction();
//        loginAction.loadProperty();
//
////        driver = new ChromeDriver();
////        driver.manage().window().maximize();
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////        driver.get(Constants.APP_URL);
//    }

    public String readDataFromPropertyFile(String key) throws Exception {
        Properties prop = new Properties();
        File configFile = new File("src/test/config.properties");
        InputStream stream = new FileInputStream(configFile);
        prop.load(stream);
        return prop.getProperty(key);
    }

    public void launchBrowser() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(readDataFromPropertyFile("APP_URL"));
    }
}
