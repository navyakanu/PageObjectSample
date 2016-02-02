package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by navyab on 2/1/16.
 */
public class ClientDetailsPage {


    private WebDriver webDriver;

    @FindBy(id = "client_email")
    private WebElement Client_Email;



    @FindBy(id = "edit_client_1")
    private WebElement Edit_Client_Email;



    public ClientDetailsPage(WebDriver WebDriver){

        this.webDriver=WebDriver;
        PageFactory.initElements(webDriver, this);

    }


    public void EditClientDetails(String email) {
        Client_Email.sendKeys(email);
        Edit_Client_Email.click();

    }


}
