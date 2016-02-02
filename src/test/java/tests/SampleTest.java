package tests;

import com.sun.deploy.util.SessionState;
import entities.ClientDetails;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.experimental.categories.Category;
import pages.*;
import org.apache.log4j.Logger;
import utils.ScreenshotRule;

/**
 * Created by navyab on 2/1/16.
 */

public class SampleTest extends BaseClassStep  {

    Logger logger = Logger.getLogger(SampleTest.class);

    @Category(Smoke.class)
    @Test
    public void firsttest(){

        logger.info("Starting test for selecting client");
        ClientDetails clientDetails =new ClientDetails("tcs","ThoughtWorks","04/04/1991","jaggu@thoughtworks.com");

        DashBoardPage dashBoardPage =new DashBoardPage(driver);
        dashBoardPage.NavigateToClientHomePage();

        ClientHomePage clientHomePage =new ClientHomePage(driver);
        clientHomePage.SearchClient(clientDetails.getClientName());

        EditClientPage editClientPage =new EditClientPage(driver);
        editClientPage.NavigateToEditClientPage();


        ClientDetailsPage clientDetailsPage =new ClientDetailsPage(driver);
        clientDetailsPage.EditClientDetails(clientDetails.getClient_Email());






    }

    @Test
    public void AddQuotaion(){

        ClientDetails clientDetails =new ClientDetails("tcs","ThoughtWorks","04/04/1991","jaggu@thoughtworks.com");

        DashBoardPage dashBoardPage =new DashBoardPage(driver);
        dashBoardPage.NavigateToClientHomePage();

        ClientHomePage clientHomePage =new ClientHomePage(driver);
        clientHomePage.SearchClient(clientDetails.getClientName());


        EditClientPage editClientPage =new EditClientPage(driver);
        editClientPage.NavigateToQuotationsPage();


        CreateQuotationPage createQuotationPage =new CreateQuotationPage(driver);
        createQuotationPage.AddNewQuotation();
        createQuotationPage.NewQuotationDetails(clientDetails.getEvent_name(),clientDetails.getEvent_date());


    }

    @Test
    public void PrintTest()
    {
        System.out.println("Navya");
    }

}
