package sapiens.searches;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import utility.WebDr;

import static org.slf4j.LoggerFactory.getLogger;

public class Searches extends WebDr {

    private static final Logger logger = getLogger(Searches.class);

    public Searches(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }

//    String valueToSearch = getValue("ValueToSearch");
String policyno =getValue("PolicyNumber");



    public void searchPolicy1(){

        Searches_Mappings.Searches_Factory();

        try {
            if (exists("imgHome", true, "Home Image")){
                click("imgHome","Click Home Image");
                if (exists("labelSearch",true, "Search Label")){
                    selectValueFromDropdown("drpDwnFind", "text", "Policy", "Find Dropdown");
                    click("btnShowAdditionalDetails", "Click Show Additional Details");
                    click("headerSearchByPolicy/ProposalDetails","Click Search By Policy/Proposal Details");
                    setText("txtBoxPolicyNumber", policyno, "Enter Policy Number");
                    click("btnFind","Click Find Button");
                    WebElement headingPolicyNumber = wdriver.findElement(By.xpath("//ul[@class='idit-breadcrumbs']//b[contains(text(),'" + policyno + "')]"));
                    if (headingPolicyNumber.isDisplayed()) {
                        logger.info("Policy " + policyno + " Queried Successfully");
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Policy Search is : " + e);
        }

    }

    public void searchLossEvent(String claimNumber){

        Searches_Mappings.Searches_Factory();

        try {
            if (exists("imgHome", true, "Home Image")){
                click("imgHome","Click Home Image");
                if (exists("labelSearch",true, "Search Label")){
                    selectValueFromDropdown("drpDwnFind", "text", "Loss Event", "Find Dropdown");
                    click("btnShowAdditionalDetails", "Click Show Additional Details");
                    click("headerSearchByLossEventDetails","Click Search By Loss Event Details");
                    setText("txtBoxClaimNumber", claimNumber, "Enter Claim Number");
                    Thread.sleep(8000);
                    click("btnFind","Click Find Button");
                    WebElement headingPolicyNumber = wdriver.findElement(By.xpath("//ul[@class='idit-breadcrumbs']//b[contains(text(),'" + claimNumber + "')]"));
                    if (headingPolicyNumber.isDisplayed()) {
                        logger.info("Claim " + claimNumber + " Queried Successfully");
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Policy Search is : " + e);
        }

    }
}
