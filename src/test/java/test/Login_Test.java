package test;

import com.pages.Order_Confirmation_Page;
import com.pages.Shipping_Details_Page;
import com.utils.Constants;
import com.pages.Login_Page;
import com.pages.Product_Page;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public class Login_Test extends Base_Test {
    //private WebDriver driver;
    Login_Page loginPage;
    Product_Page productPage;
    //private LoginAction loginAction = new LoginAction();
    Order_Confirmation_Page orderConfirmationPage;
    Shipping_Details_Page shippingDetailsPage;

    @BeforeClass
    public void setup() throws Exception {
        launchBrowser();

        loginPage = new Login_Page(driver);
        productPage = new Product_Page(driver);
        shippingDetailsPage= new Shipping_Details_Page(driver);
        orderConfirmationPage=new Order_Confirmation_Page(driver);


    }

    @Test
    public  void login() throws Exception {

        loginPage.login(readDataFromPropertyFile("USERNAME"),
                readDataFromPropertyFile("PASSWORD"));

        productPage.verifyHeader()
                .addProduct()
                .goToCart()
                .verifyProduct()
                .clickCheckOut();

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
