package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by navyab on 2/1/16.
 */
public class EditClientPage {

    private WebDriver webDriver;

    @FindBy(linkText = "Edit Client Details")
    private WebElement Edit_Clients_link;



    @FindBy(linkText = "Quotations")
    private WebElement Quotations;

    public EditClientPage(WebDriver WebDriver){

        this.webDriver=WebDriver;
        PageFactory.initElements(webDriver, this);

    }


    public void NavigateToEditClientPage(){
        Edit_Clients_link.click();



    }


    public void NavigateToQuotationsPage(){
        Quotations.click();
    }




}
