package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class searchResultsPage {


    WebDriver driver;
    public searchResultsPage(WebDriver driver){
        this.driver=driver;
    }

    //Find elements using FindBy

    @FindBy(how= How.XPATH, using="//input[@id='twotabsearchtextbox']") WebElement searchBox;
    @FindBy(how=How.XPATH, using="//h2[contains(text(),'Apple iPhone 6 (Gold, 1GB RAM, 32GB Storage)')]") WebElement firstItemFromSearch;
    @FindBy(how=How.XPATH, using=" //input[@id='add-to-cart-button']") WebElement addToCart;
    @FindBy(how=How.XPATH, using ="//a[@id='hlb-ptc-btn-native']") WebElement proceedToCheckout;
    @FindBy(how=How.XPATH, using ="    //body/div[contains(@class,'checkout checkout-as checkout-as-desktop')]/div[contains(@class,'a-container')]/div[contains(@class,'clearfix')]/form[1]/div[1]/div[1]/div[2]/span[1]/a[1]\n") WebElement selectAddress;
    @FindBy(how=How.XPATH, using =" //div[contains(@class,'a-row')]//div[1]//div[1]//span[1]//span[1]//input[1]") WebElement continuetoPayment;





    //This method to search an item in the searchbox
    public void searchItem(){
        searchBox.click();
        searchBox.sendKeys("Iphone");

    }


    //We can also construct our own methods limited to that particular page
    //This method clicks/selects the very first search result for a search string=iphone

    public  void selectItem(){
        firstItemFromSearch.click();


    }

    //This method to add a item in cart
    public void add2Cart(){
        addToCart.click();

    }

    //This method is to proceed to checkout
    public  void checkout(){
        proceedToCheckout.click();

    }


    //This method to choose address
    public void selectAddress(){
        selectAddress.click();

    }


    //This method to click final continue on delivey page

    public void continueToPay(){
        continuetoPayment.click();


    }

}
