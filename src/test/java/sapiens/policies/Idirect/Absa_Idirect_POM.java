package sapiens.policies.Idirect;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class Absa_Idirect_POM {


    public static void Idirect_Factory(){


        Map<String, String>Idirect_POM = new HashMap<>();

        Idirect_POM.put("imgHome", "XPATH|//a[@id='MainMenuFind_ImgLink']/div[@class='homeImgDiv']");//Home Image
        Idirect_POM.put("linkRecentContacts", "XPATH|(//div[@id='userRecentContactsListAddInfo|']//li)[1]");//First Recent Contact Link
        Idirect_POM.put("tabContactDashboard", "XPATH|//li[@title='Contact Dashboard' and @aria-controls='DashboardTabContent']");//Contact Dashboard Tab

        //***********   GENERAL DETAILS   ***********

        //General Details
        Idirect_POM.put("linkNewProposal", "XPATH|//a[@id='MainMenuPolicy_Link']");//New Proposal Link
        Idirect_POM.put("labelGeneralDetails", "XPATH|//div[contains(text(),'General Details')]");//General Details Heading
        Idirect_POM.put("drpDwnProductName", "XPATH|//select[@id='Product']");//Product Name Dropdown
        Idirect_POM.put("drpDwnMembership", "XPATH|//select[@id='IDITForm@affinityVO@id']");//Membership Dropdown
        Idirect_POM.put("drpDwnPolicyType", "XPATH|//select[@id='IDITForm@policyPeriodTypeABSAVO@id']");//Policy Type Dropdown
        Idirect_POM.put("drpDwnPolicyRenewal", "XPATH|//select[@id='IDITForm@policyPeriodVO@id']");//Policy Renewal Dropdown

        Idirect_POM.put("chkBoxClientContext", "XPATH|//label[@id='isClientConsentCreditCheckLabel']");
        Idirect_POM.put("txtBoxOldPolicyNumber", "XPATH|//input[@id='IDITForm@migratedPolicyNumber']");//Old Policy Number TextBox
        Idirect_POM.put("txtBoxExternalReferenceNumber", "XPATH|//input[@id='IDITForm@externalReferenceNumber']");//External Reference Number TextBox
        Idirect_POM.put("drpDwnSalesForceOpportunityID", "XPATH|//select[@id='IDITForm@salesForceOpportunity']");//SalesForce Opportunity ID Dropdown
        Idirect_POM.put("drpDwnBranchCode", "XPATH|//select[@id='branchCodeRegion']");//Branch Code Dropdown
        Idirect_POM.put("drpDwnSource", "XPATH|//select[@id='source']");//Source Dropdown
        Idirect_POM.put("txtBoxExternalReferenceName", "XPATH|//input[@id='IDITForm@externalReferenceName']");//External Reference Name
        Idirect_POM.put("txtBoxCaseNbr", "XPATH|//input[@id='IDITForm@caseNbr']");//Case NBR
        Idirect_POM.put("drpDwnStaffIndicator", "XPATH|//select[@id='staffIndicator']");//Staff Indicator Dropdown
        Idirect_POM.put("btnBoxOrigin", "XPATH|//i[@class='fa fa-stack-1x fa-ellipsis-h']");//Origin TextBox
        Idirect_POM.put("btnBoxOriginClick", "XPATH|//table[@id='idit-grid-table-flattendListattnQuestVOtreelist_pipe_']/tbody/tr[4]");//Origin click

        //Sales Transaction Channel
        Idirect_POM.put("drpDwnCurrentSalesChannel", "XPATH|//select[@id='IDITForm@currentChannelVO@id']");//Current Sales Channel Dropdown
        Idirect_POM.put("drpDwnAffinity", "XPATH|//select[@id='IDITForm@affinityVO@id' and @title ='Affinity']"); // Affinity Dropdown

        Idirect_POM.put("drpDwnIntermediary","XPATH|//select[@title='Intermediary Name']");
        Idirect_POM.put("drpDwnIntermediaryAccount","XPATH|//select[@title='Account']");

        //Proposal Questionnaire
        //Absa Idirect
        Idirect_POM.put("drpDwnQuestion1_AbsaIdirect","XPATH|//select[@id='1000051@1000693']");
        Idirect_POM.put("drpDwnQuestion2_AbsaIdirect","XPATH|//select[@id='1000051@1000694']");
        Idirect_POM.put("drpDwnQuestion3_AbsaIdirect","XPATH|//select[@id='1000051@1000695']");
        Idirect_POM.put("drpDwnQuestion4_AbsaIdirect","XPATH|//select[@id='1000051@1000697']");

        //Client Code Validation
        Idirect_POM.put("labelContactDashboard", "XPATH|//li[@title='Contact Dashboard']");//Contact Dashboard Label
        Idirect_POM.put("linkUpdateContact", "XPATH|//a[@id='UpdateContactNewGen_Link']");//Update Contact Link
        Idirect_POM.put("labelPrimaryDetails", "XPATH|//li[@title='Primary details']");//Primary Details Label
        Idirect_POM.put("txtBoxClientCode", "XPATH|//input[@id='clientCode']");//Client Code TextBox


        //***********   Line of Business/Locations/Risk Object   ***********

        Idirect_POM.put("labelLineOfBusiness", "XPATH|//div[@title='Line of Business/Locations/Risk Object']");//Line of Business/Locations/Risk Object Label
        Idirect_POM.put("listLineOfBusiness", "XPATH|//table[@id='idit-grid-table-flattendListflattenedPolicyItems_pipe_']//tbody//child::span");//Dialing Code TextBox
        Idirect_POM.put("btnUpdate", "XPATH|//a[@title='Update']/i");//Update Button
        Idirect_POM.put("labelClauses", "XPATH|//div[@class='Title' and contains(text(),'Clauses')]");//Clauses Heading
        Idirect_POM.put("labelCustomerRiskObjectNumber", "XPATH|//div[contains(text(),'Search by Customer Risk Object Number')]");//Search by Customer Risk Object Number Heading
        Idirect_POM.put("btnAddLocationsRiskObjects", "XPATH|//a[@id='flattendListflattenedPolicyItems|New']/i");//Add Locations/Risk Objects Button
        Idirect_POM.put("labelInsuredGeneralDetails", "XPATH|//div[contains(text(),'Insured general details')]");//Insured general details Heading
        Idirect_POM.put("labelCoverSelection", "XPATH|//div[@title='Cover selection']");//Cover Selection Heading
        Idirect_POM.put("btnEndCoversSelection", "XPATH|//button[@id='Finish' and @title='End covers selection']");//End Covers Selection Button
        Idirect_POM.put("locationsRiskObjectsCount", "XPATH|//table[@id='idit-grid-table-flattendListflattenedPolicyItems_pipe_']//tr");//Locations Risk/Objects Count
        Idirect_POM.put("btnNextCustomerRiskObjectNumber", "XPATH|//button[@id='Finish' and @title='Next']");//Next Button On Customer Risk Object Number Screen
        //VehicleThirdParty
        Idirect_POM.put("chBoxCovers","XPATH|//div[@class='tree-wrap tree-wrap-ltr']");
        Idirect_POM.put("labelThirdParty","XPATH|//span[text()='Third Party']");
        Idirect_POM.put("labelVehicleFire","XPATH|//span[text()='Vehicle Fire']");
        Idirect_POM.put("labelUP","XPATH|//a[@title='Update']");
        Idirect_POM.put("chBoxAccidentalDamagePartialLoss","XPATH|//label[@id='flattendListflattenedPolicyItems|2@isSelectedLabel']");
        Idirect_POM.put("chBoxAccidentalDamageTotalLoss","XPATH|//label[@id='flattendListflattenedPolicyItems|3@isSelectedLabel");
        Idirect_POM.put("chBoxTheftPartialLoss","XPATH|//label[@id='flattendListflattenedPolicyItems|4@isSelectedLabel']");
        Idirect_POM.put("chBoxTheftTotalLoss","XPATH|//label[@id='flattendListflattenedPolicyItems|5@isSelectedLabel']");
        Idirect_POM.put("chBoxWindScreenRepair","XPATH|//label[@id='flattendListflattenedPolicyItems|6@isSelectedLabel']");
        Idirect_POM.put("chBoxWindScreenReplace","XPATH|//label[@id='flattendListflattenedPolicyItems|7@isSelectedLabel']");
        Idirect_POM.put("chBoxHail","XPATH|//label[@id='flattendListflattenedPolicyItems|8@isSelectedLabel']");
        //VehicleThirdParty
        Idirect_POM.put("chBoxThirdParty","XPATH|//label[@id='flattendListflattenedPolicyItems|9@isSelectedLabel']");
        Idirect_POM.put("chBoxForOther","XPATH|//label[@id='flattendListflattenedPolicyItems|10@isSelectedLabel']");
        //VehcileFire
        Idirect_POM.put("chBoxVehicleFire","XPATH|//label[@id='flattendListflattenedPolicyItems|11@isSelectedLabel']");
        Idirect_POM.put("btnFinish&Next","XPATH|//button[@id='Finish'][@title='Next']");



        Idirect_POM.put("","");
        Idirect_POM.put("btnEndRiskDetails", "XPATH|//button[@id='next' and @title='End risk details']");//End Risk Details Button
        Idirect_POM.put("labelPayments", "XPATH|//div[@title='Payments']");//Payments Heading
        Idirect_POM.put("drpDwnUWValidation", "XPATH|(//select[@class='idit-combobox nextStatusSelectClass select2-offscreen'])[1]");//UW 1 selection
        Idirect_POM.put("drpDwnUWValidation2", "XPATH|(//select[@class='idit-combobox nextStatusSelectClass select2-offscreen'])[2]");//UW 2 selection
        Idirect_POM.put("drpDwnUWValidation3", "XPATH|(//select[@class='idit-combobox nextStatusSelectClass select2-offscreen'])[3]");//UW 2 selection
        Idirect_POM.put("labelUWContains", "XPATH|//div[contains(text(),'Underwriting Alerts')]");//Under writing Heading
        Idirect_POM.put("btnUWNext", "XPATH|//button[@id='Next']");//Under writing Next Button
        Idirect_POM.put("labelUWNumberOfDropdown1", "XPATH|(//div[@class='select2-container idit-combobox nextStatusSelectClass'])[1]");//Under writing Heading
        Idirect_POM.put("labelUWNumberOfDropdown2", "XPATH|(//div[@class='select2-container idit-combobox nextStatusSelectClass'])[2]");//Under writing Heading
        Idirect_POM.put("labelUWNumberOfDropdown3", "XPATH|(//div[@class='select2-container idit-combobox nextStatusSelectClass'])[3]");//Under writing Heading
        Idirect_POM.put("txtBoxUserName", "XPATH|//input[@id='UserName']");//TextBox of User Name
        Idirect_POM.put("txtBoxPassword", "XPATH|//input[@id='Password']");//TextBox of Password
        Idirect_POM.put("btnLogin", "XPATH|//button[@class='login-button idit-btn']");//Login Button
        Idirect_POM.put("linkChangePassword", "XPATH|//div[@class='loginChangeForget']");//Change Password Link
        Idirect_POM.put("expectedUserName", "XPATH|//button[@id='userMenuButton']/span[@class='buttonLabel']");//Logged in User Name
        Idirect_POM.put("btnLogOff", "XPATH|//div[@id='mainTopBarRightUserDiv']/ul/li/a[@id='LogOff']");//LogOff Button
        Idirect_POM.put("txtLoginError", "XPATH|//div[@id='login_error']/span[@id='login_error_span']");//Login Error Text
        Idirect_POM.put("imgHome1", "XPATH|//a[@id='MainMenuFind_ImgLink']/div[@class='homeImgDiv']");//Home Image
        Idirect_POM.put("btnUserMenu", "XPATH|//button[@id='userMenuButton']");//User Menu Button on Top Right Corner
        Idirect_POM.put("elmntLogOff", "XPATH|//a[@id='LogOff']");//User Menu Button on Top Right Corner
        Idirect_POM.put("dialogLogOff", "XPATH|//div[@id='BasicNotificationDialog']");//Confirm Logoff dialog box
        Idirect_POM.put("btnOKUw", "XPATH|//button[@id='DialogOK']");//OK button on Confirm Logoff Dialog Box
        Idirect_POM.put("btnCancel", "XPATH|//button[@id='DialogCancel']");//Cancel button on Confirm Logoff Dialog Box
        Idirect_POM.put("labelSessionCount", "XPATH|//span[@class='pagesRectangleText']");//Session Count
        Idirect_POM.put("linkSessionMainMenu", "XPATH|//a[@id='SessionsMainMenu']");//Sessions Main Menu
        Idirect_POM.put("labelCloseAll", "XPATH|//a[@id='pagesCloseAllMainMenu']");//Close All

        Idirect_POM.put("txtVehicleMileage","XPATH|//input[@id='vehicleMileage']");


        //*** PROPERTY  LOB  *****

        //Property Address
        Idirect_POM.put("labelPropertyAddress", "XPATH|//div[@title='Property Address']");//Property Address Heading
        Idirect_POM.put("chkBoxRiskAddressSame", "XPATH|//label[@id='IDITForm@riskAddressSameAsContactLabel']");//Is the Risk Address Same as the Contact Physical Address? Checkbox
        //Property General Details
        Idirect_POM.put("chkBoxBuilding", "XPATH|//label[@id='buildingLabel']");//Building Checkbox
        Idirect_POM.put("chkBoxContents", "XPATH|//label[@id='contentsLabel']");//Contents Checkbox
        Idirect_POM.put("drpDwnBuildingUsedFor", "XPATH|//select[@id='buildingUseVO']");//What will the building be used for? Dropdown
        Idirect_POM.put("drpDwnTypeOfBuilding", "XPATH|//select[@id='buildingTypeVO']");//What type of building is it? Dropdown
        Idirect_POM.put("drpDwnTypeOfArea", "XPATH|//select[@id='areaABSAVO']");//What type of area is the building located in? Dropdown
        Idirect_POM.put("chkBoxIsBuildingOccupied", "XPATH|//label[@id='isBuildingOccupiedLabel']");//Is the building occupied? Checkbox
        Idirect_POM.put("txtBoxOccupiedSinceDate", "XPATH|//input[@id='occupiedSinceDate']");//Occupied Since Date TextBox
        Idirect_POM.put("chkBoxIsPropOccupiedDuringDay", "XPATH|//label[normalize-space()='Is the property occupied during the day?']");
        Idirect_POM.put("txtBoxUnoccupiedDays", "XPATH|//input[@id='noOfConsUnoccupiedDays']");//Number of consecutive unoccupied days TextBox
        Idirect_POM.put("drpDwnWallConstruction", "XPATH|//select[@id='constructionTypeVO']");//Wall construction Dropdown
        Idirect_POM.put("drpDwnRoofConstruction", "XPATH|//select[@id='roofMaterialVO']");//Roof construction Dropdown
        Idirect_POM.put("txtBoxNumberOfOutBuildings", "XPATH|//input[@id='numberOfOutBuildings']");//How Many Out Buildings are there TextBox
        Idirect_POM.put("chkBoxDoes_the_property_border_aXn_residential_property", "XPATH|//label[contains(text(),'Does the property border a non residential propert')]");
        Idirect_POM.put("drpDwnSpecifyNonResidential", "XPATH|//select[@id='propertyTypeVO']");
        Idirect_POM.put("chkBoxIsThereThatched", "XPATH|//label[contains(text(),'Is there a thatched Lapa within 3 meters of the ma')]");//Is there a thatched lapa within 3 meters of main dwelling ?
        Idirect_POM.put("drpDwnThatchedHutFloor", "XPATH|//select[@id='thatcLapaIDirectFloorArea']"); // Thatched Lapa hut floor area
        Idirect_POM.put("chkBoxDoesSizeOfLapa", "XPATH|//label[contains(text(),'Does the Size of Lapa exceed 25% of total surface ')]"); // Does the Size of Lapa exceed 25% of total surface area?
        Idirect_POM.put("chkDoesYouHaveASabsaApprovedLightingConductor", "XPATH|//label[normalize-space()='Do you have a SABS approved lightning conductor?']"); // Does the Size of Lapa exceed 25% of total surface area?
        Idirect_POM.put("chkWaive_Lightning_Conductor", "XPATH|//label[normalize-space()='Waive Lightning Conductor?']");
        Idirect_POM.put("chkIs_the_building_completed", "XPATH|//label[normalize-space()='Is the building completed']");
        Idirect_POM.put("chkHave_you_had_any_burglaries_at_the_property", "XPATH|//label[normalize-space()='Have you had any burglaries at the property?']");
        Idirect_POM.put("chkIs_the_property_in_a_high_security_complex", "XPATH|//label[normalize-space()='Is the property in a high security complex?']");
        Idirect_POM.put("chkAreThereHighWalls", "XPATH|//label[@id='areThereHighWallsLabel']");
        Idirect_POM.put("chkAreThereRazorWireAlongThePerimeterWall", "XPATH|//label[normalize-space()='Are there Razor wire along the perimeter wall']");
        Idirect_POM.put("chkIsThereAnElectronicGate", "XPATH|//label[normalize-space()='Is there an electronic gate?']");
        Idirect_POM.put("chkIsThere24hrsSecurityOrAccessControlOnGates", "XPATH|//label[normalize-space()='Is there 24hr security or access control on gates?']");
        Idirect_POM.put("chkIsThereElectricFencing", "XPATH|//label[normalize-space()='Is there electric fencing?']");
        Idirect_POM.put("chkIsThereA24HrsSecurityGuardPatrol", "XPATH|//label[normalize-space()='Is there a 24-hour security guard patrol?']");
        Idirect_POM.put("chkPropertySurveyRequired", "XPATH|//label[@id='propertySurveyRequiredLabel']");
        Idirect_POM.put("txtBoxDateRiskSurveyRequested", "XPATH|//input[@id='dateRiskSurveyRequested']");
        Idirect_POM.put("txtBoxDateRiskSurveyReceived", "XPATH|//input[@id='dateRiskSurveyReceived']");
        Idirect_POM.put("chkAreThereAnyGasAppliancesOrEquipment", "XPATH|//label[@id='gasAppliancesLabel']");
        Idirect_POM.put("chkAreThereAnyGasPipeConnections", "XPATH|//label[@id='gasPipeConnectionsLabel']");
        Idirect_POM.put("chkIsThereAnyBusinessConductedOnTheProperty","XPATH|//label[@id='businessConductOnPropertyLabel']");
        Idirect_POM.put("chkTypeOfBusinessDescription", "XPATH|//textarea[@id='typeOfBusinessDescription']");
        Idirect_POM.put("txtBoxPlotQuestionnarieRequested", "XPATH|//input[@id='inventoryRequestedDate']");
        Idirect_POM.put("txtBoxplotQuestionnarieRecevied", "XPATH|//input[@id='inventoryReceivedDate']");

        //Building Details
        Idirect_POM.put("txtBoxNoOfGeysers", "XPATH|//input[@id='noOfGeysers']");//Number of geysers in building and out building TextBox
        Idirect_POM.put("txtBoxNoOfSolarGeysers", "XPATH|//input[@id='noOfSolarGeysers']");//How many are solar geysers TextBox
        Idirect_POM.put("drpDwnBondApplicable", "XPATH|//select[@id='bondApplied']");//Is or was there a bond applicable to this house? Dropdown
        Idirect_POM.put("txtBoxSumInsuredMainBuilding", "XPATH|//input[@id='sumInsuredMainBuilding']");//Sum insured of main building TextBox
        Idirect_POM.put("txtBoxSumInsuredOutBuilding", "XPATH|//input[@id='sumInsuredOutBuilding']");//Sum Insured of Outbuildings TextBox
        Idirect_POM.put("drpDwnFlatBuilding", "XPATH|//select[@id='flatBuildingIdirect']");//Flat Building
        Idirect_POM.put("drpDwnFlatContent","XPATH|//select[@id='flatContentsIDirect']");//Flat Content
        Idirect_POM.put("txtClaims12months","XPATH|//input[@id='numClaimLosspast12Content']");//Cotents claims 12 months
        Idirect_POM.put("txtClaims13months","XPATH|//input[@id='numClaimlosspass13Content']");//Contents claims 13 months
        Idirect_POM.put("txtClaims25months","XPATH|//input[@id='numClaimlosspast25Content']");//Contenst claims 25 months
        Idirect_POM.put("drpDwnRegisteredOwnerBuilding", "XPATH|//select[@id='regOwner']");//Registered Owner Dropdown
        Idirect_POM.put("labelPropertyAdditionalDetails", "XPATH|//div[contains(text(),'Property Additional Details')]  ");//Property Additional Details Heading
        Idirect_POM.put("labelPropertyTechnicalReport", "XPATH|//div[contains(text(),'Property Technical Report')]");//Property Technical Details Heading
        Idirect_POM.put("chkAreYouOffTheEskom/CityPowerGrid", "XPATH|//label[normalize-space()='Are you off the Eskom/City Power Grid']");
        Idirect_POM.put("chkDoYouHaveAGenerator", "XPATH|//label[normalize-space()='Do you have a generator']");
        Idirect_POM.put("chkIsGeneratorConnectedToPowerBackup", "XPATH|//label[normalize-space()='Is a generator connected to the Power Box?']");
        Idirect_POM.put("txtBoxDateCertificateRequested", "XPATH|//input[@id='dateCertificateRequested']");
        Idirect_POM.put("txtBoxDateCertificateReceived", "XPATH|//input[@id='dateCertificateReceived']");
        Idirect_POM.put("drpDwnCoverType", "XPATH|//select[@id='coverageTypeAbSAVO']");
        Idirect_POM.put("txtBoxCompulsoryExcess", "XPATH|//input[@id='compulsoryExcess']");
        Idirect_POM.put("txtBoxHaveYouHadUnInterruptedBuildingInsuranceFor", "XPATH|//label[contains(text(),'Have you had uninterrupted building insurance for ')]");
        Idirect_POM.put("txtBoxNoOfClaimPast12Months", "XPATH|//input[@id='noOfClaimPast12Months']");
        Idirect_POM.put("txtBoxNoOfClaimPast13To24Months", "XPATH|//input[@id='noOfClaimPast13To24Months']");
        Idirect_POM.put("txtBoxNoOfClaimPast25To36Months", "XPATH|//input[@id='noOfClaimPast25To36Months']");
        Idirect_POM.put("txtBoxNotesBuilding", "XPATH|//textarea[@id='notes']");

        //House Content Details
        Idirect_POM.put("drpDwnAlarmInstalled", "XPATH|//select[@id='alarmInstalledVO']");//Do you have an alarm installed? Dropdown
        Idirect_POM.put("chkBoxAlarmProfessionallyInstalled", "XPATH|//label[@id='alarmProfessionallyInstalledLabel']");//Was the alarm professionally installed? Checkbox
        Idirect_POM.put("chkBoxAlarmInfraRedDetectors", "XPATH|//label[@id='alarmInfraRedDetectorsLabel']");//Does the alarm have infra-red detectors? Checkbox
        Idirect_POM.put("chkBoxAlarmWorkingOrder", "XPATH|//label[@id='alarmWorkingOrderLabel']");//Is the alarm in working order? Checkbox
        Idirect_POM.put("drpDwnBurglarBarsMainDwelling", "XPATH|//select[@id='burglarBarsVO']");//Are there burglar bars installed to the main dwelling? Dropdown
        Idirect_POM.put("drpDwnExternalDoorMainDwelling", "XPATH|//select[@id='externalDoorSecurityMainDwellingVO']");//Are there external door security gates to the main dwelling? Dropdown
        Idirect_POM.put("drpDwnBurglarBarsOutbuilding", "XPATH|//select[@id='IDITForm@burglarbarsOutbuildingCon']");//Are there burglar bars installed to outbuilding ? Dropdown
        Idirect_POM.put("drpDwnExternalDoorOutbuilding", "XPATH|//select[@id='IDITForm@externaldoorsecurOutbuilding']");//Are there external door security gates to the outbuilding ? Dropdown
        Idirect_POM.put("txtBoxInventoryRequestedDate", "XPATH|//input[@id='inventoryRequestedDate']");//Inventory Requested Date TextBox
        Idirect_POM.put("txtBoxInventoryReceivedDate", "XPATH|//input[@id='inventoryReceivedDate']");//Inventory Received Date TextBox
        Idirect_POM.put("txtBoxMainDwellingSumInsured", "XPATH|//input[@id='mainDwelContentSumInsuredId']");//Main Dwelling Contents sum insured TextBox
        Idirect_POM.put("txtBoxOutbuildingSumInsured", "XPATH|//input[@id='outBuildSumInsuredContentId']");//Outbuilding sum insured TextBox
        Idirect_POM.put("drpDwnFlatContents", "XPATH|//select[@id='flatContentsIDirect']");//Flat Dropdown
        Idirect_POM.put("drpDwnRegisteredOwnerContents", "XPATH|//select[@id='registeredOwnerContent']");//Registered Owner Dropdown
        Idirect_POM.put("chkBoxWaiveAlarm", "XPATH|//label[@id='waiveAlarmLabel']");
        Idirect_POM.put("chkBoxWaiveBurglarBars", "XPATH|//label[@id='waiveBurglarBarsLabel']");
        Idirect_POM.put("chkBoxWaiveSecurityGates", "XPATH|//label[@id='waiveSecurityGateLabel']");
        Idirect_POM.put("chkBoxInventoryRequired", "XPATH|//label[@id='inventoryRequiredLabel']");
        Idirect_POM.put("chkBoxBusinessContents", "XPATH|//label[@id='businessContentsLabel']");
        Idirect_POM.put("txtBoxBusinessContentsFlatExcess", "XPATH|//input[@id='businessContentsFlatExcess']");
        Idirect_POM.put("txtBoxCompulsoryExcessContents", "XPATH|//input[@id='compulsoryExcessContents']");
        Idirect_POM.put("txtBoxContentHaveYouHadUnInterruptedBuildingInsuranceFor", "XPATH|//label[contains(text(),'Have you had uninterrupted household insurance for')]");
        Idirect_POM.put("txtBoxContentNoOfClaimPast12Months", "XPATH|//input[@id='numClaimLosspast12Content']");
        Idirect_POM.put("txtBoxContentNoOfClaimPast13", "XPATH|//input[@id='numClaimlosspass13Content']");
        Idirect_POM.put("txtBoxContentNoOfClaimPast25", "XPATH|//input[@id='numClaimlosspast25Content']");
        Idirect_POM.put("txtBoxContentNotesBuilding", "XPATH|//textarea[@id='notesContent']");

        Idirect_POM.put("chkBoxIsPropertyInHighSecurity", "XPATH|//label[@id='isPropertyInHighSecurityLabel']");//Does the alarm have infra-red detectors? Checkbox
        Idirect_POM.put("chkBoxAreThereHighWalls", "XPATH|//label[@id='areThereHighWallsLabel']");//Does the alarm have infra-red detectors? Checkbox
        Idirect_POM.put("chkBoxRazorWirePerimeterWall", "XPATH|//label[@id='razorWirePerimeterWallLabel']");//Does the alarm have infra-red detectors? Checkbox
        Idirect_POM.put("chkBoxOpenFieldsAroundProperty", "XPATH|//label[@id='openFieldsAroundPropertyLabel']");//Does the alarm have infra-red detectors? Checkbox
        Idirect_POM.put("chkBoxElectronicFencing", "XPATH|//label[@id='electronicFencingLabel']");//Does the alarm have infra-red detectors? Checkbox
        Idirect_POM.put("chkBoxElectronicGate", "XPATH|//label[@id='electronicGateLabel']");//Does the alarm have infra-red detectors? Checkbox
        Idirect_POM.put("chkBoxSecurityOnGate", "XPATH|//label[@id='securityOnGateLabel']");//Does the alarm have infra-red detectors? Checkbox
        Idirect_POM.put("chkBoxSecurityGuardPatrol", "XPATH|//label[@id='securityGuardPatrolLabel']");//Does the alarm have infra-red detectors? Checkbox

        //Building
        Idirect_POM.put("txtBoxYearBuilt", "XPATH|//input[@id='IDITForm@buildingYear']");//Year built TextBox
        //Additional tefth
        Idirect_POM.put("chBoxAdditionalTheft","XPATH|//label[@id='additionalTheftPremiumLabel']");
        Idirect_POM.put("","");
        //First Aid Resources
        Idirect_POM.put("drpDwnYearlyMaintenance", "XPATH|//select[@id='IDITForm@fireExtingMaintenanceVO@id']");//With yearly maintenance Dropdown
        //Standards Match
        Idirect_POM.put("drpDwnElectricalStandards", "XPATH|//select[@id='IDITForm@electricalStandardsFlagVO@id']");//Electrical fixtures meet all standards Dropdown
        Idirect_POM.put("drpDwnHeatingStandards", "XPATH|//select[@id='IDITForm@heatingStandardsFlagVO@id']");//Heating meets all standards Dropdown
        Idirect_POM.put("drpDwnInflammableStandards", "XPATH|//select[@id='IDITForm@inflammableStandardsFlagVO@id']");//Inflammable liquids meet all standards Dropdown
        Idirect_POM.put("drpDwnWoodPlasticStandards", "XPATH|//select[@id='IDITForm@woodPlasticStandardsFlagVO@id']");//Wood or plastic activities meet all standards Dropdown
        Idirect_POM.put("drpDwnStorageStandards", "XPATH|//select[@id='IDITForm@storageStandardsFlagVO@id']");//Storage rooms meet prevention standards Dropdown
        Idirect_POM.put("labelFireAllRiskSpecificData", "XPATH|//div[contains(text(),'Fire all risk specific data')]");//Fire all risk specific data Heading

        Idirect_POM.put("chBoxBank","XPATH|//label[@id='consentToDebitBankAccountLabel']");
        //*** MOTORCAR  LOB   *****

        Idirect_POM.put("labelMotorRiskObjectDetails", "XPATH|//div[contains(text(),'Motor Risk Object Details')]");//Motor Risk Object Details Heading
        //Identifiers
        Idirect_POM.put("labelEngine","XPATH|//tr[@role='row']//td[text()='Engine Number']");//Vehicle ID No/Chassis No Label
        Idirect_POM.put("txtBoxVehicleID", "XPATH|//input[@id='assetIdentifierValueId']");//VehicleID/Chassis No TextBox
        Idirect_POM.put("btnIdentifierUpdate", "XPATH|//button[@id='assetIdentifierVOListTablePanelDivUpdateButton']");//Update Button
        //Risk Address
        Idirect_POM.put("chkBoxIsRiskAddSameAsPhysical", "XPATH|//label[@id='isRiskAddSameAsPhysicalLabel']");//Is the Risk Address Same as the insured Physical Address? Checkbox
        //Work Address
        Idirect_POM.put("chkBoxIsWorkAddSameAsRisk", "XPATH|//label[@id='isWorkAddSameAsRiskLabel']");// Is your work address the same as Risk Address? Checkbox
        Idirect_POM.put("drpDwnWhatToInsure", "XPATH|//select[@id='whatDoYouWantToInsure']");//What do you want to Insure? Dropdown
        //Vehicle General Details
        Idirect_POM.put("drpDwnVehicleParkDuringDay", "XPATH|//select[@id='motorParkABSAVO']");//Where is the vehicle parked during the day? Dropdown
        Idirect_POM.put("drpDwnDayTimeParkingCovered", "XPATH|//select[@id='isTheDayTimeParkingCovered']");//Is the daytime parking covered? Dropdown
        Idirect_POM.put("drpDwnDayTimeParkingLocked", "XPATH|//select[@id='isTheDayTimeParkingLocked']");//Is the daytime parking locked or access controlled? Dropdown
        Idirect_POM.put("drpDwnVehicleParkDuringNight", "XPATH|//select[@id='motorParkNightABSAVO']");//Where is the vehicle parked during the night? Dropdown
        Idirect_POM.put("drpDwnNightTimeParkingCovered", "XPATH|//select[@id='isTheNightTimeParkingCovered']");//Is the night-time parking covered? Dropdown
        Idirect_POM.put("drpDwnNightTimeParkingLocked", "XPATH|//select[@id='isTheNightTimeParkingLocked']");//Is the night-time parking locked or access controlled? Dropdown
        Idirect_POM.put("drpDwnVehicleUsedFor", "XPATH|//select[@id='vehicleUsageVO']");//What will the vehicle be used for? Dropdown
        Idirect_POM.put("drpDwnMake", "XPATH|//select[@id='manufactureVO']");//Make Dropdown
        Idirect_POM.put("drpDwnModelVariant", "XPATH|//select[@id='modelVO']");//Model Variant Dropdown
        Idirect_POM.put("drpDwnYearOfManufacture", "XPATH|//select[@id='yearOfMan']");//Year of Manufacture Dropdown
        Idirect_POM.put("drpDwnInsuredForRetailOrCustom", "XPATH|//select[@id='insuredForRetailOrCustomValue']");//Do you want to be insured for the retail or custom value of the vehicle? Dropdown
        Idirect_POM.put("chkBoxImmobiliser", "XPATH|//label[@id='immobiliserLabel']");//Immobiliser Checkbox
        Idirect_POM.put("drpDwnImmobiliserMake", "XPATH|//select[@id='immobiliserMake']");//Immobiliser Make Dropdown
        Idirect_POM.put("txtBoxInsuranceValue", "XPATH|//input[@id='insuranceValue']");//Insurance Value TextBox
        Idirect_POM.put("chBoxTrackingDevice","XPATH|//label[@id='doYouHaveTrackingdeviceLabel']");
        Idirect_POM.put("txtBoxTrackingDeviceModel","XPATH|//input[@id='trackingDeviceModel']");
        Idirect_POM.put("drpDwnTrackingDeviceMake","XPATH|//select[@id='trackingDeviceMake']");

        Idirect_POM.put("chBoxPreInspectionReport","XPATH|//label[contains(@id,'preInspectionReportRequiredLabel')]");
        Idirect_POM.put("chBoxPreInspectionReportReceived","XPATH|//label[contains(@id,'preInspectionReportReceived')]");
        Idirect_POM.put("txtPreInspectionDate","XPATH|//input[@title='Pre-inspection report date']");

        Idirect_POM.put("drpMotorcycleFlat","XPATH|//select[@id='motorcycleFlat']");
        Idirect_POM.put("drpFlat","XPATH|//select[@id='flatIdirect']");
        Idirect_POM.put("drpCaravanFlat","XPATH|//select[@id='caravanFlat']");
        Idirect_POM.put("drpBoatFlat","XPATH|//select[@id='boatFlat']");
        Idirect_POM.put("drpElectronicFlat","XPATH|//select[@id='assetCompFlat']");

        //Finance
        Idirect_POM.put("chBoxFinance","XPATH|//label[@id='isVehicleFinancedLabel']");
        Idirect_POM.put("drpDwnFinance","XPATH|//select[@id='financeCompanyName']");
        //Registered Owner Details
        Idirect_POM.put("drpDwnRegisteredOwner", "XPATH|//select[@id='IDITForm@regOwner@id']");//Registered Owner Dropdown
        //Driver Details
        Idirect_POM.put("drpDwnRegularDriver", "XPATH|//select[@id='IDITForm@regDriverABSAVO@id']");//Who is the regular driver? Dropdown
        Idirect_POM.put("drpDwnDriverLicenseType", "XPATH|//select[@id='motorLicense']");//Regular Driver License Type Dropdown
        Idirect_POM.put("drpDwnDrivingCertificate", "XPATH|//select[@id='IDITForm@driveCert@id']");//Defensive driving certificate Dropdown
        //Additional Details
        Idirect_POM.put("chkBoxIsVehicleRegInSouthAfrica", "XPATH|//label[@id='IDITForm@isVehicleRegInSouthAfricaLabel']");//Is the vehicle registered in South Africa? Checkbox

        //Caravan/Trailer General Details
        Idirect_POM.put("drpDwnItemType", "XPATH|//select[@id='itemType']");//Item Type Dropdown
        Idirect_POM.put("chkBoxIsCarvanParkUnderNet", "XPATH|//label[@id='isCarvanParkUnderNetLabel']");//Is the caravan/trailer parked under a hail net or roof when not in use? Checkbox
        Idirect_POM.put("txtBoxMakeModelCaravan", "XPATH|//input[@id='makeModelCaravan']");//Make/Model TextBox
        Idirect_POM.put("txtBoxCaravanInsuredValue", "XPATH|//input[@id='caravanInsuredValue']");//Caravan Insured Value TextBox
        Idirect_POM.put("drpDwnYearOfManufactureCaravan", "XPATH|//select[@id='yearOfManufactureCarvan']");//Caravan Year of Manufacture Dropdown
        Idirect_POM.put("chkBoxRequireCreditShortFall", "XPATH|//label[@id='requireCreditShortFallLabel']");// Do you Require Credit shortfall? Checkbox

        Idirect_POM.put("txt12Days","XPATH|(//*[@for='numberOfClaimsPastYear']//following::input)[1]");
        Idirect_POM.put("txt13to24Days","XPATH|(//*[@for='noOfClaimsPastThirteen']//following::input)[1]");
        Idirect_POM.put("txt25to36Days","XPATH|(//*[@for='noOfClaimPastTwentyFive']//following::input)[1]");

        //*** ALL RISK  LOB  *****

        Idirect_POM.put("labelAllRiskDetails", "XPATH|//div[@title='All Risk']");//All Risk Details Heading
        Idirect_POM.put("drpDwnAddressList", "XPATH|//select[@id='addressList']");//Address Dropdown
        Idirect_POM.put("drpDwnRiskToInsure", "XPATH|//select[@id='allRiskType']");//Which Risk do you want to Insure? Dropdown
        Idirect_POM.put("drpDwnSpecifiedAllRiskCover", "XPATH|//select[@id='specAllRiskType']");//Specified All Risk Cover Dropdown
        Idirect_POM.put("txtBoxDescription", "XPATH|//input[@id='description']");//Description TextBox
        Idirect_POM.put("txtBoxSumInsured", "XPATH|//input[@id='sumInsured']");//Sum Insured TextBox
        Idirect_POM.put("drpDwnUnSpecifiedAllRiskCover","XPATH|//select[@id='unspecAllRiskType']");


        //*** PERSONAL COMPUTERS  LOB  *****

        Idirect_POM.put("labelPersonalComputer", "XPATH|//div[@title='Personal Computers' or @title='Personal Computer']");//Personal Computer Heading
        Idirect_POM.put("drpDwnComputerType", "XPATH|//select[@id='compTypeABSAVO']");//Type Dropdown
        Idirect_POM.put("txtBoxMake", "XPATH|//input[@id='make']");//Make TextBox
        Idirect_POM.put("txtBoxPersonalComputerSumInsured", "XPATH|//input[@id='personalComputerSumInsured']");//Personal Computer Sum Insured TextBox
        Idirect_POM.put("chkBoxItemForBusinessPurpose", "XPATH|//label[@id='itemForBusinessPurposeLabel']");//Sum Insured TextBox


        //***   Electronic Equipments ****
        Idirect_POM.put("labelElectronic","XPATH|//*[@id='IDITFormId']/div[contains(text(),'Electronic')]");
        Idirect_POM.put("drpDwnAddress","XPATH|//select[@id='addressList']");
        Idirect_POM.put("txtBoxElectronicEquipmentSumInsured","XPATH|//input[@id='electronicEquipSumInsured']");
        Idirect_POM.put("drpDwnFlat","XPATH|//select[@id='assetCompFlat']");
        Idirect_POM.put("drpDwnType","XPATH|//select[@id='compTypeABSAVO']");
        Idirect_POM.put("txtBoxModel","XPATH|//input[@id='model']");
        Idirect_POM.put("txtBoxSerialNumber","XPATH|//input[@id='serialNumber']");
        Idirect_POM.put("txtBoxIMEINumber","XPATH|//input[@id='imeiNumber']");
        //Idirect_POM.put("btnFinish","XPATH|//button[@id='Finish' or @title='Finish']");
        Idirect_POM.put("txtBoxMake","XPATH|//input[@id='make']");
        Idirect_POM.put("electronicsuminusred","XPATH|//input[@id='electronicEquipSumInsured']");


        //***   BOATS  LOB  *****

        //BoatDetails
        Idirect_POM.put("labelBoatDetails", "XPATH|//div[@id='TitleAgentBoatDetailsPanelABSA']");//BoatDetails Heading
        Idirect_POM.put("drpDwnBoatType", "XPATH|//select[@id='IDITForm@boatTypeVO@id']");//Item Type Dropdown
        Idirect_POM.put("drpDwnBoatStoredWhenNotInUse", "XPATH|//select[@id='IDITForm@boatStoredABSAVO@id']");//Where is the watercraft stored when not in use? Dropdown
        Idirect_POM.put("drpDwnBoatUsedFor", "XPATH|//select[@id='IDITForm@boatStoredUseVO@id']");//What will the watercraft be used for? Dropdown
        Idirect_POM.put("drpDwnBoatYearOfManufacture", "XPATH|//select[@id='IDITForm@yearCarvanVO@id']");//Year of Manufacture Dropdown
        Idirect_POM.put("txtBoxBoatMakeModel", "XPATH|//input[@id='IDITForm@makeModel']");//Make/Model TextBox
        Idirect_POM.put("txtBoxBoatDescription", "XPATH|//input[@id='IDITForm@description']");//Description TextBox
        Idirect_POM.put("drpDwnBoatHullCode", "XPATH|//select[@id='IDITForm@hullCodeVO@id']");//Hull Code Dropdown
        Idirect_POM.put("drpDwnBoatSpeed", "XPATH|//select[@id='IDITForm@boatSpeedVO@id']");//Watercraft speed (km/h) Dropdown
        Idirect_POM.put("txtBoxHullSumInsured", "XPATH|//input[@id='hullSumInsured']");//Hull Sum Insured TextBox
        Idirect_POM.put("txtBoxInboardSumInsured", "XPATH|//input[@id='inboardSumInsured']");//Inboard Sum Insured TextBox
        Idirect_POM.put("txtBoxOutboardSumInsured", "XPATH|//input[@id='outboardSumInsured']");//Outboard Sum Insured TextBox

        Idirect_POM.put("chkBoxTerritorialLetterProvided", "XPATH|//label[@id='territorialLetterProvidedLabel']");//Outboard Sum Insured TextBox
        Idirect_POM.put("drpDwnTerritorialCountries", "XPATH|//select[@id='territorialCountries']");//Outboard Sum Insured TextBox
        Idirect_POM.put("LabelTerritorialCountries", "XPATH|//div[@id='s2id_territorialCountries']//span[@id='select2-chosen-6']");//Outboard Sum Insured TextBox
        Idirect_POM.put("txtBoxLetterFromDate", "XPATH|//input[@id='letterFromDate']");//Outboard Sum Insured TextBox
        Idirect_POM.put("txtBoxLetterToDate", "XPATH|//input[@id='letterToDate']");//Outboard Sum Insured TextBox
        Idirect_POM.put("chkBoxIsTheWatercraftFinanced", "XPATH|//label[@id='isTheWatercraftFinancedLabel']");//Outboard Sum Insured TextBox
        Idirect_POM.put("drpDwnFinanceCompany", "XPATH|//select[@id='finCompanyVO']");//Outboard Sum Insured TextBox
        Idirect_POM.put("txtBoxFinanceAgreementNumber", "XPATH|//input[@id='financeAgreementNumber']");//Outboard Sum Insured TextBox
        Idirect_POM.put("chkBoxUninterruptedWatercraft36Mon", "XPATH|//label[@id='uninterruptedWatercraft36MonLabel']");//Outboard Sum Insured TextBox
        Idirect_POM.put("txtBoxLossesInPast12Months", "XPATH|//input[@id='lossesInPast12Months']");//Outboard Sum Insured TextBox
        Idirect_POM.put("txtBoxLossesInPast13To24Mon", "XPATH|//input[@id='lossesInPast13To24Mon']");//Outboard Sum Insured TextBox
        Idirect_POM.put("txtBoxLossesInPast25To36Mon", "XPATH|//input[@id='lossesInPast25To36Mon']");//Outboard Sum Insured TextBox



        //*** PERSONAL ACCIDENT  LOB  *****

        Idirect_POM.put("drpDwnListInsuranceAmount", "XPATH|//select[@id='flattendListflattenedPolicyItems|1@innerVO@insuranceAmountLevelVO@id']");//Insurance Amount Dropdown



        //***********   PAYMENTS DETAILS   ***********

        Idirect_POM.put("drpDwnCollectionMethod", "XPATH|//select[@id='CollectionMethodId']");//Collection Method Dropdown
        Idirect_POM.put("valueDrpDwnCollectionMethod", "XPATH|//div[@id='s2id_CollectionMethodId']/a/span[@id='select2-chosen-2']");//Collection Method Dropdown Value

        Idirect_POM.put("drpDwnPaymentTerms", "XPATH|//select[@id='paymentTermId']");//Payment Terms Dropdown
        Idirect_POM.put("valueDrpDwnPaymentTerms", "XPATH|//div[@id='s2id_paymentTermId']/a/span[@id='select2-chosen-3']");//Payment Terms Dropdown Value

        Idirect_POM.put("drpDwnPreferredDueDay", "XPATH|//select[@id='installmentDueDay']");//Preferred Due Day Dropdown
        Idirect_POM.put("drpDwnDecision", "XPATH|//select[@id='Decision']");//Decision Dropdown
        Idirect_POM.put("drpDwnReason","XPATH|//select[@id='Reason']");//Reason DropDown
        Idirect_POM.put("chkBoxSanctionScreen", "XPATH|//label[@id='isSanctionScreenCompletedLabel']");//Sanction Screen Checkbox
        Idirect_POM.put("chkBoxRiskProfiling", "XPATH|//label[@id='isRiskProfilingCompletedLabel']");//Risk Profiling Checkbox
        Idirect_POM.put("chkBoxDueDiligence", "XPATH|//label[@id='isDueDiligenceCompletedLabel']");//Due Diligence Checkbox
        Idirect_POM.put("drpDwnPolicyBankAccount", "XPATH|//select[@id='selectedBankAccount']");//Policy Bank Account Dropdown
        Idirect_POM.put("labelMaintainEvent", "XPATH|//div[contains(text(),'Maintain Event')]");//Maintain Event Heading
        Idirect_POM.put("labelUnknownAddressee", "XPATH|//table[@id='idit-grid-table-flattendListdocumentsTreeList_pipe_']//span[contains(text(),'Unknown Addressee')]");//Maintain Event Heading
        Idirect_POM.put("btnDelete", "XPATH|//a[@id='flattendListdocumentsTreeList|Delete']/i");//Delete Button
        Idirect_POM.put("dialogBasicNotification", "XPATH|//div[@id='BasicNotificationDialog']");//Basic Notification Dialog
        Idirect_POM.put("btnDialogOK", "XPATH|//button[@id='DialogOK']");//DialogOK Button
        Idirect_POM.put("dialogPolicyCreation", "XPATH|//div[@class='ConfirmationPageMessageDiv']");//Policy Creation Dialog
        Idirect_POM.put("txtPolicyNumber", "XPATH|//div[@class='ConfirmationPageMessageDiv']/span/h2");//Policy Creation Dialog Text
        Idirect_POM.put("btnViewDocuments", "XPATH|//button[@title='View documents']");//View Documents Button
        Idirect_POM.put("btnOK", "XPATH|//button[@id='Ok']");//OK Button
        Idirect_POM.put("dialogGD1000079", "XPATH|//div[@id='BasicNotificationDialog']");//GD1000079 dialog box

        Idirect_POM.put("noti","XPATH|//div[contains(text(),' Sanction Screening/ Risk Profiling is failed or Sanction Screening status may be as Match.')]");
        Idirect_POM.put("notiOk","XPATH|//button[@id='DialogOK']");
        Idirect_POM.put("labelWelcomeLetterPLSMS", "XPATH|//span[normalize-space()='Welcome Letter PL SMS']");//Maintain Event Heading


        Idirect_POM.put("btnNext", "XPATH|//button[@id='Next']");//Next Button
        Idirect_POM.put("btnFinish", "XPATH|//button[@id='Finish' and @title='Finish']");//Finish Button
        Idirect_POM.put("dBox","XPATH|//div[@class='ConfirmationPageMessageDiv']");
        Idirect_POM.put("PolicyNum","XPATH|//div[@class='ConfirmationPageMessageDiv']/span/h2");
        Idirect_POM.put("btnOk","XPATH|//button[@id='Ok']");

        //Preprod For clone proposal
        Idirect_POM.put("btnCloneProposal","XPATH|//a[contains(text(),'Clone Proposal')]");
        //Use btnNext to click next
        //Use btnEndRiskDetails to click next
        //Underwriting alerts
        // btnNext
        //Finsih btnFinish

        //Update Proposal
        Idirect_POM.put("btnUpdateProposal","XPATH|//a[contains(text(),'Update proposal')]");
        Idirect_POM.put("","");

        Idirect_POM.put("","");
        Idirect_POM.put("","");



        //








        WebDr.page_Objects=Idirect_POM;



    }

}
