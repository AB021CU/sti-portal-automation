package sapiens.policies.Idirect;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import utility.WebDr;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.slf4j.LoggerFactory.getLogger;

public class Absa_Idirect_Endorse extends WebDr {
    private static final Logger logger = getLogger(Absa_Idirect_Endorse.class);

    //Instance of the WebDriver
    public Absa_Idirect_Endorse(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }
    String policyno ="PL-IDI6529481323";




    public void searchPolicy(){
        try{
            selectValueFromDropdown("drpdwnRecentSelect","text",policyno,"The Dropdown value is selected");
            click("drpdwnExpander","The Expander has been expanded");
            setText("txtPolicyNumber",policyno,"The Policy number should be placed");
            selectValueFromDropdown("drpdwnProductType","text","Idirect","The Product Type Should be selected");
            click("btnFind","The Find Button is selected");

        }catch(Exception e){
            e.printStackTrace();
        }
    }




}
