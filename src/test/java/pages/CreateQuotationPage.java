package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by navyab on 2/1/16.
 */
public class CreateQuotationPage {

    private WebDriver webDriver;

    @FindBy(linkText = "+ Add New Quotation")
    private WebElement Add_New_Quotation;


    @FindBy(id = "quotation_event_name")
    private WebElement Quotation_event_name;


    @FindBy(id = "quotation_event_date")
    private WebElement Quotation_event_date;


    @FindBy(id = "new_quotation")
    private WebElement Create_New_Quotation;


    public CreateQuotationPage(WebDriver WebDriver){

        this.webDriver=WebDriver;
        PageFactory.initElements(webDriver, this);

    }


    public void AddNewQuotation(){
        Add_New_Quotation.click();
    }

    public void NewQuotationDetails(String emailid,String date){

        Quotation_event_name.sendKeys(emailid);
        Quotation_event_date.sendKeys(date);
        Create_New_Quotation.click();


        //  driver.switchTo().alert().accept();

    }




}
