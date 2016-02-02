package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by navyab on 2/1/16.
 */
public class DashBoardPage {

    private WebDriver webDriver;

    @FindBy(linkText = "CLIENTS")
    private WebElement Clients_link;



    public DashBoardPage(WebDriver WebDriver){

        this.webDriver=WebDriver;
        PageFactory.initElements(webDriver, this);

    }


    public void NavigateToClientHomePage(){
        Clients_link.click();



    }

}
