package sapiens.policies.Idirect;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import sapiens.policies.Idirect_Endorsement.Endorse_POM;
import utility.WebDr;

import static org.slf4j.LoggerFactory.getLogger;

public class PreProd extends WebDr {

    private static final Logger logger = getLogger(PreProd.class);

    public PreProd(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }

    public String proposalNumber;
    /**
     * Method to capture Payment Details of a Policy
     */
    public String paymentsDetails() {

        Absa_Idirect_POM.Idirect_Factory();

        String[] policyNumber = new String[0];

        try {
            if (exists("labelPayments", true, "Payments Screen Exists")) {
                //Payments

                    selectValueFromDropdown("drpDwnCollectionMethod", "text", "Direct Debit", "Select Collection Method");



                    selectValueFromDropdown("drpDwnPaymentTerms", "text", "True Monthly", "Select Payment Terms");

                selectValueFromDropdown("drpDwnPreferredDueDay", "text", "1", "Select Preferred Due Day");
                //Decision
                selectValueFromDropdown("drpDwnDecision", "text", "Save Proposal", "Select Decision");

                //Reason

                    selectValueFromDropdown("drpDwnReason", "text", "Other", "Select Reason from the dropDwnn");


                click("btnNext", "Click Next");

                //Screening progress
                if (existsNoReport("noti",true,"The Notification is present")) {
                    click("notiOk","The Ok button is clicked");
                    click("chkBoxSanctionScreen", "Click Sanction Screen Completed CheckBox");
                    click("chkBoxRiskProfiling", "Click Risk Profiling Completed CheckBox");
                    click("btnNext", "Click Next");
                }
//                click("chkBoxDueDiligence", "Click Due Diligence Completed CheckBox");

//                if (existsNoReport("dialogBasicNotification", true, "GD1000079 Popup")) {
//                    click("btnDialogOK", "Click OK Button");
//                    click("btnNext", "Click Next");
//                }

                    click("btnFinish", "Click Finish Button");


                    if (exists("dBox", true, "The Value is selected")) {
                        proposalNumber = getText("PolicyNum", "The Element should be visible");
                        click("btnOk", "The Value is selected");




                }
            }
        } catch (Exception e) {
            logger.info("Exception in Policy Payment Details is : " + e);
        }
        return policyNumber[1];
    }
    /*
    * Clone proposal
    *
    * */

    public void cloneProposal(){
        try{

                    Endorse_POM.Endorse_Factory();
                    Thread.sleep(2000);
                    click("btnHide","The Button is clicked");

                    //selectValueFromDropdown("drpdwnRecentSelect","text","Policy","The Dropdown value is selected");
                    click("drpdwnExpander","The Expander has been expanded");
                    setText("txtPolicyNumber1",proposalNumber,"The Policy number should be placed");
                    //selectValueFromDropdown("drpdwnProductType","text","Idirect","The Product Type Should be selected");
                    click("btnFind","The Find Button is selected");

                    if(exists("linkNewProposal",true,"The Value should be present")) {
                        wdriver.findElement(By.xpath("//li[@id='Policies']//following::li/a[contains(text(),'"+proposalNumber+"')]")).click();
                    }


            click("btnCloneProposal","The Clone Proposal should be clicked");
            //Click Next
            click("btnNext","The next button should be click");
            //click Risk details
            click("btnEndRiskDetails","The End Risk Details is added");


            //Underwriting alerts
            if (existsNoReport("labelUWContains", true, "Underwriting Screen Exists")) {
                logger.info("Under writing alert is present");
                if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                    logger.info("Under writing two dropdown is present");
                    selectValueFromDropdown("drpDwnUWValidation", "text", "Approved", "Select UW alert");
                    selectValueFromDropdown("drpDwnUWValidation2", "text", "Approved", "Select UW alert");
                    click("btnUWNext", "Select Next button");
                } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists")) {
                    logger.info("Under writing one dropdown is present");
                    selectValueFromDropdown("drpDwnUWValidation", "text", "Approved", "Select UW alert");
                    click("btnUWNext", "Select Next button");
                } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown3", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                    logger.info("Under writing three dropdown is present");
                    selectValueFromDropdown("drpDwnUWValidation", "text", "Approved", "Select UW alert dropdown 1");
                    selectValueFromDropdown("drpDwnUWValidation2", "text", "Approved", "Select UW alert dropdown 2");
                    selectValueFromDropdown("drpDwnUWValidation3", "text", "Approved", "Select UW alert dropdown 3");
                    click("btnUWNext", "Select Next button");
                }
            }
            click("btnNext","The Next Button is clicked");

            click("btnFinish","The Finish Button is clicked");

        }catch (Exception e){
            logger.info("Exception in Policy Payment Details is : " + e);
        }
    }

    public void updateProposal(){
        try{

        }catch(Exception e){
            logger.info("Exception in Policy Payment Details is : " + e);
        }
    }
}
