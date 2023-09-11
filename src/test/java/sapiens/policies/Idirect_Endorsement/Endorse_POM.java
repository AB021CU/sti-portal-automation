package sapiens.policies.Idirect_Endorsement;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class Endorse_POM {
    public static void Endorse_Factory(){
        Map<String, String> Endorse_POM = new HashMap<>();

        //ABSA_IDIRECT_ENDORSEMENTS_CODES_TO_BE_USED

        //FOR SEARCHING POLICY
        Endorse_POM.put("drpdwnRecentSelect","XPATH|//select[@id='finderKeySelect']");//Policies
        Endorse_POM.put("drpdwnExpander","XPATH|//span[contains(text(),'Search by Policy/Proposal Details')]");
        Endorse_POM.put("btnHide","XPATH|//div[@id='showHiedAllFieldsButton']//i");
        Endorse_POM.put("txtPolicyNumber1","XPATH|//input[contains(@id,'policyNumber')]");
        Endorse_POM.put("drpdwnProductType","XPATH|//select[@id='productVOId']");//Absa idirect
        Endorse_POM.put("btnFind","XPATH|//button[@id='homepageButtonsB_Search'][text()='Find']");
        //Endorse_POM.put("linkNewProposal", "XPATH|//a[@id='MainMenuPolicy_Link']");//To verify

        //FOR ENDORSEING POLICY

        Endorse_POM.put("btnGeneralEndorsement","XPATH|//a[contains(@title,'General Endorsement')]");
        Endorse_POM.put("btnAdd","XPATH|//a[@title='Add']");
        Endorse_POM.put("chkMigrated","XPATH|//label[@id='isMigratedPolicyCheckLabel']");
        Endorse_POM.put("drpdwnStaffIndicator","XPATH|//select[@id='staffIndicator']");//Staff Member
        Endorse_POM.put("drpdwnCategory","XPATH|//select[@id='CategoryVO']");//Request by Carrier
        Endorse_POM.put("drpdwnReason","XPATH|//select[@id='EndorsementReason']");//
        Endorse_POM.put("txtDescription","XPATH|//textarea[contains(@id,'endorsmentReasonVORowVO@remarks')]");//The Reason is accepted
        Endorse_POM.put("buttonupdate","XPATH|//button[text()='Update']");
        //Endorse_POM.put("btnNext","XPATH|//button[@id='Next']");
        Endorse_POM.put("verfyDialogeBox","XPATH|//div[@id='BasicNotificationDialog']");
        Endorse_POM.put("clkOk","XPATH|//button[@id='DialogOK']");

        //FOR VERIFYING THE POLICY COVER
        Endorse_POM.put("verfyLOBPage","XPATH|//div[@title='Line of Business/Locations/Risk Object']");
        Endorse_POM.put("verfyLOBProperty","XPATH|//span[text()='Property']");
        Endorse_POM.put("verfyLOBMotorcar","XPATH|//span[text()='Motorcar']");
        Endorse_POM.put("verifyLOBAllrisk","XPATH|//span[text()='All Risk']");
        Endorse_POM.put("verifyLOBBoats","XPATH|//span[text()='Boats']");
        Endorse_POM.put("verifyLOBEE","XPATH|//span[text()='Electronic Equipment']");

        //FOR VERIFYING THE PRODUCTS
        Endorse_POM.put("verifyContents","XPATH|//span[text()='Contents']");
        Endorse_POM.put("verifyBuilding","XPATH|//span[text()='Building']");
        Endorse_POM.put("verifyVehicle","XPATH|//span[text()='Vehicle Comprehensive']");
        Endorse_POM.put("verifyMotorcycle","XPATH|//span[text()='Motorcycle Comprehensive']");
        Endorse_POM.put("verifyCaravan","XPATH|//span[text()='Caravan/Trailer Comprehensive']");

        //Endorse_POM.put("btnDelete","XPATH|//a[@id='flattendListflattenedPolicyItems|Delete']//i");
        //Endorse_POM.put("btnUpdate1","XPATH|//a[@id='flattendListflattenedPolicyItems|Update']//i");
        Endorse_POM.put("basicNotification","XPATH|//div[@id='BasicNotificationDialog']");
        Endorse_POM.put("btnOkay","XPATH|//button[@id='DialogOK']");
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Endorse_POM.put("imgHome", "XPATH|//a[@id='MainMenuFind_ImgLink']/div[@class='homeImgDiv']");//Home Image
        Endorse_POM.put("linkRecentContacts", "XPATH|(//div[@id='userRecentContactsListAddInfo|']//li)[1]");//First Recent Contact Link
        Endorse_POM.put("tabContactDashboard", "XPATH|//li[@title='Contact Dashboard' and @aria-controls='DashboardTabContent']");//Contact Dashboard Tab

        //***********   GENERAL DETAILS   ***********

        //General Details
        Endorse_POM.put("linkNewProposal", "XPATH|//a[@id='MainMenuPolicy_Link']");//New Proposal Link
        Endorse_POM.put("labelGeneralDetails", "XPATH|//div[contains(text(),'General Details')]");//General Details Heading
        Endorse_POM.put("drpDwnProductName", "XPATH|//select[@id='Product']");//Product Name Dropdown
        Endorse_POM.put("drpDwnMembership", "XPATH|//select[@id='IDITForm@affinityVO@id']");//Membership Dropdown
        Endorse_POM.put("drpDwnPolicyType", "XPATH|//select[@id='IDITForm@policyPeriodTypeABSAVO@id']");//Policy Type Dropdown
        Endorse_POM.put("drpDwnPolicyRenewal", "XPATH|//select[@id='IDITForm@policyPeriodVO@id']");//Policy Renewal Dropdown

        Endorse_POM.put("chkBoxClientContext", "XPATH|//label[@id='isClientConsentCreditCheckLabel']");
        Endorse_POM.put("txtBoxOldPolicyNumber", "XPATH|//input[@id='IDITForm@migratedPolicyNumber']");//Old Policy Number TextBox
        Endorse_POM.put("txtBoxExternalReferenceNumber", "XPATH|//input[@id='IDITForm@externalReferenceNumber']");//External Reference Number TextBox
        Endorse_POM.put("drpDwnSalesForceOpportunityID", "XPATH|//select[@id='IDITForm@salesForceOpportunity']");//SalesForce Opportunity ID Dropdown
        Endorse_POM.put("drpDwnBranchCode", "XPATH|//select[@id='branchCodeRegion']");//Branch Code Dropdown
        Endorse_POM.put("drpDwnSource", "XPATH|//select[@id='source']");//Source Dropdown
        Endorse_POM.put("txtBoxExternalReferenceName", "XPATH|//input[@id='IDITForm@externalReferenceName']");//External Reference Name
        Endorse_POM.put("txtBoxCaseNbr", "XPATH|//input[@id='IDITForm@caseNbr']");//Case NBR
        Endorse_POM.put("drpDwnStaffIndicator", "XPATH|//select[@id='staffIndicator']");//Staff Indicator Dropdown
        Endorse_POM.put("btnBoxOrigin", "XPATH|//i[@class='fa fa-stack-1x fa-ellipsis-h']");//Origin TextBox
        Endorse_POM.put("btnBoxOriginClick", "XPATH|//table[@id='idit-grid-table-flattendListattnQuestVOtreelist_pipe_']/tbody/tr[4]");//Origin click

        //Sales Transaction Channel
        Endorse_POM.put("drpDwnCurrentSalesChannel", "XPATH|//select[@id='IDITForm@currentChannelVO@id']");//Current Sales Channel Dropdown
        Endorse_POM.put("drpDwnAffinity", "XPATH|//select[@id='IDITForm@affinityVO@id' and @title ='Affinity']"); // Affinity Dropdown

        //Proposal Questionnaire
        //Absa Idirect
        Endorse_POM.put("drpDwnQuestion1_AbsaIdirect","XPATH|//select[@id='1000051@1000693']");
        Endorse_POM.put("drpDwnQuestion2_AbsaIdirect","XPATH|//select[@id='1000051@1000694']");
        Endorse_POM.put("drpDwnQuestion3_AbsaIdirect","XPATH|//select[@id='1000051@1000695']");
        Endorse_POM.put("drpDwnQuestion4_AbsaIdirect","XPATH|//select[@id='1000051@1000697']");

        //Client Code Validation
        Endorse_POM.put("labelContactDashboard", "XPATH|//li[@title='Contact Dashboard']");//Contact Dashboard Label
        Endorse_POM.put("linkUpdateContact", "XPATH|//a[@id='UpdateContactNewGen_Link']");//Update Contact Link
        Endorse_POM.put("labelPrimaryDetails", "XPATH|//li[@title='Primary details']");//Primary Details Label
        Endorse_POM.put("txtBoxClientCode", "XPATH|//input[@id='clientCode']");//Client Code TextBox


        //***********   Line of Business/Locations/Risk Object   ***********

        Endorse_POM.put("labelLineOfBusiness", "XPATH|//div[@title='Line of Business/Locations/Risk Object']");//Line of Business/Locations/Risk Object Label
        Endorse_POM.put("listLineOfBusiness", "XPATH|//table[@id='idit-grid-table-flattendListflattenedPolicyItems_pipe_']//tbody//child::span");//Dialing Code TextBox
        Endorse_POM.put("btnUpdate", "XPATH|//a[@title='Update']/i");//Update Button
        Endorse_POM.put("labelClauses", "XPATH|//div[@class='Title' and contains(text(),'Clauses')]");//Clauses Heading
        Endorse_POM.put("labelCustomerRiskObjectNumber", "XPATH|//div[contains(text(),'Search by Customer Risk Object Number')]");//Search by Customer Risk Object Number Heading
        Endorse_POM.put("btnAddLocationsRiskObjects", "XPATH|//a[@id='flattendListflattenedPolicyItems|New']/i");//Add Locations/Risk Objects Button
        Endorse_POM.put("labelInsuredGeneralDetails", "XPATH|//div[contains(text(),'Insured general details')]");//Insured general details Heading
        Endorse_POM.put("labelCoverSelection", "XPATH|//div[@title='Cover selection']");//Cover Selection Heading
        Endorse_POM.put("btnEndCoversSelection", "XPATH|//button[@id='Finish' and @title='End covers selection']");//End Covers Selection Button
        Endorse_POM.put("locationsRiskObjectsCount", "XPATH|//table[@id='idit-grid-table-flattendListflattenedPolicyItems_pipe_']//tr");//Locations Risk/Objects Count
        Endorse_POM.put("btnNextCustomerRiskObjectNumber", "XPATH|//button[@id='Finish' and @title='Next']");//Next Button On Customer Risk Object Number Screen
        //VehicleThirdParty
        Endorse_POM.put("chBoxCovers","XPATH|//div[@class='tree-wrap tree-wrap-ltr']");
        Endorse_POM.put("labelThirdParty","XPATH|//span[text()='Third Party']");
        Endorse_POM.put("labelVehicleFire","XPATH|//span[text()='Vehicle Fire']");
        Endorse_POM.put("labelUP","XPATH|//a[@title='Update']");
        Endorse_POM.put("chBoxAccidentalDamagePartialLoss","XPATH|//label[@id='flattendListflattenedPolicyItems|2@isSelectedLabel']");
        Endorse_POM.put("chBoxAccidentalDamageTotalLoss","XPATH|//label[@id='flattendListflattenedPolicyItems|3@isSelectedLabel");
        Endorse_POM.put("chBoxTheftPartialLoss","XPATH|//label[@id='flattendListflattenedPolicyItems|4@isSelectedLabel']");
        Endorse_POM.put("chBoxTheftTotalLoss","XPATH|//label[@id='flattendListflattenedPolicyItems|5@isSelectedLabel']");
        Endorse_POM.put("chBoxWindScreenRepair","XPATH|//label[@id='flattendListflattenedPolicyItems|6@isSelectedLabel']");
        Endorse_POM.put("chBoxWindScreenReplace","XPATH|//label[@id='flattendListflattenedPolicyItems|7@isSelectedLabel']");
        Endorse_POM.put("chBoxHail","XPATH|//label[@id='flattendListflattenedPolicyItems|8@isSelectedLabel']");
        //VehicleThirdParty
        Endorse_POM.put("chBoxThirdParty","XPATH|//label[@id='flattendListflattenedPolicyItems|9@isSelectedLabel']");
        Endorse_POM.put("chBoxForOther","XPATH|//label[@id='flattendListflattenedPolicyItems|10@isSelectedLabel']");
        //VehcileFire
        Endorse_POM.put("chBoxVehicleFire","XPATH|//label[@id='flattendListflattenedPolicyItems|11@isSelectedLabel']");
        Endorse_POM.put("btnFinish&Next","XPATH|//button[@id='Finish'][@title='Next']");



        Endorse_POM.put("","");
        Endorse_POM.put("btnEndRiskDetails", "XPATH|//button[@id='next' and @title='End risk details']");//End Risk Details Button
        Endorse_POM.put("labelPayments", "XPATH|//div[@title='Payments']");//Payments Heading
        Endorse_POM.put("drpDwnUWValidation", "XPATH|(//select[@class='idit-combobox nextStatusSelectClass select2-offscreen'])[1]");//UW 1 selection
        Endorse_POM.put("drpDwnUWValidation2", "XPATH|(//select[@class='idit-combobox nextStatusSelectClass select2-offscreen'])[2]");//UW 2 selection
        Endorse_POM.put("drpDwnUWValidation3", "XPATH|(//select[@class='idit-combobox nextStatusSelectClass select2-offscreen'])[3]");//UW 2 selection
        Endorse_POM.put("labelUWContains", "XPATH|//div[contains(text(),'Underwriting Alerts')]");//Under writing Heading
        Endorse_POM.put("btnUWNext", "XPATH|//button[@id='Next']");//Under writing Next Button
        Endorse_POM.put("labelUWNumberOfDropdown1", "XPATH|(//div[@class='select2-container idit-combobox nextStatusSelectClass'])[1]");//Under writing Heading
        Endorse_POM.put("labelUWNumberOfDropdown2", "XPATH|(//div[@class='select2-container idit-combobox nextStatusSelectClass'])[2]");//Under writing Heading
        Endorse_POM.put("labelUWNumberOfDropdown3", "XPATH|(//div[@class='select2-container idit-combobox nextStatusSelectClass'])[3]");//Under writing Heading
        Endorse_POM.put("txtBoxUserName", "XPATH|//input[@id='UserName']");//TextBox of User Name
        Endorse_POM.put("txtBoxPassword", "XPATH|//input[@id='Password']");//TextBox of Password
        Endorse_POM.put("btnLogin", "XPATH|//button[@class='login-button idit-btn']");//Login Button
        Endorse_POM.put("linkChangePassword", "XPATH|//div[@class='loginChangeForget']");//Change Password Link
        Endorse_POM.put("expectedUserName", "XPATH|//button[@id='userMenuButton']/span[@class='buttonLabel']");//Logged in User Name
        Endorse_POM.put("btnLogOff", "XPATH|//div[@id='mainTopBarRightUserDiv']/ul/li/a[@id='LogOff']");//LogOff Button
        Endorse_POM.put("txtLoginError", "XPATH|//div[@id='login_error']/span[@id='login_error_span']");//Login Error Text
        Endorse_POM.put("imgHome1", "XPATH|//a[@id='MainMenuFind_ImgLink']/div[@class='homeImgDiv']");//Home Image
        Endorse_POM.put("btnUserMenu", "XPATH|//button[@id='userMenuButton']");//User Menu Button on Top Right Corner
        Endorse_POM.put("elmntLogOff", "XPATH|//a[@id='LogOff']");//User Menu Button on Top Right Corner
        Endorse_POM.put("dialogLogOff", "XPATH|//div[@id='BasicNotificationDialog']");//Confirm Logoff dialog box
        Endorse_POM.put("btnOKUw", "XPATH|//button[@id='DialogOK']");//OK button on Confirm Logoff Dialog Box
        Endorse_POM.put("btnCancel", "XPATH|//button[@id='DialogCancel']");//Cancel button on Confirm Logoff Dialog Box
        Endorse_POM.put("labelSessionCount", "XPATH|//span[@class='pagesRectangleText']");//Session Count
        Endorse_POM.put("linkSessionMainMenu", "XPATH|//a[@id='SessionsMainMenu']");//Sessions Main Menu
        Endorse_POM.put("labelCloseAll", "XPATH|//a[@id='pagesCloseAllMainMenu']");//Close All

        Endorse_POM.put("txtVehicleMileage","XPATH|//input[@id='vehicleMileage']");


        //*** PROPERTY  LOB  *****

        //Property Address
        Endorse_POM.put("labelPropertyAddress", "XPATH|//div[@title='Property Address']");//Property Address Heading
        Endorse_POM.put("chkBoxRiskAddressSame", "XPATH|//label[@id='IDITForm@riskAddressSameAsContactLabel']");//Is the Risk Address Same as the Contact Physical Address? Checkbox
        //Property General Details
        Endorse_POM.put("chkBoxBuilding", "XPATH|//label[@id='buildingLabel']");//Building Checkbox
        Endorse_POM.put("chkBoxContents", "XPATH|//label[@id='contentsLabel']");//Contents Checkbox
        Endorse_POM.put("drpDwnBuildingUsedFor", "XPATH|//select[@id='buildingUseVO']");//What will the building be used for? Dropdown
        Endorse_POM.put("drpDwnTypeOfBuilding", "XPATH|//select[@id='buildingTypeVO']");//What type of building is it? Dropdown
        Endorse_POM.put("drpDwnTypeOfArea", "XPATH|//select[@id='areaABSAVO']");//What type of area is the building located in? Dropdown
        Endorse_POM.put("chkBoxIsBuildingOccupied", "XPATH|//label[@id='isBuildingOccupiedLabel']");//Is the building occupied? Checkbox
        Endorse_POM.put("txtBoxOccupiedSinceDate", "XPATH|//input[@id='occupiedSinceDate']");//Occupied Since Date TextBox
        Endorse_POM.put("chkBoxIsPropOccupiedDuringDay", "XPATH|//label[normalize-space()='Is the property occupied during the day?']");
        Endorse_POM.put("txtBoxUnoccupiedDays", "XPATH|//input[@id='noOfConsUnoccupiedDays']");//Number of consecutive unoccupied days TextBox
        Endorse_POM.put("drpDwnWallConstruction", "XPATH|//select[@id='constructionTypeVO']");//Wall construction Dropdown
        Endorse_POM.put("drpDwnRoofConstruction", "XPATH|//select[@id='roofMaterialVO']");//Roof construction Dropdown
        Endorse_POM.put("txtBoxNumberOfOutBuildings", "XPATH|//input[@id='numberOfOutBuildings']");//How Many Out Buildings are there TextBox
        Endorse_POM.put("chkBoxDoes_the_property_border_aXn_residential_property", "XPATH|//label[contains(text(),'Does the property border a non residential propert')]");
        Endorse_POM.put("drpDwnSpecifyNonResidential", "XPATH|//select[@id='propertyTypeVO']");
        Endorse_POM.put("chkBoxIsThereThatched", "XPATH|//label[contains(text(),'Is there a thatched Lapa within 3 meters of the ma')]");//Is there a thatched lapa within 3 meters of main dwelling ?
        Endorse_POM.put("drpDwnThatchedHutFloor", "XPATH|//select[@id='thatcLapaIDirectFloorArea']"); // Thatched Lapa hut floor area
        Endorse_POM.put("chkBoxDoesSizeOfLapa", "XPATH|//label[contains(text(),'Does the Size of Lapa exceed 25% of total surface ')]"); // Does the Size of Lapa exceed 25% of total surface area?
        Endorse_POM.put("chkDoesYouHaveASabsaApprovedLightingConductor", "XPATH|//label[normalize-space()='Do you have a SABS approved lightning conductor?']"); // Does the Size of Lapa exceed 25% of total surface area?
        Endorse_POM.put("chkWaive_Lightning_Conductor", "XPATH|//label[normalize-space()='Waive Lightning Conductor?']");
        Endorse_POM.put("chkIs_the_building_completed", "XPATH|//label[normalize-space()='Is the building completed']");
        Endorse_POM.put("chkHave_you_had_any_burglaries_at_the_property", "XPATH|//label[normalize-space()='Have you had any burglaries at the property?']");
        Endorse_POM.put("chkIs_the_property_in_a_high_security_complex", "XPATH|//label[normalize-space()='Is the property in a high security complex?']");
        Endorse_POM.put("chkAreThereHighWalls", "XPATH|//label[normalize-space()='Are there 1.8m high walls']");
        Endorse_POM.put("chkAreThereRazorWireAlongThePerimeterWall", "XPATH|//label[normalize-space()='Are there Razor wire along the perimeter wall']");
        Endorse_POM.put("chkIsThereAnElectronicGate", "XPATH|//label[normalize-space()='Is there an electronic gate?']");
        Endorse_POM.put("chkIsThere24hrsSecurityOrAccessControlOnGates", "XPATH|//label[normalize-space()='Is there 24hr security or access control on gates?']");
        Endorse_POM.put("chkIsThereElectricFencing", "XPATH|//label[normalize-space()='Is there electric fencing?']");
        Endorse_POM.put("chkIsThereA24HrsSecurityGuardPatrol", "XPATH|//label[normalize-space()='Is there a 24-hour security guard patrol?']");
        Endorse_POM.put("chkPropertySurveyRequired", "XPATH|//label[normalize-space()='Property Survey required?']");
        Endorse_POM.put("txtBoxDateRiskSurveyRequested", "XPATH|//input[@id='dateRiskSurveyRequested']");
        Endorse_POM.put("txtBoxDateRiskSurveyReceived", "XPATH|//input[@id='dateRiskSurveyReceived']");
        Endorse_POM.put("chkAreThereAnyGasAppliancesOrEquipment", "XPATH|//label[normalize-space()='Are there any Gas appliances or equipment?']");
        Endorse_POM.put("chkAreThereAnyGasPipeConnections", "XPATH|//label[normalize-space()='Are there any Gas Pipe Connections?']");
        Endorse_POM.put("chkIsThereAnyBusinessConductedOnTheProperty", "XPATH|//label[normalize-space()='Is there any business conducted on the property?']");
        Endorse_POM.put("chkTypeOfBusinessDescription", "XPATH|//textarea[@id='typeOfBusinessDescription']");
        Endorse_POM.put("txtBoxPlotQuestionnarieRequested", "XPATH|//input[@id='inventoryRequestedDate']");
        Endorse_POM.put("txtBoxplotQuestionnarieRecevied", "XPATH|//input[@id='inventoryReceivedDate']");

        //Building Details
        Endorse_POM.put("txtBoxNoOfGeysers", "XPATH|//input[@id='noOfGeysers']");//Number of geysers in building and out building TextBox
        Endorse_POM.put("txtBoxNoOfSolarGeysers", "XPATH|//input[@id='noOfSolarGeysers']");//How many are solar geysers TextBox
        Endorse_POM.put("drpDwnBondApplicable", "XPATH|//select[@id='bondApplied']");//Is or was there a bond applicable to this house? Dropdown
        Endorse_POM.put("txtBoxSumInsuredMainBuilding", "XPATH|//input[@id='sumInsuredMainBuilding']");//Sum insured of main building TextBox
        Endorse_POM.put("txtBoxSumInsuredOutBuilding", "XPATH|//input[@id='sumInsuredOutBuilding']");//Sum Insured of Outbuildings TextBox
        Endorse_POM.put("drpDwnFlatBuilding", "XPATH|//select[@id='flatBuildingIdirect']");//Flat Building
        Endorse_POM.put("drpDwnFlatContent","XPATH|//select[@id='flatContentsIDirect']");//Flat Content
        Endorse_POM.put("txtClaims12months","XPATH|//input[@id='numClaimLosspast12Content']");//Cotents claims 12 months
        Endorse_POM.put("txtClaims13months","XPATH|//input[@id='numClaimlosspass13Content']");//Contents claims 13 months
        Endorse_POM.put("txtClaims25months","XPATH|//input[@id='numClaimlosspast25Content']");//Contenst claims 25 months
        Endorse_POM.put("drpDwnRegisteredOwnerBuilding", "XPATH|//select[@id='regOwner']");//Registered Owner Dropdown
        Endorse_POM.put("labelPropertyAdditionalDetails", "XPATH|//div[contains(text(),'Property Additional Details')]  ");//Property Additional Details Heading
        Endorse_POM.put("labelPropertyTechnicalReport", "XPATH|//div[contains(text(),'Property Technical Report')]");//Property Technical Details Heading
        Endorse_POM.put("chkAreYouOffTheEskom/CityPowerGrid", "XPATH|//label[normalize-space()='Are you off the Eskom/City Power Grid']");
        Endorse_POM.put("chkDoYouHaveAGenerator", "XPATH|//label[normalize-space()='Do you have a generator']");
        Endorse_POM.put("chkIsGeneratorConnectedToPowerBackup", "XPATH|//label[normalize-space()='Is a generator connected to the Power Box?']");
        Endorse_POM.put("txtBoxDateCertificateRequested", "XPATH|//input[@id='dateCertificateRequested']");
        Endorse_POM.put("txtBoxDateCertificateReceived", "XPATH|//input[@id='dateCertificateReceived']");
        Endorse_POM.put("drpDwnCoverType", "XPATH|//select[@id='coverageTypeAbSAVO']");
        Endorse_POM.put("txtBoxCompulsoryExcess", "XPATH|//input[@id='compulsoryExcess']");
        Endorse_POM.put("txtBoxHaveYouHadUnInterruptedBuildingInsuranceFor", "XPATH|//label[contains(text(),'Have you had uninterrupted building insurance for ')]");
        Endorse_POM.put("txtBoxNoOfClaimPast12Months", "XPATH|//input[@id='noOfClaimPast12Months']");
        Endorse_POM.put("txtBoxNoOfClaimPast13To24Months", "XPATH|//input[@id='noOfClaimPast13To24Months']");
        Endorse_POM.put("txtBoxNoOfClaimPast25To36Months", "XPATH|//input[@id='noOfClaimPast25To36Months']");
        Endorse_POM.put("txtBoxNotesBuilding", "XPATH|//textarea[@id='notes']");

        //House Content Details
        Endorse_POM.put("drpDwnAlarmInstalled", "XPATH|//select[@id='alarmInstalledVO']");//Do you have an alarm installed? Dropdown
        Endorse_POM.put("chkBoxAlarmProfessionallyInstalled", "XPATH|//label[@id='alarmProfessionallyInstalledLabel']");//Was the alarm professionally installed? Checkbox
        Endorse_POM.put("chkBoxAlarmInfraRedDetectors", "XPATH|//label[@id='alarmInfraRedDetectorsLabel']");//Does the alarm have infra-red detectors? Checkbox
        Endorse_POM.put("chkBoxAlarmWorkingOrder", "XPATH|//label[@id='alarmWorkingOrderLabel']");//Is the alarm in working order? Checkbox
        Endorse_POM.put("drpDwnBurglarBarsMainDwelling", "XPATH|//select[@id='burglarBarsVO']");//Are there burglar bars installed to the main dwelling? Dropdown
        Endorse_POM.put("drpDwnExternalDoorMainDwelling", "XPATH|//select[@id='externalDoorSecurityMainDwellingVO']");//Are there external door security gates to the main dwelling? Dropdown
        Endorse_POM.put("drpDwnBurglarBarsOutbuilding", "XPATH|//select[@id='IDITForm@burglarbarsOutbuildingCon']");//Are there burglar bars installed to outbuilding ? Dropdown
        Endorse_POM.put("drpDwnExternalDoorOutbuilding", "XPATH|//select[@id='IDITForm@externaldoorsecurOutbuilding']");//Are there external door security gates to the outbuilding ? Dropdown
        Endorse_POM.put("txtBoxInventoryRequestedDate", "XPATH|//input[@id='inventoryRequestedDate']");//Inventory Requested Date TextBox
        Endorse_POM.put("txtBoxInventoryReceivedDate", "XPATH|//input[@id='inventoryReceivedDate']");//Inventory Received Date TextBox
        Endorse_POM.put("txtBoxMainDwellingSumInsured", "XPATH|//input[@id='mainDwelContentSumInsuredId']");//Main Dwelling Contents sum insured TextBox
        Endorse_POM.put("txtBoxOutbuildingSumInsured", "XPATH|//input[@id='outBuildSumInsuredContentId']");//Outbuilding sum insured TextBox
        Endorse_POM.put("drpDwnFlatContents", "XPATH|//select[@id='flatContent']");//Flat Dropdown
        Endorse_POM.put("drpDwnRegisteredOwnerContents", "XPATH|//select[@id='registeredOwnerContent']");//Registered Owner Dropdown
        Endorse_POM.put("chkBoxWaiveAlarm", "XPATH|//label[normalize-space()='Waive Alarm?']");
        Endorse_POM.put("chkBoxWaiveBurglarBars", "XPATH|//label[normalize-space()='Waive Burglar Bars?']");
        Endorse_POM.put("chkBoxWaiveSecurityGates", "XPATH|//label[normalize-space()='waive security gates ?']");
        Endorse_POM.put("chkBoxInventoryRequired", "XPATH|//label[normalize-space()='Inventory required?']");
        Endorse_POM.put("chkBoxBusinessContents", "XPATH|//label[normalize-space()='Business contents']");
        Endorse_POM.put("txtBoxBusinessContentsFlatExcess", "XPATH|//input[@id='businessContentsFlatExcess']");
        Endorse_POM.put("txtBoxCompulsoryExcessContents", "XPATH|//input[@id='compulsoryExcessContents']");
        Endorse_POM.put("txtBoxContentHaveYouHadUnInterruptedBuildingInsuranceFor", "XPATH|//label[contains(text(),'Have you had uninterrupted household insurance for')]");
        Endorse_POM.put("txtBoxContentNoOfClaimPast12Months", "XPATH|//input[@id='numClaimLosspast12Content']");
        Endorse_POM.put("txtBoxContentNoOfClaimPast13", "XPATH|//input[@id='numClaimlosspass13Content']");
        Endorse_POM.put("txtBoxContentNoOfClaimPast25", "XPATH|//input[@id='numClaimlosspast25Content']");
        Endorse_POM.put("txtBoxContentNotesBuilding", "XPATH|//textarea[@id='notesContent']");

        Endorse_POM.put("chkBoxIsPropertyInHighSecurity", "XPATH|//label[@id='isPropertyInHighSecurityLabel']");//Does the alarm have infra-red detectors? Checkbox
        Endorse_POM.put("chkBoxAreThereHighWalls", "XPATH|//label[@id='areThereHighWallsLabel']");//Does the alarm have infra-red detectors? Checkbox
        Endorse_POM.put("chkBoxRazorWirePerimeterWall", "XPATH|//label[@id='razorWirePerimeterWallLabel']");//Does the alarm have infra-red detectors? Checkbox
        Endorse_POM.put("chkBoxOpenFieldsAroundProperty", "XPATH|//label[@id='openFieldsAroundPropertyLabel']");//Does the alarm have infra-red detectors? Checkbox
        Endorse_POM.put("chkBoxElectronicFencing", "XPATH|//label[@id='electronicFencingLabel']");//Does the alarm have infra-red detectors? Checkbox
        Endorse_POM.put("chkBoxElectronicGate", "XPATH|//label[@id='electronicGateLabel']");//Does the alarm have infra-red detectors? Checkbox
        Endorse_POM.put("chkBoxSecurityOnGate", "XPATH|//label[@id='securityOnGateLabel']");//Does the alarm have infra-red detectors? Checkbox
        Endorse_POM.put("chkBoxSecurityGuardPatrol", "XPATH|//label[@id='securityGuardPatrolLabel']");//Does the alarm have infra-red detectors? Checkbox

        //Building
        Endorse_POM.put("txtBoxYearBuilt", "XPATH|//input[@id='IDITForm@buildingYear']");//Year built TextBox
        //Additional tefth
        Endorse_POM.put("chBoxAdditionalTheft","XPATH|//label[@id='additionalTheftPremiumLabel']");

        //For Verifying for endorsement
        Endorse_POM.put("checkRiskDetails","XPATH|//input[@id='isRiskAddSameAsPhysical'][@title='false']");
        Endorse_POM.put("checkCoverdetails","XPATH|//label[@for='whatDoYouWantToInsure'][@title='What do you want to Insure?']//following::div");
        //First Aid Resources
        Endorse_POM.put("drpDwnYearlyMaintenance", "XPATH|//select[@id='IDITForm@fireExtingMaintenanceVO@id']");//With yearly maintenance Dropdown
        //Standards Match
        Endorse_POM.put("drpDwnElectricalStandards", "XPATH|//select[@id='IDITForm@electricalStandardsFlagVO@id']");//Electrical fixtures meet all standards Dropdown
        Endorse_POM.put("drpDwnHeatingStandards", "XPATH|//select[@id='IDITForm@heatingStandardsFlagVO@id']");//Heating meets all standards Dropdown
        Endorse_POM.put("drpDwnInflammableStandards", "XPATH|//select[@id='IDITForm@inflammableStandardsFlagVO@id']");//Inflammable liquids meet all standards Dropdown
        Endorse_POM.put("drpDwnWoodPlasticStandards", "XPATH|//select[@id='IDITForm@woodPlasticStandardsFlagVO@id']");//Wood or plastic activities meet all standards Dropdown
        Endorse_POM.put("drpDwnStorageStandards", "XPATH|//select[@id='IDITForm@storageStandardsFlagVO@id']");//Storage rooms meet prevention standards Dropdown
        Endorse_POM.put("labelFireAllRiskSpecificData", "XPATH|//div[contains(text(),'Fire all risk specific data')]");//Fire all risk specific data Heading

        Endorse_POM.put("chBoxBank","XPATH|//label[@id='consentToDebitBankAccountLabel']");
        //*** MOTORCAR  LOB   *****

        Endorse_POM.put("labelMotorRiskObjectDetails", "XPATH|//div[contains(text(),'Motor Risk Object Details')]");//Motor Risk Object Details Heading
        //Identifiers
        Endorse_POM.put("labelEngine","XPATH|//tr[@role='row']//td[text()='Engine Number']");//Vehicle ID No/Chassis No Label
        Endorse_POM.put("txtBoxVehicleID", "XPATH|//input[@id='assetIdentifierValueId']");//VehicleID/Chassis No TextBox
        Endorse_POM.put("btnIdentifierUpdate", "XPATH|//button[@id='assetIdentifierVOListTablePanelDivUpdateButton']");//Update Button
        //Risk Address
        Endorse_POM.put("chkBoxIsRiskAddSameAsPhysical", "XPATH|//label[@id='isRiskAddSameAsPhysicalLabel']");//Is the Risk Address Same as the insured Physical Address? Checkbox
        //Work Address
        Endorse_POM.put("chkBoxIsWorkAddSameAsRisk", "XPATH|//label[@id='isWorkAddSameAsRiskLabel']");// Is your work address the same as Risk Address? Checkbox
        Endorse_POM.put("drpDwnWhatToInsure", "XPATH|//select[@id='whatDoYouWantToInsure']");//What do you want to Insure? Dropdown
        //Vehicle General Details
        Endorse_POM.put("drpDwnVehicleParkDuringDay", "XPATH|//select[@id='motorParkABSAVO']");//Where is the vehicle parked during the day? Dropdown
        Endorse_POM.put("drpDwnDayTimeParkingCovered", "XPATH|//select[@id='isTheDayTimeParkingCovered']");//Is the daytime parking covered? Dropdown
        Endorse_POM.put("drpDwnDayTimeParkingLocked", "XPATH|//select[@id='isTheDayTimeParkingLocked']");//Is the daytime parking locked or access controlled? Dropdown
        Endorse_POM.put("drpDwnVehicleParkDuringNight", "XPATH|//select[@id='motorParkNightABSAVO']");//Where is the vehicle parked during the night? Dropdown
        Endorse_POM.put("drpDwnNightTimeParkingCovered", "XPATH|//select[@id='isTheNightTimeParkingCovered']");//Is the night-time parking covered? Dropdown
        Endorse_POM.put("drpDwnNightTimeParkingLocked", "XPATH|//select[@id='isTheNightTimeParkingLocked']");//Is the night-time parking locked or access controlled? Dropdown
        Endorse_POM.put("drpDwnVehicleUsedFor", "XPATH|//select[@id='vehicleUsageVO']");//What will the vehicle be used for? Dropdown
        Endorse_POM.put("drpDwnMake", "XPATH|//select[@id='manufactureVO']");//Make Dropdown
        Endorse_POM.put("drpDwnModelVariant", "XPATH|//select[@id='modelVO']");//Model Variant Dropdown
        Endorse_POM.put("drpDwnYearOfManufacture", "XPATH|//select[@id='yearOfMan']");//Year of Manufacture Dropdown
        Endorse_POM.put("drpDwnInsuredForRetailOrCustom", "XPATH|//select[@id='insuredForRetailOrCustomValue']");//Do you want to be insured for the retail or custom value of the vehicle? Dropdown
        Endorse_POM.put("chkBoxImmobiliser", "XPATH|//label[@id='immobiliserLabel']");//Immobiliser Checkbox
        Endorse_POM.put("drpDwnImmobiliserMake", "XPATH|//select[@id='immobiliserMake']");//Immobiliser Make Dropdown
        Endorse_POM.put("txtBoxInsuranceValue", "XPATH|//input[@id='insuranceValue']");//Insurance Value TextBox
        Endorse_POM.put("chBoxTrackingDevice","XPATH|//label[@id='doYouHaveTrackingdeviceLabel']");
        Endorse_POM.put("txtBoxTrackingDeviceModel","XPATH|//input[@id='trackingDeviceModel']");
        Endorse_POM.put("drpDwnTrackingDeviceMake","XPATH|//select[@id='trackingDeviceMake']");

        Endorse_POM.put("drpMotorcycleFlat","XPATH|//select[@id='motorcycleFlat']");
        Endorse_POM.put("drpFlat","XPATH|//select[@id='flatIdirect']");
        Endorse_POM.put("drpCaravanFlat","XPATH|//select[@id='caravanFlat']");
        Endorse_POM.put("drpBoatFlat","XPATH|//select[@id='boatFlat']");
        Endorse_POM.put("drpElectronicFlat","XPATH|//select[@id='assetCompFlat']");

        //Finance
        Endorse_POM.put("chBoxFinance","XPATH|//label[@id='isVehicleFinancedLabel']");
        Endorse_POM.put("drpDwnFinance","XPATH|//select[@id='financeCompanyName']");
        //Registered Owner Details
        Endorse_POM.put("drpDwnRegisteredOwner", "XPATH|//select[@id='IDITForm@regOwner@id']");//Registered Owner Dropdown
        //Driver Details
        Endorse_POM.put("drpDwnRegularDriver", "XPATH|//select[@id='IDITForm@regDriverABSAVO@id']");//Who is the regular driver? Dropdown
        Endorse_POM.put("drpDwnDriverLicenseType", "XPATH|//select[@id='motorLicense']");//Regular Driver License Type Dropdown
        Endorse_POM.put("drpDwnDrivingCertificate", "XPATH|//select[@id='IDITForm@driveCert@id']");//Defensive driving certificate Dropdown
        //Additional Details
        Endorse_POM.put("chkBoxIsVehicleRegInSouthAfrica", "XPATH|//label[@id='IDITForm@isVehicleRegInSouthAfricaLabel']");//Is the vehicle registered in South Africa? Checkbox

        //Caravan/Trailer General Details
        Endorse_POM.put("drpDwnItemType", "XPATH|//select[@id='itemType']");//Item Type Dropdown
        Endorse_POM.put("chkBoxIsCarvanParkUnderNet", "XPATH|//label[@id='isCarvanParkUnderNetLabel']");//Is the caravan/trailer parked under a hail net or roof when not in use? Checkbox
        Endorse_POM.put("txtBoxMakeModelCaravan", "XPATH|//input[@id='makeModelCaravan']");//Make/Model TextBox
        Endorse_POM.put("txtBoxCaravanInsuredValue", "XPATH|//input[@id='caravanInsuredValue']");//Caravan Insured Value TextBox
        Endorse_POM.put("drpDwnYearOfManufactureCaravan", "XPATH|//select[@id='yearOfManufactureCarvan']");//Caravan Year of Manufacture Dropdown
        Endorse_POM.put("chkBoxRequireCreditShortFall", "XPATH|//label[@id='requireCreditShortFallLabel']");// Do you Require Credit shortfall? Checkbox


        //*** ALL RISK  LOB  *****

        Endorse_POM.put("labelAllRiskDetails", "XPATH|//div[@title='All Risk']");//All Risk Details Heading
        Endorse_POM.put("drpDwnAddressList", "XPATH|//select[@id='addressList']");//Address Dropdown
        Endorse_POM.put("drpDwnRiskToInsure", "XPATH|//select[@id='allRiskType']");//Which Risk do you want to Insure? Dropdown
        Endorse_POM.put("drpDwnSpecifiedAllRiskCover", "XPATH|//select[@id='specAllRiskType']");//Specified All Risk Cover Dropdown
        Endorse_POM.put("txtBoxDescription", "XPATH|//input[@id='description']");//Description TextBox
        Endorse_POM.put("txtBoxSumInsured", "XPATH|//input[@id='sumInsured']");//Sum Insured TextBox


        //*** PERSONAL COMPUTERS  LOB  *****

        Endorse_POM.put("labelPersonalComputer", "XPATH|//div[@title='Personal Computers' or @title='Personal Computer']");//Personal Computer Heading
        Endorse_POM.put("drpDwnComputerType", "XPATH|//select[@id='compTypeABSAVO']");//Type Dropdown
        Endorse_POM.put("txtBoxMake", "XPATH|//input[@id='make']");//Make TextBox
        Endorse_POM.put("txtBoxPersonalComputerSumInsured", "XPATH|//input[@id='personalComputerSumInsured']");//Personal Computer Sum Insured TextBox
        Endorse_POM.put("chkBoxItemForBusinessPurpose", "XPATH|//label[@id='itemForBusinessPurposeLabel']");//Sum Insured TextBox


        //***   Electronic Equipments ****
        Endorse_POM.put("labelElectronic","XPATH|//*[@id='IDITFormId']/div[contains(text(),'Electronic')]");
        Endorse_POM.put("drpDwnAddress","XPATH|//select[@id='addressList']");
        Endorse_POM.put("txtBoxElectronicEquipmentSumInsured","XPATH|//input[@id='electronicEquipSumInsured']");
        Endorse_POM.put("drpDwnFlat","XPATH|//select[@id='assetCompFlat']");
        Endorse_POM.put("drpDwnType","XPATH|//select[@id='compTypeABSAVO']");
        Endorse_POM.put("txtBoxModel","XPATH|//input[@id='model']");
        Endorse_POM.put("txtBoxSerialNumber","XPATH|//input[@id='serialNumber']");
        Endorse_POM.put("txtBoxIMEINumber","XPATH|//input[@id='imeiNumber']");
        //Idirect_POM.put("btnFinish","XPATH|//button[@id='Finish' or @title='Finish']");
        Endorse_POM.put("txtBoxMake","XPATH|//input[@id='make']");
        Endorse_POM.put("electronicsuminusred","XPATH|//input[@id='electronicEquipSumInsured']");


        //***   BOATS  LOB  *****

        //BoatDetails
        Endorse_POM.put("labelBoatDetails", "XPATH|//div[@id='TitleAgentBoatDetailsPanelABSA']");//BoatDetails Heading
        Endorse_POM.put("drpDwnBoatType", "XPATH|//select[@id='IDITForm@boatTypeVO@id']");//Item Type Dropdown
        Endorse_POM.put("drpDwnBoatStoredWhenNotInUse", "XPATH|//select[@id='IDITForm@boatStoredABSAVO@id']");//Where is the watercraft stored when not in use? Dropdown
        Endorse_POM.put("drpDwnBoatUsedFor", "XPATH|//select[@id='IDITForm@boatStoredUseVO@id']");//What will the watercraft be used for? Dropdown
        Endorse_POM.put("drpDwnBoatYearOfManufacture", "XPATH|//select[@id='IDITForm@yearCarvanVO@id']");//Year of Manufacture Dropdown
        Endorse_POM.put("txtBoxBoatMakeModel", "XPATH|//input[@id='IDITForm@makeModel']");//Make/Model TextBox
        Endorse_POM.put("txtBoxBoatDescription", "XPATH|//input[@id='IDITForm@description']");//Description TextBox
        Endorse_POM.put("drpDwnBoatHullCode", "XPATH|//select[@id='IDITForm@hullCodeVO@id']");//Hull Code Dropdown
        Endorse_POM.put("drpDwnBoatSpeed", "XPATH|//select[@id='IDITForm@boatSpeedVO@id']");//Watercraft speed (km/h) Dropdown
        Endorse_POM.put("txtBoxHullSumInsured", "XPATH|//input[@id='hullSumInsured']");//Hull Sum Insured TextBox
        Endorse_POM.put("txtBoxInboardSumInsured", "XPATH|//input[@id='inboardSumInsured']");//Inboard Sum Insured TextBox
        Endorse_POM.put("txtBoxOutboardSumInsured", "XPATH|//input[@id='outboardSumInsured']");//Outboard Sum Insured TextBox

        Endorse_POM.put("chkBoxTerritorialLetterProvided", "XPATH|//label[@id='territorialLetterProvidedLabel']");//Outboard Sum Insured TextBox
        Endorse_POM.put("drpDwnTerritorialCountries", "XPATH|//select[@id='territorialCountries']");//Outboard Sum Insured TextBox
        Endorse_POM.put("LabelTerritorialCountries", "XPATH|//div[@id='s2id_territorialCountries']//span[@id='select2-chosen-6']");//Outboard Sum Insured TextBox
        Endorse_POM.put("txtBoxLetterFromDate", "XPATH|//input[@id='letterFromDate']");//Outboard Sum Insured TextBox
        Endorse_POM.put("txtBoxLetterToDate", "XPATH|//input[@id='letterToDate']");//Outboard Sum Insured TextBox
        Endorse_POM.put("chkBoxIsTheWatercraftFinanced", "XPATH|//label[@id='isTheWatercraftFinancedLabel']");//Outboard Sum Insured TextBox
        Endorse_POM.put("drpDwnFinanceCompany", "XPATH|//select[@id='finCompanyVO']");//Outboard Sum Insured TextBox
        Endorse_POM.put("txtBoxFinanceAgreementNumber", "XPATH|//input[@id='financeAgreementNumber']");//Outboard Sum Insured TextBox
        Endorse_POM.put("chkBoxUninterruptedWatercraft36Mon", "XPATH|//label[@id='uninterruptedWatercraft36MonLabel']");//Outboard Sum Insured TextBox
        Endorse_POM.put("txtBoxLossesInPast12Months", "XPATH|//input[@id='lossesInPast12Months']");//Outboard Sum Insured TextBox
        Endorse_POM.put("txtBoxLossesInPast13To24Mon", "XPATH|//input[@id='lossesInPast13To24Mon']");//Outboard Sum Insured TextBox
        Endorse_POM.put("txtBoxLossesInPast25To36Mon", "XPATH|//input[@id='lossesInPast25To36Mon']");//Outboard Sum Insured TextBox



        //*** PERSONAL ACCIDENT  LOB  *****

        Endorse_POM.put("drpDwnListInsuranceAmount", "XPATH|//select[@id='flattendListflattenedPolicyItems|1@innerVO@insuranceAmountLevelVO@id']");//Insurance Amount Dropdown



        //***********   PAYMENTS DETAILS   ***********

        Endorse_POM.put("drpDwnCollectionMethod", "XPATH|//select[@id='CollectionMethodId']");//Collection Method Dropdown
        Endorse_POM.put("valueDrpDwnCollectionMethod", "XPATH|//div[@id='s2id_CollectionMethodId']/a/span[@id='select2-chosen-2']");//Collection Method Dropdown Value

        Endorse_POM.put("drpDwnPaymentTerms", "XPATH|//select[@id='paymentTermId']");//Payment Terms Dropdown
        Endorse_POM.put("valueDrpDwnPaymentTerms", "XPATH|//div[@id='s2id_paymentTermId']/a/span[@id='select2-chosen-3']");//Payment Terms Dropdown Value

        Endorse_POM.put("drpDwnPreferredDueDay", "XPATH|//select[@id='installmentDueDay']");//Preferred Due Day Dropdown
        Endorse_POM.put("drpDwnDecision", "XPATH|//select[@id='Decision']");//Decision Dropdown
        Endorse_POM.put("chkBoxSanctionScreen", "XPATH|//label[@id='isSanctionScreenCompletedLabel']");//Sanction Screen Checkbox
        Endorse_POM.put("chkBoxRiskProfiling", "XPATH|//label[@id='isRiskProfilingCompletedLabel']");//Risk Profiling Checkbox
        Endorse_POM.put("chkBoxDueDiligence", "XPATH|//label[@id='isDueDiligenceCompletedLabel']");//Due Diligence Checkbox
        Endorse_POM.put("drpDwnPolicyBankAccount", "XPATH|//select[@id='selectedBankAccount']");//Policy Bank Account Dropdown
        Endorse_POM.put("labelMaintainEvent", "XPATH|//div[contains(text(),'Maintain Event')]");//Maintain Event Heading
        Endorse_POM.put("labelUnknownAddressee", "XPATH|//table[@id='idit-grid-table-flattendListdocumentsTreeList_pipe_']//span[contains(text(),'Unknown Addressee')]");//Maintain Event Heading
        Endorse_POM.put("btnDelete", "XPATH|//a[@id='flattendListdocumentsTreeList|Delete']/i");//Delete Button
        Endorse_POM.put("dialogBasicNotification", "XPATH|//div[@id='BasicNotificationDialog']");//Basic Notification Dialog
        Endorse_POM.put("btnDialogOK", "XPATH|//button[@id='DialogOK']");//DialogOK Button
        Endorse_POM.put("dialogPolicyCreation", "XPATH|//div[@class='ConfirmationPageMessageDiv']");//Policy Creation Dialog
        Endorse_POM.put("txtPolicyNumber", "XPATH|//div[@class='ConfirmationPageMessageDiv']/span/h2");//Policy Creation Dialog Text
        Endorse_POM.put("btnViewDocuments", "XPATH|//button[@title='View documents']");//View Documents Button
        Endorse_POM.put("btnOK", "XPATH|//button[@id='Ok']");//OK Button
        Endorse_POM.put("dialogGD1000079", "XPATH|//div[@id='BasicNotificationDialog']");//GD1000079 dialog box

        Endorse_POM.put("labelWelcomeLetterPLSMS", "XPATH|//span[normalize-space()='Welcome Letter PL SMS']");//Maintain Event Heading


        Endorse_POM.put("btnNext", "XPATH|//button[@id='Next']");//Next Button
        Endorse_POM.put("btnFinish", "XPATH|//button[@id='Finish' and @title='Finish']");//Finish Button
        Endorse_POM.put("dBox","XPATH|//div[@class='ConfirmationPageMessageDiv']");
        Endorse_POM.put("PolicyNum","XPATH|//div[@class='ConfirmationPageMessageDiv']/span/h2");
        Endorse_POM.put("btnOk","XPATH|//button[@id='Ok']");

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //VERIFICATION OBJECTS FOR ALL THE COVERS

        //VEHICLES

        Endorse_POM.put("chkValue","XPATH|//select[@value='-1']");


        Endorse_POM.put("verifydrpDwnVehicleUsedFor", "XPATH|//select[@id='vehicleUsageVO'][@value='-1']");//What will the vehicle be used for? Dropdown
        Endorse_POM.put("verifydrpDwnMake", "XPATH|//select[@id='manufactureVO'][@value='-1']");//Make Dropdown
        Endorse_POM.put("verifydrpDwnModelVariant", "XPATH|//select[@id='modelVO'][@value='-1']");//Model Variant Dropdown
        Endorse_POM.put("verifydrpDwnYearOfManufacture", "XPATH|//select[@id='yearOfMan'][@value='-1']");//Year of Manufacture Dropdown
        Endorse_POM.put("verifydrpDwnInsuredForRetailOrCustom", "XPATH|//select[@id='insuredForRetailOrCustomValue'][@value='-1']");//Do you want to be insured for the retail or custom value of the vehicle? Dropdown
        Endorse_POM.put("verifychkBoxImmobiliser", "XPATH|//label[@id='immobiliserLabel'][@title='false']");//Immobiliser Checkbox
        Endorse_POM.put("verifydrpDwnImmobiliserMake", "XPATH|//select[@id='immobiliserMake'][@value='-1']");//Immobiliser Make Dropdown
        //Endorse_POM.put("txtBoxInsuranceValue", "XPATH|//input[@id='insuranceValue']");//Insurance Value TextBox
        Endorse_POM.put("verifychBoxTrackingDevice","XPATH|//label[@id='doYouHaveTrackingdeviceLabel'][@title='false']");
        Endorse_POM.put("txtBoxTrackingDeviceModel","XPATH|//input[@id='trackingDeviceModel']");
        Endorse_POM.put("verifydrpDwnTrackingDeviceMake","XPATH|//select[@id='trackingDeviceMake'][@value='-1'] ");

        Endorse_POM.put("drpMotorcycleFlat","XPATH|//select[@id='motorcycleFlat'][@value='-1']");
        Endorse_POM.put("drpFlat","XPATH|//select[@id='flatIdirect'][@value='-1']");
        Endorse_POM.put("drpCaravanFlat","XPATH|//select[@id='caravanFlat'][@value='-1']");
        Endorse_POM.put("drpBoatFlat","XPATH|//select[@id='boatFlat'][@value='-1']");
        Endorse_POM.put("drpElectronicFlat","XPATH|//select[@id='assetCompFlat'][@value='-1']");

        //Finance
        Endorse_POM.put("chBoxFinance","XPATH|//label[@id='isVehicleFinancedLabel'][@title='false']");
        Endorse_POM.put("drpDwnFinance","XPATH|//select[@id='financeCompanyName'][@value='-1']");
        //Registered Owner Details
        Endorse_POM.put("drpDwnRegisteredOwner", "XPATH|//select[@id='IDITForm@regOwner@id'][@value='-1']");//Registered Owner Dropdown
        //Driver Details
        Endorse_POM.put("drpDwnRegularDriver", "XPATH|//select[@id='IDITForm@regDriverABSAVO@id'][@value='-1']");//Who is the regular driver? Dropdown
        Endorse_POM.put("drpDwnDriverLicenseType", "XPATH|//select[@id='motorLicense'][@value='-1']");//Regular Driver License Type Dropdown
        Endorse_POM.put("drpDwnDrivingCertificate", "XPATH|//select[@id='IDITForm@driveCert@id'][@value='-1']");//Defensive driving certificate Dropdown
        //Additional Details
        Endorse_POM.put("chkBoxIsVehicleRegInSouthAfrica", "XPATH|//label[@id='IDITForm@isVehicleRegInSouthAfricaLabel']");//Is the vehicle registered in South Africa? Checkbox

        //Caravan/Trailer General Details
        Endorse_POM.put("drpDwnItemType", "XPATH|//select[@id='itemType']");//Item Type Dropdown
        Endorse_POM.put("chkBoxIsCarvanParkUnderNet", "XPATH|//label[@id='isCarvanParkUnderNetLabel']");//Is the caravan/trailer parked under a hail net or roof when not in use? Checkbox
        Endorse_POM.put("txtBoxMakeModelCaravan", "XPATH|//input[@id='makeModelCaravan']");//Make/Model TextBox
        Endorse_POM.put("txtBoxCaravanInsuredValue", "XPATH|//input[@id='caravanInsuredValue']");//Caravan Insured Value TextBox
        Endorse_POM.put("drpDwnYearOfManufactureCaravan", "XPATH|//select[@id='yearOfManufactureCarvan']");//Caravan Year of Manufacture Dropdown
        Endorse_POM.put("chkBoxRequireCreditShortFall", "XPATH|//label[@id='requireCreditShortFallLabel']");// Do you Require Credit shortfall? Checkbox

        Endorse_POM.put("","");
        Endorse_POM.put("","");



        //







        WebDr.page_Objects=Endorse_POM;

    }

}
