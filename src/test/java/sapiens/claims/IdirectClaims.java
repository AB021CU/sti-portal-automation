package sapiens.claims;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import utility.WebDr;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class IdirectClaims extends WebDr {

    private static final Logger logger = getLogger(IdirectClaims.class);

    public IdirectClaims(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }

    String productType = getValue("Product_Type");
    String lineOfBusiness = getValue("Line_Of_Business");
    String causeOfLoss = getValue("CauseOfLoss");
    String claimDescription = getValue("Claim_Description");
    String insuredObject = getValue("Insured_Object");
    String claimLocationType = getValue("ClaimLocationType");
    String damageNode = getValue("Damage_Node");
    String damageBeenAttended = getValue("DamageBeenAttended");
    String relationshipOfPersonReportingClaim = getValue("RelationshipOfPersonReportingClaim");
    String whyReportingClaim = getValue("WhyReportingClaim");
    String insuranceBeforeTakingPolicy = getValue("InsuranceBeforeTakingPolicy");
    String relationshipToPolicyHolder = getValue("RelationshipToPolicyHolder");
    String driverComingFrom = getValue("DriverComingFrom");
    String driverGoingTo = getValue("DriverGoingTo");
    String alcoholBeforeIncident = getValue("AlcoholBeforeIncident");
    String driverInjuries = getValue("DriverInjuries");
    String incidentReportedToPolice = getValue("IncidentReportedToPolice");
    String whoWasAccidentDriver = getValue("WhoWasAccidentDriver");
    String damagesOnVehicle = getValue("DamagesOnVehicle");
    String addressLine1 = getValue("AddressLine_1");
    String addressLine2 = getValue("AddressLine_2");
    String suburb = getValue("Suburb/Foreign_Town");
    String cityTownForeignCountry = getValue("CityTownForeignCountry");
    String postCode = getValue("Post_Code");
    String insure = getValue("Insure");
    String policyNumber = getValue("PolicyNumber");
    String liabilityReason = getValue("Liability_Reason");
    String initiALReserveAmount = getValue("InitiAL_Reserve_Amount");
    String thirdPartyReserve = getValue("ThirdParty_Reserve");
    String paymentType = getValue("PaymentType");
    String payTo = getValue("PayTo");
    String claimTransactionStatus = getValue("Claim_Transaction_Status");


    // String thirdPartyReserveStatus = getValue("ThirdParty_Reserve_Status");


    /**
     * Method to create a new claim by selecting policy first
     */
    public String idirectclaimThroughPolicy() {

        IdirectClaims_Mappings.IdirectClaims_Factory();
        String[] claimNumber = new String[0];

        try {
//            if (exists("labelContactDashboard", true, "Contact Dashboard")) {
//                selectValueFromList("listPolicies", policyNumber + " (Policyholder)", "Select Policy " + policyNumber);
//                WebElement headingPolicyNumber = wdriver.findElement(By.xpath("//b[contains(text(),'" + policyNumber + "')]"));
//                if (headingPolicyNumber.isDisplayed()) {
            WebElement actionsLink = wdriver.findElement(By.xpath("//a[@id='ActionsLink']"));
            Actions action = new Actions(wdriver);
            action.moveToElement(actionsLink).perform();
            selectValueFromList("listActions", "Report Loss", "Select Policy " + policyNumber);
            if (exists("labelLossEventGeneralDetails", true, "Loss Event General Details")) {
                if (existsNoReport("btnRenewOK", true, "Matching Catastrophe Dialog")) {
                    click("btnRenewOK", "Click OK Button");
                }
                setText("txtBoxEventDate", getCurrentDate(), "Enter Event Date");

                selectValueFromDropdown("drpDwnCauseOfLoss", "text", causeOfLoss, "Primary Cause Of Loss Dropdown");
                setText("txtBoxEventDescription", claimDescription, "Enter Claim Description");
                if (lineOfBusiness.equalsIgnoreCase("Property")) {
                    //  Thread.sleep(10000);

                    selectValueFromDropdown("drpDwnInsuredObject", "text", insuredObject, "Insured Object Dropdown");
                }
                if (lineOfBusiness.equalsIgnoreCase("Motorcar") ||
                        lineOfBusiness.equalsIgnoreCase("All Risk") ||
                        lineOfBusiness.equalsIgnoreCase("Personal Computers") ||
                        lineOfBusiness.equalsIgnoreCase("Boats")) {
                    selectValueFromDropdown("drpDwnInsuredObject", "text", insuredObject, "Insured Object Dropdown");
                }
                if (lineOfBusiness.equalsIgnoreCase("Personal Accident")) {

                    selectValueFromDropdown("drpDwnInsuredObject", "text", insuredObject, "Insured Object Dropdown");
                }
                selectValueFromDropdown("drpDwnClaimLocationType", "text", claimLocationType, "Claim Location Type Dropdown");
                if (lineOfBusiness.equalsIgnoreCase("Motorcar") || productType.equalsIgnoreCase("Extended Cover Insurance")) {
                    setText("txtBoxAddressLine1", addressLine1, "Enter Address Line 1");
                    setText("txtBoxAddressLine2", addressLine2, "Enter Address Line 2");
                    selectValueFromAutoCompleteClaims("txtSuburbPrimary", suburb, "Enter Suburb");
                    selectValueFromDropdown("drpDwnCityTownForeignCountry", "text", cityTownForeignCountry, "Select City/Town/Foreign Country");
                    selectValueFromDropdown("drpDwnPostCode", "text", postCode, "Select Post Code");
                }
                click("btnNextCreateClaim", "Click Next Button");
                if (existsNoReport("dialogMatchingCatastrophe", true, "Matching Catastrophe Dialog")) {
                    click("btnProceed", "Click Proceed Button");
                }
                if (existsNoReport("dialogAssociatedLossEvents", true, "Associated Loss Events Dialog")) {
                    click("btnProceed", "Click Proceed Button");
                }
                if (lineOfBusiness.equalsIgnoreCase("Motorcar") || productType.equalsIgnoreCase("Extended Cover Insurance") || productType.equalsIgnoreCase("Absa Value Plus")) {
                    if (exists("labelDriverDetails", true, "Driver Details Screen")) {
                        click("btnNext", "Click Next Button");
                    }
                }
                if (exists("labelDamageCodeTree", true, "Damage Code Tree")) {
                    List<WebElement> damageNodes = wdriver.findElements(By.xpath("//span[contains(text(),'" + damageNode + "')]"));
                    for (int i = 0; i < damageNodes.size(); i++) {
                        if (damageNodes.get(i).getText().equalsIgnoreCase(damageNode)) {
                            int j = i + 1;
                            WebElement coverageNode = wdriver.findElement(By.xpath("(//td[@title='" + damageNode + "'])[" + j + "]/following-sibling::td[@aria-describedby='idit-grid-table-flattendListdamageTreeList_pipe__innerVO@damageCoverStatusVO']"));
                            if (coverageNode.getText().equalsIgnoreCase("Covered")) {
                                WebElement checkBox = wdriver.findElement(By.xpath("(//span[contains(text(),'" + damageNode + "')]//ancestor::tr//label)[" + j + "]"));
                                Actions actions = new Actions(wdriver);
                                actions.moveToElement(checkBox).build().perform();
                                checkBox.click();
                                click("btnOK", "Click OK Button");
                                break;
                            }
                        }
                    }
                }

                if (exists("labelDamagesAndRelatedContacts", true, "Damages And Related Contacts")) {
//                                if (!productType.equalsIgnoreCase("Extended Cover Insurance")) {
                    Thread.sleep(3000);
                    click("labelQuestionnaires", "Click Questionnaires Tab");
                    if (existsNoReport("labelDamagedObjectQuestionnaire", true, "Damaged Object Questionnaire")) {
                        selectValueFromDropdown("drpDwnDamageBeenAttended", "text", damageBeenAttended, "Damage Been Attended");
                        if (lineOfBusiness.equalsIgnoreCase("Property")) {
//                                            setText("txtBoxRelationshipOfPersonReportingClaim", relationshipOfPersonReportingClaim, "Relationship Of Person Reporting Claim");
                            setText("txtBoxWhyReportingClaim", whyReportingClaim, "Why Reporting Claim");
                            selectValueFromDropdown("drpDwnIncidentReportedToPolice", "text", incidentReportedToPolice, "Was the incident reported to the police?");
                            selectValueFromDropdown("drpDwnInsuranceBeforeTakingPolicy", "text", insuranceBeforeTakingPolicy, "Insurance Before Taking Policy");
                        }
                        if (lineOfBusiness.equalsIgnoreCase("Motorcar")) {
                            questionnaireClaimsMotorCar();
                        }
                    }
//                                }
                    Thread.sleep(3000);
                    click("btnNextFromClaimantAssetTabsScreen", "Click Next Button");
                    if (exists("labelDependencies", true, "Dependencies")) {
                        String LiabilityReserveAmount = getText("GetText", "Get Reserve Number");

                        System.out.println(LiabilityReserveAmount);

                        rightClick("rightClickDamage", "Performing right click on dependencies tab");
                        click("btnLiabilityReserve", "Click Liability Reserve Button");
                        selectValueFromDropdown("drpDwnReasonLiability", "text", liabilityReason, "Liability Reason");
                        setText("txtInitialReserve", initiALReserveAmount, "Enter initial reserve Amount");
                        Thread.sleep(2000);
                        setText("txtThirdParty", LiabilityReserveAmount, "Enter third party reserve Amount");
                        click("btnStatus", "Selecting detail classification dropdown");
                        click("btnStatus", "Selecting detail classification dropdown");
                        Robot r = new Robot();
                        r.keyPress(KeyEvent.VK_DOWN);
                        r.keyRelease(KeyEvent.VK_DOWN);
                        r.keyPress(KeyEvent.VK_ENTER);
                        r.keyRelease(KeyEvent.VK_ENTER);
                        click("btnLiabilityOk", "Click OK Button");
                        if (exists("labelDependencies", true, "Dependencies")) {
                            rightClick("rightClickDamage", "Performing right click on dependencies tab");
                            click("btnPayment", "Click Payment Button");
                        }
                        if (exists("labelPaymentClaimsScreen", true, "Payment Screen exist")) {
                            selectValueFromDropdown("drpDwnPaymentType", "text", paymentType, "Type selection");
                            selectValueFromDropdown("drpDwnPayTo", "text", payTo, "PayTo Selection");
                            setText("txtThirdPartyTransaction", LiabilityReserveAmount, "Enter third party reserve Amount");
                            click("btnLiabilityOk", "Click ok Button");
                            selectValueFromDropdown("drpDwnClaimsTransactionStatus", "text", claimTransactionStatus, "PayTo Selection");
                            click("btnLiabilityOk", "Click ok Button");


                        }


                        click("btnFinish", "Click Finish Button");
                        if (exists("labelMaintainEvent", true, "Maintain Event")) {
                            click("btnFinish", "Click Finish Button");
                            if (exists("txtClaimNumber", true, "Claim Creation Dialog")) {
                                String str = getText("txtClaimNumber", "Get Claim Number");
                                claimNumber = str.split("\\s+");
                                click("btnOk", "Click OK Button");
                                WebElement headingClaimNumber = wdriver.findElement(By.xpath("//b[contains(text(),'" + claimNumber[2] + "')]"));
                                if (headingClaimNumber.isDisplayed()) {
                                    logger.info("Claim " + claimNumber[2] + " Created Successfully for policy" + policyNumber);
                                }
                            }
                        }
                    }
                }

            }
//                }
//            }
        } catch (Exception e) {
            logger.info("Exception in Claim Creation is : " + e);
        }
        return claimNumber[2];
    }

    public void questionnaireClaimsMotorCar() {

        IdirectClaims_Mappings.IdirectClaims_Factory();
        try {
            //Accident Circumstances Questionnaires
            if (!productType.equalsIgnoreCase("Private Insure") && !damageNode.equalsIgnoreCase("Vehicle - Windscreen repaired WSCRRPR")
                    && !damageNode.equalsIgnoreCase("Vehicle - Winscreen replaced")) {
                //  && !insure.equalsIgnoreCase("Motorcycle")
                selectValueFromDropdown("drpDwnWhoWasAccidentDriver", "text", whoWasAccidentDriver, "Who was the accident driver");
                setText("txtBoxDriverComingFrom", driverComingFrom, "Where were you coming from when the incident happened?");
                setText("txtBoxDriverGoingTo", driverGoingTo, "Where were you going to?");
                selectValueFromDropdown("drpDwnAlcoholBeforeIncident", "text", alcoholBeforeIncident, "Did you have any alcohol / medication before the incident");
                selectValueFromDropdown("drpDwnDriverInjuries", "text", driverInjuries, "Driver injuries");
                selectValueFromDropdown("drpDwnIncidentReportedToPolice", "text", incidentReportedToPolice, "Was the incident reported to the police?");
                selectValueFromDropdown("drpDwnYouHaveInsuranceBeforeTakingPolicy", "text", insuranceBeforeTakingPolicy, "Did you have insurance before taking out this policy?");
            }

            if (damageNode.equalsIgnoreCase("Vehicle - Windscreen repaired WSCRRPR")
                    || damageNode.equalsIgnoreCase("Vehicle - Winscreen replaced")) {
                setText("txtBoxRegistrationNumberOfTheVehicle", "A123", "Enter Registration number of the vehicle");
                setText("txtBoxColour", "White", "Enter Colour");
                setText("txtBoxVINNumber", "1234", "Enter VIN Number");
                setText("txtBoxPleaseExplainInDetailHowTheIncidentHappened", "Accident", "Enter Please explain in detail how the incident happened?");
                setText("txtBoxWhichWindow(s)WereDamaged?", "right", "Enter Which window(s) were damaged?");


            }

         /* if (insure.equalsIgnoreCase("Motorcycle")) {
               selectValueFromDropdown("drpDwnWhoWasAccidentDriver", "text", whoWasAccidentDriver, "Who was the accident driver");
                selectValueFromDropdown("drpDwnYouHaveInsuranceBeforeTakingPolicy", "text", insuranceBeforeTakingPolicy, "Did you have insurance before taking out this policy?");
                selectValueFromDropdown("drpDwnWhereAreDamagesOnVehicle", "text", damagesOnVehicle, "Where are the damages on your vehicle?");
            }*/
            if (productType.equalsIgnoreCase("Private Insure") && !damageNode.equalsIgnoreCase("Vehicle - Windscreen repaired WSCRRPR")
                    && !damageNode.equalsIgnoreCase("Vehicle - Winscreen replaced")) {
                //&& insure.equalsIgnoreCase("Motorcycle")
                selectValueFromDropdown("drpDwnWhoWasAccidentDriver", "text", whoWasAccidentDriver, "Who was the accident driver");
                //setText("txtBoxDriverRelationshipToPolicyHolder", relationshipToPolicyHolder, "Accident driver relationship to policy holder");
                setText("txtBoxDriverComingFrom", driverComingFrom, "Where were you coming from when the incident happened?");
                setText("txtBoxDriverGoingTo", driverGoingTo, "Where were you going to?");
                selectValueFromDropdown("drpDwnAlcoholBeforeIncident", "text", alcoholBeforeIncident, "Did you have any alcohol / medication before the incident");
                selectValueFromDropdown("drpDwnDriverInjuries", "text", driverInjuries, "Driver injuries");
                selectValueFromDropdown("drpDwnIncidentReportedToPolice", "text", incidentReportedToPolice, "Was the incident reported to the police?");
                selectValueFromDropdown("drpDwnYouHaveInsuranceBeforeTakingPolicy", "text", insuranceBeforeTakingPolicy, "Did you have insurance before taking out this policy?");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void questionnaireClaimsProperty() {
        try {
            if (damageNode.equalsIgnoreCase("")) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void idirectClaimsClosure() {
        IdirectClaims_Mappings.IdirectClaims_Factory();
        try {

            click("btnClickDependenciesTab", "Click Dependencies tab Button");

            if (exists("labelDependencies", true, "Dependencies tab exist")) {

                rightClick("rightClickDamage", "Performing right click on dependencies tab");
            }
            Thread.sleep(2000);
            click("btnUpdateClaimsClosure", "Click Update Button");

            click("btnClickClaimsPaymentTable", "Click Table selection of Claims Payment");

            click("btnUpdateIcon", "Click Update icon Button");
            click("btnLiabilityOk", "Click OK Button");
            click("btnLiabilityOk", "Click OK Button");
            click("btnLiabilityOk", "Click OK Button");


            if (exists("labelDamageExhausted", true, "Damage exhausted exist")) {
                click("btnYesClaimsClosure", "Click yes Button");
                click("btnFinish", "Click Finish Button");
                click("btnOkClaimsClosure", "Click OK Button");


            }

            else{
                click("btnFinish", "Click Finish Button");
                click("btnOkClaimsClosure", "Click OK Button");



            }


        } catch (Exception e) {
            logger.info("Exception in Claim Closure is : " + e);
        }
    }
}
