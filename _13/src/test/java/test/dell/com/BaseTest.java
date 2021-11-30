package test.dell.com;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class BaseTest {
    public WebDriver driver;
    public static ExtentHtmlReporter htmlReporter;






    @BeforeMethod
    public void setup() {

        loadProperties();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
        if(browser.equals("chrome")) {
            driver = new ChromeDriver();
        }
        else if(browser.equals("ff")){
            driver = new FirefoxDriver();
        }
        driver.get(url);
driver.manage().window().maximize();


    }


    private void loadProperties(){
        try (InputStream input = BaseTest.class.getClassLoader().getResourceAsStream("config.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }

            //load a properties file from class path, inside static method
            prop.load(input);

            //get the property value and print it out

            url=prop.getProperty("url");
            browser= prop.getProperty("browser");


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

String url="";
    String browser="";


    Object[][] testData = new Object[1][];












}
