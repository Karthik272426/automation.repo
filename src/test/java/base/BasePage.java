package base;

/*

baseUrl: https://www.saucedemo.com/v1/;
userName: standard_user;                 //input[@id='user-name']
userPassword: secret_sauce;              //input[@id='password']
login:                                   //input[@id='login-button']
Homepage Title validation                //div[@class='app_logo']
move to container and filter the price list from high to low
select first jacket                      (//div[@class='inventory_item_name'])[1]
then add to cart                          //button[text()='ADD TO CART']
then move to cart                         //div[@id='shopping_cart_container']
then checking the product is added to cart or not  //div[@class='inventory_details_name']  here i am doing some assertion
navigate to back                          //button[@class='inventory_details_back_button']
then click on the checkout button         //a[@class='btn_action checkout_button']
after enter the details  FN, LN, Zip      //input[@id='first-name'], //input[@id='last-name'], //input[@id='postal-code']
then click to continue                    //input[@value='CONTINUE']
click on the finish                       //a[text()='FINISH']
verifying order is confirmed or not       //h2[text()='THANK YOU FOR YOUR ORDER']
click on the menu                         //button[text()='Open Menu']
then logout from the application          (//nav[@class='bm-item-list']/a)[3]

*/


import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class BasePage {
    public static final Logger Logger= LoggerFactory.getLogger(BasePage.class);

   public BasePage(WebDriver driver){
       PageFactory.initElements(driver,this);
   }
//
//    public void launchUrl(String Url){
//        driver = new ChromeDriver();
//        driver.get(Url);
//
//    }
//    public void implicitWait() {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//    }
//    public void maximize() {
//        //Logger.info("I am In Base ");
//        driver.manage().window().maximize();
//    }


//    public void launchBrowser() throws Exception {
//        Properties prop = new Properties();
//        File configFile = new File("src/test/config.properties");
//        InputStream stream = new FileInputStream(configFile);
//        prop.load(stream);
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get(prop.getProperty("APP_URL"));
//
//    }


}



