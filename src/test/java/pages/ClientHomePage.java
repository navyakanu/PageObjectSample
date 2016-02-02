package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by navyab on 2/1/16.
 */
public class ClientHomePage {


    private WebDriver webDriver;



    @FindBy(id = "search")
    private WebElement search_textbox;

    @FindBy(className = "searchBtn")
    private WebElement search_button;

    @FindBy(linkText = "Select Client")
    private WebElement select_client_link;


    public ClientHomePage(WebDriver WebDriver){

        this.webDriver=WebDriver;
        PageFactory.initElements(webDriver, this);

    }


public void SearchClient(String client){
    search_textbox.sendKeys(client);
    search_button.click();
    select_client_link.click();
    Assert.assertEquals(webDriver.findElement(By.xpath("//div[1]/div/div[1]/div/h2")).getText().toString(), "Navya |02 February, 2016");

}







    






}
