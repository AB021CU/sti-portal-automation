package sapiens.searches;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class Searches_Mappings {

    public static void Searches_Factory(){

        Map<String, String> Searches_Objects = new HashMap<>();

        Searches_Objects.put("imgHome", "XPATH|//div[@class='homeImgDiv']");//Home Image
        Searches_Objects.put("labelSearch", "XPATH|//b[normalize-space()='Search']");//Search Label
        Searches_Objects.put("drpDwnFind", "XPATH|//select[@id='finderKeySelect']");//Find Dropdown
        Searches_Objects.put("btnShowAdditionalDetails", "XPATH|//div[@id='showHiedAllFieldsButton']");//Show Additional Details Button
        Searches_Objects.put("headerSearchByPolicy/ProposalDetails", "XPATH|//header[@title='Search by Policy/Proposal Details']");//Search by Policy/Proposal Details Button
        Searches_Objects.put("txtBoxPolicyNumber", "XPATH|//input[@id='IDITForm@policyNumber']");//Policy Number TextBox
        Searches_Objects.put("btnFind", "XPATH|//button[@id='homepageButtonsB_Search']");//Find Button




        WebDr.page_Objects = Searches_Objects ;
    }
}
