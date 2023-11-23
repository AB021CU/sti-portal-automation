package sapiens.claims;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class IdirectCancel_Mappings {

    public static void idirectcancel(){
        Map<String, String> Idirect = new HashMap<>();
        Idirect.put("listActions", "XPATH|//ul[@class='ActionMenu dropdown-menu']//li/a[@class='linkTag']");//Actions List

        Idirect.put("verifyMaintainPolicyScreen","XPATH|//div[contains(text(),'Maintain')]");//to verify the screen
        Idirect.put("drpCancelInitator","XPATH|//select[@title='Cancel Initiator']");
        Idirect.put("drpCancelType","XPATH|//select[@title='Cancellation Type']");
        Idirect.put("chkMigratedPolicy","XPATH|//label[@id='isMigratedPolicyCheckLabel']");
        //Reasons
        Idirect.put("btnAdd","XPATH|//a[@title='Add']");
        Idirect.put("drpdwnCategory","XPATH|//select[@id='CategoryVO']");//Request by Carrier
        Idirect.put("drpdwnReason","XPATH|//select[@id='EndorsementReason']");//
        Idirect.put("txtDescription","XPATH|//textarea[contains(@id,'endorsmentReasonVORowVO@remarks')]");//The Reason is accepted
        Idirect.put("buttonupdate","XPATH|//button[text()='Update']");
        Idirect.put("btnNext","XPATH|//button[@id='Next']");
        //Final Page
        Idirect.put("verifyMaintainPolicyContact","XPATH|//div[contains(text(),'Policy Contacts')][contains(@id,'ScreenTitle')]");
        Idirect.put("btnFinish","XPATH|//button[@id='Finish']");

        //Final last
        Idirect.put("verifyMaintainPage","XPATH|//div[contains(text(),'Maintain Event')]");
        Idirect.put("btnOK","XPATH|//button[@id='Ok'][@name='confirmationPageOK']");

        //_________________________________________________________________________________________________________________________
        //For Renewals

        Idirect.put("verifyRenewals","XPATH|//label[@title='Retain Tariff on Renewal']");
        Idirect.put("btnRenewalsNext","XPATH|//button[@id='renewalProposalFlow'][@title='Next']");
        Idirect.put("verifyGeneralDetailsPage","XPATH|//div[contains(text(),'General Details')][contains(@id,'ScreenTitle')]");
        Idirect.put("drpDwnLeadindicator","XPATH|//select[@title='Lead Indicator'][@id='leadIndicator']");
        Idirect.put("btnEndRiskDetails","XPATH|//button[@title='End risk details'][@id='next']");
        Idirect.put("verifyPaymentsPage","XPATH|//div[@title='Payments']");
        Idirect.put("verifyPolicyContactsPage","XPATH|//div[@title='Policy Contacts']");
        Idirect.put("verifyQuestionaries","XPATH|//div[contains(@id,'1000051@1000693')]//a/span[text()='Select']");
        //Absa Idirect
        Idirect.put("drpDwnQuestion1_AbsaIdirect","XPATH|//select[@id='1000051@1000693']");
        Idirect.put("drpDwnQuestion2_AbsaIdirect","XPATH|//select[@id='1000051@1000694']");
        Idirect.put("drpDwnQuestion3_AbsaIdirect","XPATH|//select[@id='1000051@1000695']");
        Idirect.put("drpDwnQuestion4_AbsaIdirect","XPATH|//select[@id='1000051@1000697']");



        WebDr.page_Objects = Idirect;
    }
}