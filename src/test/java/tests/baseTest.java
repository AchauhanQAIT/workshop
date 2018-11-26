package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

public class baseTest {

  public WebDriver driver;




    @BeforeClass
    public void initialize() {

        System.setProperty("webdriver.chrome.driver","/Users/abhinav.ch/Downloads/eclipse-workspace-2/pom-selenium-project/problem1/src/test/java/drivers/chromedriver.exe");
        driver = new ChromeDriver();

        //To maximize browser
        driver.manage().window().maximize();

        /*//Implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);*/


    }

    @AfterClass
    //Test cleanup
    public void TeardownTest()
    {
        driver.quit();
    }

}