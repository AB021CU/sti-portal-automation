package testCases;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.slf4j.Logger;
import sapiens.claims.IdirectCancel;
import sapiens.claims.IdirectClaims;
import sapiens.contact.Contact;
import sapiens.login.Login;
import sapiens.policies.Idirect.Absa_Idirect;
import sapiens.policies.Idirect.Absa_Idirect_Multi;
import sapiens.policies.Idirect_Endorsement.Endorse;
import sapiens.searches.Searches;
import utility.WebDr;

import static org.slf4j.LoggerFactory.getLogger;

public class testFlow extends WebDr {

    private static final Logger logger = getLogger(testFlow.class);


    public testFlow(ExtentTest test, ExtentReports extent) {
        this.test = test;
        this.extent = extent;
    }

    public void executeTC(String flowName,String preferBrowser) throws Exception
    {
        try {
            System.err.print(flowName);
            switch (flowName) {


                case "flow_NewContactCreation":
                    logger.info("The current scenario is: " + flowName);
                    sapiens_NewContactCreation(preferBrowser);
                    break;
                case"flow_UpdateContacts":
                    logger.info("The current scenario is: "+flowName);
                    updateContactDetails(preferBrowser);
                    break;
                case "absa_Idirect_Flow":
                    System.err.print("It working fine");
                    logger.info("The current scenario is: " + flowName);
                    absa_Idirect_Flow(preferBrowser);
                    break;
                case "absa_Idirect_MultiVerse":
                    System.err.print("The MultiVerse is ON ");
                    logger.info("The current scenario is: "+ flowName);
                    absa_Idirect_MultiVerse(preferBrowser);
                    System.err.print("The MultiVerse is OFF "+ flowName);
                    break;
                case "absa_Idirect_Endorsement":
                    System.err.println("The General Endorsement has Started");
                    logger.info("The current scenario is: "+ flowName);
                    absa_Idirect_Endorsement(preferBrowser);
                    System.err.println("The General Endorsement has Finished");
                    break;
                case "flow_PersonalLines_IdirectClaimsCreation1":
                    logger.info("The current scenario is: " + flowName);
                    personalLines_IdirectClaimsCreation(preferBrowser);
                    break;

                case"flow_PersonalLines_IdirectClaimsCreation"://idirect_cancel_flow
                    logger.info("The current scenario is: " + flowName);
                    idirectCancel(preferBrowser);
                    break;

                case"1"://idirect_renewals_flow
                    logger.info("The current scenario is: " + flowName);
                    idirectRenewals(preferBrowser);
                    break;

            }
        } catch (Exception e) {
            WriteStep(wdriver,flowName + " Status: ",flowName + " should be executed successfully",flowName + " didn't execute successfully","FAIL");
            wdriver.quit();
            logger.info(String.valueOf(e));
        }
    }

    /**
     * Flow for Creating a New Contact into Sapiens application
     * @param preferBrowser -   Chrome
     */
    public void sapiens_NewContactCreation(String preferBrowser) {
    	try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Contact(wdriver, test).generalDetails();
            new Contact(wdriver, test).addresses();
            new Contact(wdriver, test).additionalData();
            new Contact(wdriver, test).paymentMeans();
            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_NewContactCreation is : " + e);
    	}
    }

    /**
     * Flow for Creating a New AbsaPlus Policy into Sapiens application
     * @param preferBrowser : Chrome
     */
    public void updateContactDetails(String preferBrowser) {
        try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Contact(wdriver, test).selectRecentContact();
            new Contact(wdriver, test).updateContact();
            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_NewPolicyCreation is : " + e);
        }
    }

    /*
     * METHOD FOR COVERING MUTIPLE COVERS IN A POLICY FOR ABSA_IDIRECT
     */

    public void absa_Idirect_MultiVerse(String preferBrowser) {

        try {
            System.out.print("Multiverse Started");
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Absa_Idirect_Multi(wdriver, test).selectRecentContact();
            new Absa_Idirect_Multi(wdriver, test).generalDetails();
            new Absa_Idirect_Multi(wdriver, test).multiCovers();
            String policyNumber = new Absa_Idirect_Multi(wdriver, test).paymentsDetails();
            new Login(wdriver, test).applicationLogOut();


        } catch (Exception e) {
            logger.info("Exception in sapiens_Absa Idirect Flow in Multiple Covers : " + e);
        }
    }
    /*
     * METHOD FOR COVERING SINGLE COVERS IN A POLICY FOR ABSA_IDIRECT
     */

    public void absa_Idirect_Flow(String preferBrowser){

        try{
            System.out.print("It working fine ");
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Absa_Idirect(wdriver, test).selectRecentContact();
            new Absa_Idirect(wdriver, test).generalDetails();
            new Absa_Idirect(wdriver, test).linesOfBusiness();
            String policyNumber = new Absa_Idirect(wdriver, test).paymentsDetails();
            new Searches(wdriver, test).searchPolicy1();
            new Login(wdriver, test).applicationLogOut();

        }catch (Exception e){
            logger.info("Exception in sapiens_Absa Idirect Flow in MultiVerse : "+e);
        }

    }
    /*Method for doing endorsement*/

    public void absa_Idirect_Endorsement(String preferBrowser){

        try{
            System.out.print("It working fine ");
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Endorse(wdriver,test).searchPolicy();
            new Endorse(wdriver,test).generalEndorsement();
            new Endorse(wdriver,test).endorse();
            String policyNumber = new Endorse(wdriver, test).paymentsDetails();
            new Login(wdriver, test).applicationLogOut();



        }catch (Exception e){
            logger.info("Exception in sapiens_Absa Idirect Flow in Endorsement : "+e);
        }

    }
/*Method for claims creation in Idirect*/
    public void personalLines_IdirectClaimsCreation(String preferBrowser) {
        try {
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Searches(wdriver, test).searchPolicy1();
            String claimNumber = new IdirectClaims(wdriver, test).idirectclaimThroughPolicy();
            new Login(wdriver, test).applicationLogOut();
           /* setup(preferBrowser);
            new Searches(wdriver, test).searchLossEvent(claimNumber);
            new IdirectClaims(wdriver, test).idirectClaimsClosure();
            new Login(wdriver, test).applicationLogOut();*/

        }catch (Exception e){
            logger.info("Exception in sapiens_Absa Idirect Flow in Claims creation : "+e);
        }
    }

    /*Method for Cancelling a Policy in Idirect*/

    public void idirectCancel(String preferBrowser) {
        try {
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Searches(wdriver, test).searchPolicy1();
            String Number = new IdirectCancel(wdriver, test).idirectCancelThroughPolicy();
            new Login(wdriver, test).applicationLogOut();
        }catch (Exception e){
            logger.info("Exception in sapiens_Absa Idirect Flow in Claims creation : "+e);
        }
    }

/*Method for Renewal a policy in Idirect*/

    public void idirectRenewals(String preferBrowser) {
        try {
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Searches(wdriver, test).searchPolicy1();
            String Number = new IdirectCancel(wdriver, test).idirectRenewalThroughPolicy();
            new Login(wdriver, test).applicationLogOut();
        }catch (Exception e){
            logger.info("Exception in sapiens_Absa Idirect Flow in Claims creation : "+e);
        }
    }

    
}
