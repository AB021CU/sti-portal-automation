package sapiens.claims;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class IdirectClaims_Mappings {


    public static void IdirectClaims_Factory(){

        Map<String, String> IdirectClaims_Objects = new HashMap<>();

        IdirectClaims_Objects.put("labelContactDashboard", "XPATH|//li[@title='Contact Dashboard']");//Contact Dashboard Label
        IdirectClaims_Objects.put("listPolicies", "XPATH|//a[@title='Policies']//parent::li//child::li");//Policies List
        IdirectClaims_Objects.put("listActions", "XPATH|//ul[@class='ActionMenu dropdown-menu']//li/a[@class='linkTag']");//Actions List
        IdirectClaims_Objects.put("labelLossEventGeneralDetails", "XPATH|//div[contains(text(),'Loss Event General Details')]");//Loss Event General Details Label

        //Loss Event General Details
        IdirectClaims_Objects.put("txtBoxEventDate", "XPATH|//input[@id='claimEventDateField']");//Event Date TextBox
        IdirectClaims_Objects.put("drpDwnCauseOfLoss", "XPATH|//select[@id='claimCauseOfLossVOListFromPol']");//Primary Cause Of Loss Dropdown
        IdirectClaims_Objects.put("txtBoxEventDescription", "XPATH|//textarea[@id='IDITForm@claimEventDescription']");//Event Description TextBox
        IdirectClaims_Objects.put("drpDwnInsuredObject", "XPATH|//select[@id='insuredObjectId']");//Insured Object Dropdown
        IdirectClaims_Objects.put("drpDwnClaimLocationType", "XPATH|//select[@id='claimLocationTypeId']");//Event Location Type Dropdown
        IdirectClaims_Objects.put("btnNextCreateClaim", "XPATH|//button[@id='createClaimNext']");//Next Button
        IdirectClaims_Objects.put("btnRenewOK", "XPATH|//button[@id='DialogOK']");//OK Button


        //Address For AVAF
        IdirectClaims_Objects.put("txtBoxAddressLine1", "XPATH|//input[@id='IDITForm@SO003@streetId']");//AddressLine1 TextBox
        IdirectClaims_Objects.put("txtBoxAddressLine2", "XPATH|//input[@id='IDITForm@SO003@houseNr']");//AddressLine2 TextBox
        IdirectClaims_Objects.put ("txtSuburbPrimary", "XPATH|//input[@id='additionalInfo(IDITForm@SO003@addressVO@cityId_autocompleteSelectInputId)']");// Suburb Autocomplete Box
        IdirectClaims_Objects.put("drpDwnCityTownForeignCountry", "XPATH|//select[@id='IDITForm@SO003@addressVO@districtId']");//Address Type Dropdown
        IdirectClaims_Objects.put("drpDwnPostCode", "XPATH|//select[@id='IDITForm@SO003@addressVO@zipCode']");//PostCode Dropdown

        //Driver Details For AVAF
        IdirectClaims_Objects.put("labelDriverDetails", "XPATH|//div[contains(text(),'Driver Details')]");//Driver Details Heading


        //Matching Catastrophe Dialog
        IdirectClaims_Objects.put("dialogMatchingCatastrophe", "XPATH|//div[@id='suggestCatastropheDivDiv']");//Matching Catastrophe Dialog
        IdirectClaims_Objects.put("dialogAssociatedLossEvents", "XPATH|//div[@title='Associated Loss Events']");//Associated Loss Events Dialog
        IdirectClaims_Objects.put("btnProceed", "XPATH|//button[@id='Proceed']");//Proceed Button

        //Damage Code Tree
        IdirectClaims_Objects.put("labelDamageCodeTree", "XPATH|//div[contains(text(),'Damage Code Tree')]");//Damage Code Tree Heading
        IdirectClaims_Objects.put("chkBoxDamageCode", "XPATH|//table[@id='idit-grid-table-flattendListdamageTreeList_pipe_']//tr//td[contains(text(),'Covered')]//parent::tr//label");//Damage Code Tree Heading
        IdirectClaims_Objects.put("btnOK", "XPATH|//button[@id='OK']");//OK Button
        IdirectClaims_Objects.put("labelDamagesAndRelatedContacts", "XPATH|//div[@title='Damages and Related Contacts']");//Damages and Related Contacts Heading
        IdirectClaims_Objects.put("labelQuestionnaires", "XPATH|//li[@title='Questionnaires']");//Questionnaires TAB


        //Damaged Object Questionnaire
        IdirectClaims_Objects.put("labelDamagedObjectQuestionnaire", "XPATH|//div[@title='Damaged Object Questionnaire']");//Damaged Object Questionnaire Heading
        IdirectClaims_Objects.put("drpDwnDamageBeenAttended", "XPATH|//select[@id='1000016@1003707']");//Has the damage been attended to? Dropdown

        // ***  Accident Circumstances Questionnaires   ***

        //Property
        IdirectClaims_Objects.put("txtBoxRelationshipOfPersonReportingClaim", "XPATH|//input[@id='1000008@1000463']");//Relationship of the person reporting the claim TextBox
        IdirectClaims_Objects.put("txtBoxWhyReportingClaim", "XPATH|//input[@id='1000008@1000067']");//Why are they reporting the claim TextBox
        IdirectClaims_Objects.put("drpDwnInsuranceBeforeTakingPolicy", "XPATH|//select[@id='1000008@1000480']");//Did you have insurance before taking out this policy? Dropdown

        //Contents//Contents - Water damage
        IdirectClaims_Objects.put("txtBoxItemsClaimedFor","XPATH|//input[@id='1000057@1001143']");
        IdirectClaims_Objects.put("drpDwnReceivedPolicyDocument","XPATH|//select[@id='1000059@1000752']");
        IdirectClaims_Objects.put("drpDwnDidYouHaveInsuranceBeforeTakingOutThisPolicy","XPATH|//select[@id='1000059@1000754']");
        IdirectClaims_Objects.put("drpDwnWhatIsPreferedWayOfCommunication","XPATH|//select[@id='1000059@1002379']");
        IdirectClaims_Objects.put("drpDwnWasTheLandWasVacantDuringTheLoss","XPATH|//select[@id='1000057@1001141']");

        //Contents//
        IdirectClaims_Objects.put("","");

        //Motorcar
        IdirectClaims_Objects.put("labelAccidentCircumstancesQuestionnaires", "XPATH|//div[@title='Accident Circumstances Questionnaires']");//Accident Circumstances Questionnaires Heading
        IdirectClaims_Objects.put("txtBoxDriverRelationshipToPolicyHolder", "XPATH|//input[@id='1000009@1000131']");//Accident driver relationship to policy holder TextBox
        IdirectClaims_Objects.put("txtBoxDriverComingFrom", "XPATH|//input[@id='1000009@1000136']");//Where were you coming from when the incident happened? TextBox
        IdirectClaims_Objects.put("txtBoxDriverGoingTo", "XPATH|//input[@id='1000009@1000138']");//Where were you going to? TextBox
        IdirectClaims_Objects.put("drpDwnAlcoholBeforeIncident", "XPATH|//select[@id='1000009@1000140']");//Did you have any alcohol / medication before the incident Dropdown
        IdirectClaims_Objects.put("drpDwnDriverInjuries", "XPATH|//select[@id='1000009@1000373']");//Driver Injuries Dropdown
        IdirectClaims_Objects.put("drpDwnInsuranceBeforeTakingPolicy2", "XPATH|//select[@id='1000007@1000048']");//Did you have insurance before taking out this policy? Dropdown
        IdirectClaims_Objects.put("drpDwnIncidentReportedToPolice", "XPATH|//select[@id='1000008@1000382' or @id='1000009@1000376']");//Was the incident reported to the police? Dropdown
        IdirectClaims_Objects.put("drpDwnWhoWasAccidentDriver", "XPATH|//select[@id='1000007@1000562' or @id='1000009@1000564']");//Who was the accident driver Dropdown
        IdirectClaims_Objects.put("drpDwnDamagesOnVehicle", "XPATH|//select[@id='1000007@1000038']");//Where are the damages on your vehicle Dropdown
        IdirectClaims_Objects.put("drpDwnYouHaveInsuranceBeforeTakingPolicy", "XPATH|//select[@id='1000007@1000048' or @id='1000009@1000176']");//Did you have insurance before taking out this policy? Dropdown
        IdirectClaims_Objects.put("drpDwnWhereAreDamagesOnVehicle", "XPATH|//select[@id='1000007@1000383']");//Where are the damages on your vehicle? Dropdown

        // windscreen damage code
        IdirectClaims_Objects.put("txtBoxRegistrationNumberOfTheVehicle", "XPATH|//input[@id='1000005@1000023']");//Registration number of the vehicle TextBox
        IdirectClaims_Objects.put("txtBoxColour", "XPATH|//input[@id='1000005@1000486']");//Colour TextBox
        IdirectClaims_Objects.put("txtBoxVINNumber", "XPATH|//input[@id='1000005@1000491']");//VIN Number TextBox
        IdirectClaims_Objects.put("txtBoxPleaseExplainInDetailHowTheIncidentHappened", "XPATH|//input[@id='1000005@1000492']");//Please explain in detail how the incident happened? TextBox
        IdirectClaims_Objects.put("txtBoxWhichWindow(s)WereDamaged?", "XPATH|//input[@id='1000005@1000493']");//Which window(s) were damaged? TextBox



        IdirectClaims_Objects.put("btnNextFromClaimantAssetTabsScreen", "XPATH|//button[@id='nextFromClaimantAssetTabsScreen']");//Next Button


        //Dependencies
        IdirectClaims_Objects.put("labelDependencies", "XPATH|//div[@title='Dependencies']");//Dependencies Heading
        IdirectClaims_Objects.put("btnFinish", "XPATH|//button[@id='Finish']");//Finish Button

        //Maintain Event
        IdirectClaims_Objects.put("labelMaintainEvent", "XPATH|//div[contains(text(),'Maintain Event')]");//Maintain Event Heading
        IdirectClaims_Objects.put("dialogContactConfirmation", "XPATH|//div[@class='ConfirmationPageMessageDiv']//h2[contains(text(),'Loss Event')]");//Contact Creation Dialog Box


        IdirectClaims_Objects.put("btnViewDocuments", "XPATH|//button[@title='View documents']");//View Documents Button
        IdirectClaims_Objects.put("txtClaimNumber", "XPATH|//div[@class='ConfirmationPageMessageDiv']/span/h2");//Claim Creation Dialog Text
        IdirectClaims_Objects.put("btnOk", "XPATH|//button[@id='Ok']");//Ok Button
        IdirectClaims_Objects.put("btnNext", "XPATH|//button[@id='Next']");//Next Button


        IdirectClaims_Objects.put("listDamageNodes", "XPATH|//input[@id='1000008@1000067']PATH|//td[@aria-describedby='idit-grid-table-flattendListdamageTreeList_pipe__innerVO@presentationValue']");//Ok Button
        IdirectClaims_Objects.put("listCoverageNodes", "XPATH|//td[@aria-describedby='idit-grid-table-flattendListdamageTreeList_pipe__innerVO@damageCoverStatusVO']");//Ok Button





        //new functionality in claims


        IdirectClaims_Objects.put("GetText", "XPATH|//table[@id='idit-grid-table-flattendListclaimTree_pipe_']/tbody/tr[4]/td[5]");//Performing right click on dependencies tab

        IdirectClaims_Objects.put("rightClickDamage", "XPATH|//table[@id='idit-grid-table-flattendListclaimTree_pipe_']/tbody/tr[4]");//Performing right click on dependencies tab
        IdirectClaims_Objects.put("btnLiabilityReserve", "XPATH|(//a[text()='Liability Reserve'])[2]");//Liability reserve Button
        IdirectClaims_Objects.put("btnPayment", "XPATH|(//a[text()='Payment'])[2]");//Payment  Button


        // Liability reserve screen in claims

        IdirectClaims_Objects.put("drpDwnReasonLiability", "XPATH|//select[@automationid='IDITForm@claimReserveReasonVO@id']");// Reason Dropdown
        IdirectClaims_Objects.put("txtInitialReserve", "XPATH|//input[@id='IDITForm@reserveLineList|1@creditAmountVO@amount']");//Claim initial reserve  Text
        IdirectClaims_Objects.put("txtThirdParty", "XPATH|//input[@id='IDITForm@reserveLineList|2@creditAmountVO@amount']");//Claim initial reserve  Text
        IdirectClaims_Objects.put("btnStatus", "XPATH|//div[@id='s2id_IDITForm@reserveLineList|2@status@id']");// Third Party Status Dropdown
        IdirectClaims_Objects.put("btnLiabilityOk", "XPATH|//button[@id='OK']");//Ok Button

// Payment adding screen
        IdirectClaims_Objects.put("labelPaymentClaimsScreen", "XPATH|//div[@class='FormTitle noDashboard noMargin FormTitle noDashboard noMargin']");//Payment screen claims
        IdirectClaims_Objects.put("drpDwnPaymentType", "XPATH|//select[@id='claimTransactionTypeVO']");// Type Dropdown
        IdirectClaims_Objects.put("drpDwnPayTo", "XPATH|//select[@id='beneficiaryTypeVO']");// Payto Dropdown
        IdirectClaims_Objects.put("txtThirdPartyTransaction", "XPATH|//input[@id='IDITForm@claimTransactionLineList|1@creditAmountVO@amount']");//Claim third party Payment  Text
        IdirectClaims_Objects.put("drpDwnClaimsTransactionStatus", "XPATH|//select[@id='claimTransactionStatusList']");// Claims Transaction Status Dropdown


// Claims closure

        IdirectClaims_Objects.put("btnClickDependenciesTab", "XPATH|//a[text()='Dependencies']");//Dependencies Heading selection
        //li[@title='Dependencies']
        // Claims_Objects.put("btnUpdateClaimsClosure", "XPATH|(//a[text()='Update'])[3]");//Update Button
        IdirectClaims_Objects.put("btnUpdateClaimsClosure", "XPATH|//li[@id='liflattendListclaimTree|Update']");//Update Button

        IdirectClaims_Objects.put("btnClickClaimsPaymentTable", "XPATH|//table[@id='idit-grid-table-IDITForm_at_paymentsList_pipe_']/tbody/tr[2]/td[4]");//Claims Payment table selection
        IdirectClaims_Objects.put("btnUpdateIcon", "XPATH|//a[@id='IDITForm@paymentsList|Update']");//Update icon selection
        IdirectClaims_Objects.put("labelDamageExhausted", "XPATH|//div[@title='The Damage reserves are exhausted. Close damage?']");//Damage Exhausted claims
        IdirectClaims_Objects.put("btnYesClaimsClosure", "XPATH|//button[text()='Yes']");//Yes Button
        IdirectClaims_Objects.put("btnOkClaimsClosure", "XPATH|//button[@id='Ok']");//Update Button

        // (//td[text()='Completed'])[3]


        WebDr.page_Objects = IdirectClaims_Objects ;

    }
}
