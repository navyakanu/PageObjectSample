package tests;

import entities.ClientDetails;
import entities.LoginDetails;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.DashBoardPage;
import pages.LoginPage;
import utils.ScreenshotRule;

import java.util.concurrent.TimeUnit;

/**
 * Created by navyab on 2/1/16.
 */
public class BaseClassStep {


     ChromeDriver driver;




    @Rule
    public ScreenshotRule screenShotRule = new ScreenshotRule();

    @Before
    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        screenShotRule.setDriver(driver);
        LoginDetails loginDetails =new LoginDetails("http://accountsdemo.herokuapp.com/","********","*******");
        driver.navigate().to(loginDetails.getLoginUrl());

        LoginPage login =new LoginPage(driver);
        login.LoginToApplication(loginDetails.getUsername(), loginDetails.getPassword());

    }

    @After
    public void tearDown(){


    }





}


