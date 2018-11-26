package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import tests.baseTest;
import org.openqa.selenium.By;

public class loginPage extends  basePage{

   public WebDriver driver;

    public loginPage(WebDriver driver){
       super(driver);

    }

    String baseURL = "http://www.amazon.in/";


    // locating elements using By
    By signIn = By.xpath("//span[contains(text(),'Hello. Sign in')]");

    By loginUsername = By.xpath("//input[@id='ap_email']");

    By loginContinue = By.xpath("//input[@id='continue']");

    By loginPassword = By.xpath("//input[@id='ap_password']");

    By loginButton = By.xpath("//input[@id='signInSubmit']");

    By altTextOfUser = By.xpath("//span[contains(text(),'Hello, Abhinav')]");


    public loginPage launchAmazon () {
        driver.get(baseURL);
        return this;
    }


    //We will be using the common methods present in basePage Class. This is an another way of implementing POM

    public loginPage loginToAmazon (String username, String password) {
        //Enter Username(Email)
        writeText(loginUsername, username);
        //Enter Password
        writeText(loginPassword, password);
        //Click Login Button
        click(loginButton);
        return this;
    }





}