package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by navyab on 2/1/16.
 */
public class LoginPage {


    private WebDriver webDriver;

    @FindBy(id = "user_email")
    private WebElement user_name_field;

    @FindBy(id = "user_password")
    private WebElement password_field;

    @FindBy(name = "commit")
    private WebElement login;


    public LoginPage(WebDriver WebDriver){

        this.webDriver=WebDriver;
        PageFactory.initElements(webDriver,this);

    }


    public void LoginToApplication(String username, String password){
        user_name_field.sendKeys(username);
        password_field.sendKeys(password);
        login.click();


    }

}
