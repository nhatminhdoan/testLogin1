package ExampleActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ExampleLocators.HomePageLocators;
import ExampleUtils.HelperClass;

public class HomePageActions {
    HomePageLocators homePageLocators = null;
    
    public  WebElement homePageUserName;
    public HomePageActions() {
           
        this.homePageLocators = new HomePageLocators();
   
        PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
    }
   
    
    // Get the User name from Home Page
    public String getHomePageText() {
        return homePageLocators.homePageUserName.getText();
    }
   
}

