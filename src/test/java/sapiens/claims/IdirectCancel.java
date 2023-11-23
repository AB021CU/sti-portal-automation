package sapiens.claims;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import utility.WebDr;

import static org.slf4j.LoggerFactory.getLogger;

public class IdirectCancel extends WebDr {
    private static final Logger logger = getLogger(IdirectClaims.class);

    //Constructor
    public IdirectCancel(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }

    String policyNumber = getValue("PolicyNumber");

    public String idirectCancelThroughPolicy() {
        IdirectCancel_Mappings.idirectcancel();
        try {
            WebElement actionsLink = wdriver.findElement(By.xpath("//a[@id='ActionsLink']"));
            Actions action = new Actions(wdriver);
            action.moveToElement(actionsLink).perform();
            selectValueFromList("listActions", "Policy Cancellation", "Select Policy " + policyNumber);

            //Maintain Policy Reasons Screen


            if (exists("verifyMaintainPolicyScreen",true,"The Screen should be displayed")) {

                selectValueFromDropdown("drpCancelInitator", "text", "Policyholder", "The Cancel Initiator is selected");

                click("btnAdd", "The Add button is clicked");
                selectValueFromDropdown("drpdwnCategory", "text", "Request by Policy Holder", "The Category for cancel is selected");
                selectValueFromDropdown("drpdwnReason", "text", "Bank Account Closed", "The reason for cancel is selected");
                setText("txtDescription", "Cancelling for TESTING", "The Description for Cancel is given");
                click("buttonupdate", "The Update button is clicked");
                click("btnNext", "The Next button is clicked");
            }

            if (exists("verifyMaintainPolicyContact",true,"The screnns hould be displayed")) {
                click("btnFinish", "The finish button is clicked");
            }
            if (exists("verifyMaintainPage",true,"The screnns hould be displayed")) {
                click("btnFinish", "The finish button is clicked");
            }
            Thread.sleep(2000);
            click("btnOK","The Dialogue Box is clicked");




        } catch (Exception e) {
            logger.info("Exception in Cancelling Policy is : " + e);
        }
        return null;
    }


    public String idirectRenewalThroughPolicy(){
        IdirectCancel_Mappings.idirectcancel();
        try{
            WebElement actionsLink = wdriver.findElement(By.xpath("//a[@id='ActionsLink']"));
            Actions action = new Actions(wdriver);
            action.moveToElement(actionsLink).perform();
            selectValueFromList("listActions", "Policy Renewal", "Select Policy " + policyNumber);

            if (exists("verifyRenewals",true,"The Renewals should be displayed")){
                click("btnRenewalsNext","The next button should be clicked");
            }
            if (exists("verifyGeneralDetailsPage",true,"The General Details page should be seen")){
                selectValueFromDropdown("drpDwnLeadindicator","text","Dealer","The Value is selected form the dropdown");
                if(exists("verifyQuestionaries",true,"The Questionaries is present")){
                    selectValueFromDropdown("drpDwnQuestion1_AbsaIdirect", "text", "No", "Select Answer of Question 1");
                    selectValueFromDropdown("drpDwnQuestion2_AbsaIdirect", "text", "No", "Select Answer of Question 2");
                    selectValueFromDropdown("drpDwnQuestion3_AbsaIdirect", "text", "No", "Select Answer of Question 3");
                    selectValueFromDropdown("drpDwnQuestion4_AbsaIdirect", "text", "No", "Select Answer of Question 4");

                }
                click("btnNext","The Next Button is clicked");
            }
            click("btnEndRiskDetails","The End Risk Button ic clicked");

            if (exists("verifyPaymentsPage",true,"The Payments Page should be displayed")){
                click("btnNext","The Next Button is clicked");
            }
            if (exists("verifyPolicyContactsPage",true,"The Policy Contact page should be displayed")){
                click("btnFinish","The Finish Button is clicked");
            }
            click("btnFinish","The Finish Button is clicked on documents page ");

            Thread.sleep(2000);
            click("btnOK","The Dialogue Box is clicked");

        }catch(Exception e){
            logger.info("Exception in Renewal a Policy is : " + e);
        }
        return null;
    }

}
