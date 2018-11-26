package tests;

import org.junit.Test;
import pages.loginPage;


public class flowOne extends baseTest {


//Flow1
    @Test
    public void flow1 () {

        loginPage lp = new loginPage(driver);
        lp.loginToAmazon("username", "P@asword123");

      /*  ● Load the application home page
        ● Search for products from home page and land on search results page
        ● Add any product to cart and proceed further to login page
        ● Login with valid credentials to land in payment page
               */

    }

    //Flow2

    @Test
    public void flow2(){


        /*● Load the application home page
        ● Click login link in home page and navigate to login page
        ● Login with valid credentials and land back in home page
        ● Search for products from home page and land on search results page*/


    }

}
