package sapiens.policies.Idirect;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import utility.WebDr;

import static org.slf4j.LoggerFactory.getLogger;

public class Absa_Idirect extends WebDr {
    private static final Logger logger = getLogger(Absa_Idirect.class);

    public Absa_Idirect(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }

    String productType = getValue("Product_Type");
    String policyType = getValue("Policy_Type");
    String branchCode = getValue("Branch_Code");
    String source = getValue("Source");
    String currentSalesChannel = getValue("CurrentSalesChannel");
    String question1 = getValue("Question_1");
    String question2 = getValue("Question_2");
    String question3 = getValue("Question_3");
    String question4 = getValue("Question_4");


    String insuranceAmount = getValue("Insurance_Amount");
    String collectionMethod = getValue("Collection_Method");
    String paymentTerms = getValue("Payment_Terms");
    String preferredDueDay = getValue("Preferred_DueDay");
    String decision = getValue("Decision");
    String policyBankAccount = getValue("Policy_BankAccount");
    String buildingUsedFor = getValue("Building_UsedFor");
    String typeOfBuilding = getValue("Type_Of_Building");
    String typeOfArea = getValue("Type_Of_Area");
    String unOccupiedDays = getValue("Unoccupied_Days");
    String wallConstruction = getValue("Wall_Construction");
    String roofConstruction = getValue("Roof_Construction");
    String numberOfOutBuildings = getValue("NumberOfOutBuildings");
    String geysers = getValue("Geysers");
    String solarGeysers = getValue("Solar_Geysers");
    String bondApplicable = getValue("Bond_Applicable");
    String sumInsuredMainBuilding = getValue("SumInsuredMainBuilding");
    String sumInsuredOutBuilding = getValue("SumInsuredOutBuilding");
    String flat = getValue("Flat");
    String registeredOwner = getValue("Registered_Owner");
    String insure = getValue("Insure");
    String alarmInstalled = getValue("Alarm_Installed");
    String burglarBarsMainDwelling = getValue("BurglarBarsMainDwelling");
    String externalDoorMainDwelling = getValue("ExternalDoorMainDwelling");
    String burglarBarsOutbuilding = getValue("BurglarBarsOutbuilding");
    String externalDoorOutbuilding = getValue("ExternalDoorOutbuilding");
    String vehicleID = getValue("Vehicle_ID");
    String vehicleParkDuringDay = getValue("VehicleParkDuringDay");
    String dayTimeParkingCovered = getValue("DayTimeParkingCovered");
    String dayTimeParkingLocked = getValue("DayTimeParkingLocked");
    String vehicleParkDuringNight = getValue("VehicleParkDuringNight");
    String nightTimeParkingCovered = getValue("NightTimeParkingCovered");
    String nightTimeParkingLocked = getValue("NightTimeParkingLocked");
    String vehicleUsedFor = getValue("VehicleUsedFor");
    String motorFinance = getValue("MotorFinance");
    String make = getValue("Make");
    String modelVariant = getValue("Model_Variant");
    String yearOfManufacture = getValue("YearOfManufacture");
    String insuredForRetailOrCustom = getValue("InsuredForRetailOrCustom");
    String immobiliserMake = getValue("Immobiliser_Make");
    String regularDriver = getValue("Regular_Driver");
    String driverLicenseType = getValue("DriverLicenseType");
    String drivingCertificate = getValue("Driving_Certificate");
    String itemType = getValue("Item_Type");




    String address = getValue("Address");
    //AllRisk

    String specifiedAllRiskCover = getValue("SpecifiedAllRiskCover");
    String description = getValue("Description");

    //Electronic Equipment
    String computerType = getValue("Computer_Type");

    //Boats
    String boatStoredWhenNotInUse = getValue("BoatStoredWhenNotInUse");
    String hullCode = getValue("Hull_Code");
    String boatSpeed = getValue("Boat_Speed");
    String inboardSumInsured = getValue("InboardSumInsured");
    String outboardSumInsured = getValue("OutboardSumInsured");
    String territorialLetterProvided = getValue("Territorial_Letter_Provided");
    String territorialCountries = getValue("Territorial_Countries");
    String isWatercraftFinanced = getValue("Watercraft_Financed");
    String financeCompany = getValue("Finance_Company");
    String financeAgreementNumber = getValue("FinanceAgreementNumber");
    String uninterruptedWatercraftInsurance = getValue("UninterruptedWatercraftInsurance");
    String claimsInPast12Months = getValue("Claims_In_Past_12_Months");
    String claimsInPast24Months = getValue("Claims_In_Past_24_Months");
    String claimsInPast36Months = getValue("Claims_In_Past_36_Months");
    String itemForBusinessPurpose = getValue("ItemForBusinessPurpose");
    String affinity = getValue("Affinity");
    String oldPolicyNumber = getValue("Old_Policy_Number");
    String externalRNumber = getValue("External_Reference_Number");
    String externalRName = getValue("External_Reference_Name");
    String caseNbr = getValue("Case_Nbr");
    String staffIndicator = getValue("Staff_Indicator");
    String PropertyOccupiedDay = getValue("occupied_during_day");
    String ResidentialProperty = getValue("Does_the_property_border");
    String xn_residental_property = getValue("Specify Xn residental property");
    String isThereThatched = getValue("Is there a thatched lapa");
    String thatchedfloor_area = getValue("Thatched Lapa hut floor area");
    String SizeOfLapaExceed = getValue("Does the Size of Lapa");
    String SabsaApproved = getValue("Do you have a SABS");
    String conductor = getValue("Waive_Lightning_Conductor");
    String building_completed = getValue("Is_the_building_completed");
    String burglaries_atproperty = getValue("Have_you_had_any_ burglaries_at_the_property");
    String high_security_complex = getValue("Is_the_property_in_a_high_security_complex");
    String areThereHighWalls = getValue("Are_there_1.8m_high_walls");
    String PerimeterWall = getValue("Are_there_Razor_wire_along_the_perimeter_wall");
    String isThereAnElectronicGate = getValue("Is_there_an_electronic_gate?");
    String is_24hrsSecurityOnGates = getValue("Is_there_24hr_security_or_access_control_on_gates?");
    String isThereElectricFencing = getValue("Is_there_electric_fencing?");
    String is_24HrsSecurityGuardPatrol = getValue("Is_there_a_24-hour_security_guard_patrol");
    String propertysurveyTcuried = getValue("Property_Survey_Tcuired");
    String gasappliances = getValue("Are_there_any_Gas_appliances_or_equipment");
    String GasPipeConnections = getValue("Are_there_any_Gas_Pipe_Connections");
    String BusinessConducted = getValue("Is_there_any_business_conducted_on_the_property");
    String BusinessFullDescription = getValue("Please_provide_a_full_description");
    String AreYouOffTheEskom = getValue("Are you off the Eskom_City Power Grid");
    String DoYouHaveAGenerator = getValue("Do you have a generator");
    String IsGeneratorConnected = getValue("Is Generator Connected to power backup");
    String CompulsoryExcess = getValue("Compulsoryexcess");
    String BuildingInsuranceFor = getValue("Have you had uninterrupted 36 months?");
    String NoOfClaim12Months = getValue("Number of claims or losses in the past 12 months");
    String Is13To24Months = getValue("Number of claims or losses in the past 13 to 24 months");
    String NoOfClaimPast25To36Months = getValue("Number of claims or losses in the past 25 to 36 months");
    String NotesBuilding = getValue("Notes Building");
    String waveAlarm = getValue("Wave_Alarm");
    String waiveBurglarBars = getValue("Waive_Burglar_Bars");
    String waiveSecurityGates = getValue("waive_security_gates");
    String inventoryRequired = getValue("Inventory_Required");
    String businessContext = getValue("BusinessContext");
    String BusinessContentsFlatExcess = getValue("businessContentsFlatExcess");
    String underwriting1 = getValue("Underwriting1");
    String policy_renewal_period = getValue("Policy_Renewal_Period");
    String vehicleCover = getValue("CoverType");


    //Method to create recently selected policy

    public void selectRecentContact() {

        Absa_Idirect_POM.Idirect_Factory();

        try {
            if (existsNoReport("imgHome", true, "Home Image Exists")) {
                click("linkRecentContacts", "Select Contact");
                if (exists("tabContactDashboard", true, "Contact Dashboard Exists")) {
                    logger.info("Contact Selected Successfully");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to capture General Details of Personal Lines Policies
     */
    public void generalDetails() {

        Absa_Idirect_POM.Idirect_Factory();

        try {
            if (exists("linkNewProposal", true, "New Proposal Link")) {
                click("linkNewProposal", "Click New Proposal Link");
                if (exists("labelGeneralDetails", true, "General Details ")) {
                    //General Details
                    selectValueFromDropdown("drpDwnProductName", "text", productType, "Select Product Name");
                    //selectValueFromDropdown("drpDwnAffinity", "text", affinity, "Select Affinity");
                    selectValueFromDropdown("drpDwnPolicyType", "text", policyType, "Select Policy Type");

                    click("chkBoxClientContext", "Click Client Context Completed CheckBox");
                    //setText("txtBoxOldPolicyNumber", oldPolicyNumber, "Enter old policy number");
                    setText("txtBoxExternalReferenceNumber", externalRNumber, "Enter External Reference Number");
                    selectValueFromDropdown("drpDwnBranchCode", "text", branchCode, "Select Branch Code/Region");
                    selectValueFromDropdown("drpDwnSource", "text", source, "Select Source");
                    setText("txtBoxExternalReferenceName", externalRName, "Enter External Reference Name");
                    setText("txtBoxCaseNbr", caseNbr, "Enter Case Nbr ");

                    Thread.sleep(2000);
                   // selectValueFromDropdown("drpDwnIntermediary","text","FOURIE INSURANCE BROKERS","The Intermediary was selected");
                    //Current Sales Channel
                    selectValueFromDropdown("drpDwnCurrentSalesChannel", "text", currentSalesChannel, "Select Current Sales Channel");
                    selectValueFromDropdown("drpDwnStaffIndicator", "text", staffIndicator, "Select Staff Indicator ");

                    //Proposal Questionnaire
                    System.err.println(productType);
                    if (productType.equalsIgnoreCase("Absa idirect")) {
                        questionnaire_Idirect();
                    }
                    click("btnNext", "Click Next Button");
                    if (exists("labelLineOfBusiness", true, "Maintain Policy Lines of Business Page")) {
                        logger.info("Policy General Details Captured Successfully");
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Policy General Details is : " + e);
        }
    }

    /**
     * Method to capture Maintain Policy Lines of Business of a Policy
     */
    public void linesOfBusiness() {

        Absa_Idirect_POM.Idirect_Factory();
        String lineOfBusiness = getValue("Line_Of_Business");
        try {
            if (
                    insure.equalsIgnoreCase("Caravan / Trailer")

                    || lineOfBusiness.equalsIgnoreCase("All Risk")
                    || lineOfBusiness.equalsIgnoreCase("Electronic Equipment")
                    || lineOfBusiness.equalsIgnoreCase("Boats")) {
                selectValueFromList("listLineOfBusiness", "Property", "Select Line of Business/Locations/Risk Object");
                click("btnUpdate", "Click Update");
                if (exists("labelClauses", true, "Clauses Screen")) {
                    click("btnNext", "Click Next");
                    if (exists("labelCustomerRiskObjectNumber", true, "Search by Customer Risk Object Number")) {
                        click("btnAddLocationsRiskObjects", "Click Add Button");
                        property();
                        click("btnEndCoversSelection", "Click End Covers Selection");
                        if (existsNoReport("labelUWContains", true, "Underwriting Screen Exists")) {
                            logger.info("Under writing alert is present");
                            if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                                logger.info("Under writing two dropdown is present");
                                selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                                selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert");
                                click("btnUWNext", "Select Next button");
                            } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists")) {
                                logger.info("Under writing one dropdown is present");
                                selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                                click("btnUWNext", "Select Next button");

                            } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown3", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                                logger.info("Under writing three dropdown is present");
                                selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert dropdown 1");
                                selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert dropdown 2");
                                selectValueFromDropdown("drpDwnUWValidation3", "text", underwriting1, "Select UW alert dropdown 3");
                                click("btnUWNext", "Select Next button");
                            }


                        }
                        if (getElements("locationsRiskObjectsCount").size() > 2) {
                            click("btnNextCustomerRiskObjectNumber", "Click Next Button");
                        }
                    }
                }
            }
            System.err.println(lineOfBusiness);
            selectValueFromList("listLineOfBusiness", lineOfBusiness, "Select Line of Business/Locations/Risk Object");
            click("btnUpdate", "Click Update");
            if (exists("labelClauses", true, "Clauses Screen Exists")) {
                click("btnNext", "Click Next");
                if (exists("labelCustomerRiskObjectNumber", true, "Search by Customer Risk Object Number Exists")) {
                    click("btnAddLocationsRiskObjects", "Click Add Button");
                    switch (lineOfBusiness) {
                        case "Property":
                            property();
                            break;
                        case "Motorcar":
                            motorcar();
                            break;
                        case "All Risk":
                            allRisk();
                            break;
                        case "Boats":
                            boats();
                            break;
                        case "Electronic Equipment":
                            electronicEquipment();
                            break;
                    }
                    if (lineOfBusiness.equalsIgnoreCase("Motorcar")) {
                        click("chBoxCovers", "The Covers Details Should be visible");
                        if (vehicleCover.equalsIgnoreCase("VehicleFire")) {
                            click("chBoxAccidentalDamagePartialLoss", "The Accidental Damage Partial Loss");
                            if (exists("chBoxAccidentalDamageTotalLoss", true, "The Element should be visible")) {
                                click("chBoxAccidentalDamageTotalLoss", "The Accidental Damage Total Loss");
                            }
                            if (exists("chBoxTheftPartialLoss", true, "The Element should be visible")) {
                                click("chBoxTheftPartialLoss", "The Theft Partial Loss");
                            }
                            if (exists("chBoxTheftTotalLoss", true, "The Element should be visible")) {
                                click("chBoxTheftTotalLoss", "The Theft Total Loss");
                            }
                            if (exists("chBoxWindScreenRepair", true, "The Element should be visible")) {
                                click("chBoxWindScreenRepair", "The Wind Screen Repair");
                            }
                            if (exists("chBoxWindScreenReplace", true, "The Element should be visible")) {
                                click("chBoxWindScreenReplace", "The Wind Screen Replace");
                            }
                            if (exists("chBoxWindScreenReplace", true, "The Element should be visible")) {
                                click("chBoxHail", "The Hail");
                            }
                            if (exists("chBoxThirdParty", true, "The Element should be visible")) {
                                click("chBoxThirdParty", "The Third Party");
                            }
                            if (exists("chBoxForOther", true, "The Element should be visible")) {
                                click("chBoxForOther", "The Check Box for Others");
                            }
                        }
                        if (vehicleCover.equalsIgnoreCase("ThirdParty")) {
                            click("chBoxAccidentalDamagePartialLoss", "The Accidental Damage Partial Loss");

                            if (exists("chBoxAccidentalDamageTotalLoss", true, "The Element should be visible")) {
                                click("chBoxAccidentalDamageTotalLoss", "The Accidental Damage Total Loss");
                            }
                            if (exists("chBoxTheftPartialLoss", true, "The Element should be visible")) {
                                click("chBoxTheftPartialLoss", "The Theft Partial Loss");
                            }
                            if (exists("chBoxTheftTotalLoss", true, "The Element should be visible")) {
                                click("chBoxTheftTotalLoss", "The Theft Total Loss");
                            }
                            if (exists("chBoxWindScreenRepair", true, "The Element should be visible")) {
                                click("chBoxWindScreenRepair", "The Wind Screen Repair");
                            }
                            if (exists("chBoxWindScreenReplace", true, "The Element should be visible")) {
                                click("chBoxWindScreenReplace", "The Wind Screen Replace");
                            }
                            if (exists("chBoxWindScreenReplace", true, "The Element should be visible")) {
                                click("chBoxHail", "The Hail");
                            }
                            if (exists("chBoxVehicleFire", true, "The Element should be visible")) {
                                click("chBoxVehicleFire", "The Vehicle Fire");
                            }
                            if (exists("chBoxForOther", true, "The Element should be visible")) {
                                click("chBoxForOther", "The Check Box for Others");
                            }
                        }
                    }

                    if (existsNoReport("btnEndCoversSelection", true, "Underwriting Screen Exists")) {
                        click("btnEndCoversSelection", "Click End Covers Selection");

//method to approve uW
                        if (existsNoReport("labelUWContains", true, "Underwriting Screen Exists")) {
                            logger.info("Under writing alert is present");
                            if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                                logger.info("Under writing two dropdown is present");
                                selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                                selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert");
                                click("btnUWNext", "Select Next button");
                            } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists")) {
                                logger.info("Under writing one dropdown is present");
                                selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                                click("btnUWNext", "Select Next button");
                            } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown3", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                                logger.info("Under writing three dropdown is present");
                                selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert dropdown 1");
                                selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert dropdown 2");
                                selectValueFromDropdown("drpDwnUWValidation3", "text", underwriting1, "Select UW alert dropdown 3");
                                click("btnUWNext", "Select Next button");
                            }
                        }
                        if (getElements("locationsRiskObjectsCount").size() > 2) {
                            click("btnNextCustomerRiskObjectNumber", "Click Next Button");
                            //Compherensive Third Party Fire and Theft
//                            if (exists(,,)){
//
//                            }
                            click("btnEndRiskDetails", "Click End Risk Details Button");
                            if (existsNoReport("labelUWContains", true, "Underwriting Screen Exists")) {
                                logger.info("Under writing alert is present");
                                if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                                    logger.info("Under writing two dropdown is present");
                                    selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                                    selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert");
                                    click("btnUWNext", "Select Next button");
                                } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists")) {
                                    logger.info("Under writing one dropdown is present");
                                    selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                                    click("btnUWNext", "Select Next button");

                                } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown3", true, "Underwriting Dropdown Exists") && existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                                    logger.info("Under writing three dropdown is present");
                                    selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert dropdown 1");
                                    selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert dropdown 2");
                                    selectValueFromDropdown("drpDwnUWValidation3", "text", underwriting1, "Select UW alert dropdown 3");
                                    click("btnUWNext", "Select Next button");
                                }


                            }
                            if (existsNoReport("labelPayments", true, "Payments Screen Exists")) {
                                logger.info("Policy Lines Of Business Details Captured Successfully");
                            }
                        }
                    }
                }

            }

        } catch (Exception e) {
            logger.info("Exception in Maintain Policy Lines Of Business is : " + e);
        }
    }

    /**
     * Method to capture Payment Details of a Policy
     */
    public String paymentsDetails() {

        Absa_Idirect_POM.Idirect_Factory();

        String[] policyNumber = new String[0];

        try {
            if (exists("labelPayments", true, "Payments Screen Exists")) {
                //Payments
                String collectionMethodValue = getText("valueDrpDwnCollectionMethod", "Collection Method Default Value");
                if (!collectionMethodValue.equalsIgnoreCase(collectionMethod)) {
                    selectValueFromDropdown("drpDwnCollectionMethod", "text", collectionMethod, "Select Collection Method");
                }
                String paymentTermsValue = getText("valueDrpDwnPaymentTerms", "Payment Terms Default Value");
                if (!paymentTermsValue.equalsIgnoreCase(paymentTerms)) {
                    selectValueFromDropdown("drpDwnPaymentTerms", "text", paymentTerms, "Select Payment Terms");
                }
                selectValueFromDropdown("drpDwnPreferredDueDay", "text", preferredDueDay, "Select Preferred Due Day");
                //Decision
                selectValueFromDropdown("drpDwnDecision", "text", decision, "Select Decision");

                //Reason
                if (decision.equalsIgnoreCase("Confirm Policy")) {
                    selectValueFromDropdown("drpDwnReason", "text", "Final", "Select Reason from the dropDwnn");
                }
                if (decision.equalsIgnoreCase("Save Proposal")){
                    selectValueFromDropdown("drpDwnReason", "text", "Pre-agreement", "Select Reason from the dropDwnn");
                }

                //Screening progress
//                click("chkBoxSanctionScreen", "Click Sanction Screen Completed CheckBox");
//                click("chkBoxRiskProfiling", "Click Risk Profiling Completed CheckBox");
//                click("chkBoxDueDiligence", "Click Due Diligence Completed CheckBox");
                click("btnNext", "Click Next");
//                if (existsNoReport("dialogBasicNotification", true, "GD1000079 Popup")) {
//                    click("btnDialogOK", "Click OK Button");
//                    click("btnNext", "Click Next");
//                }
                click("chBoxBank","The value must be check to proceed with the bank");
                Thread.sleep(2000);
                if (existsNoReport("drpDwnPolicyBankAccount", true, "Bank Account Details Exists")) {
                    //Bank Account Details for <Contact>
                    selectValueFromDropdown("drpDwnPolicyBankAccount", "text", policyBankAccount, "Select Bank Account Number");
                    click("btnFinish", "Click Finish Button");
                    click("btnFinish", "Click Finish Button");

                    String Policy = "";
                    if (exists("dBox", true, "The Value is selected")) {
                        Policy = getText("PolicyNum", "The Element should be visible");
                        click("btnOk", "The Value is selected");
                    }
                    writeExcel(Policy,"For Single Cover");

                    if (existsNoReport("labelMaintainEvent", true, "Maintains Event Exists")) {
                        logger.info("Policy Payments Details Captured Successfully");
                        if (exists("labelUnknownAddressee", true, "The Label is visible")) {
                            click("labelUnknownAddressee", "Click Unknown Addressee");
                            click("btnDelete", "Click Delete Button");
                        }
                        if (!productType.equalsIgnoreCase("Estate Late")) {
                            click("dialogBasicNotification", "Basic Notification Dialog");
                            click("btnDialogOK", "Click OK Button");
                            click("labelWelcomeLetterPLSMS", "Click Welcome Letter PL SMS");
                            click("btnDelete", "Click Delete Button");
                        }
                        if (existsNoReport("dialogBasicNotification", true, "Basic Notification Dialog")) {
                            click("btnDialogOK", "Click OK Button");
                        }
                        click("btnFinish", "Click Finish Button");
                        if (existsNoReport("dialogGD1000079", true, "Policy Creation Dialog")) {
                            click("btnDialogOK", "Click OK Button");
                        }
                        if (existsNoReport("dialogPolicyCreation", true, "Policy Creation Dialog")) {
                            String str = getText("txtPolicyNumber", "Get Policy Number");
                            policyNumber = str.split("\\s+");
                            logger.info("Policy " + policyNumber[1] + " Created Successfully");
                            click("btnOK", "Click OK Button");
                            String PolicyNumber = policyNumber.toString();

                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Policy Payment Details is : " + e);
        }
        return policyNumber[1];
    }

    /**
     * Method to capture Property Details
     */
    public void property() {

        Absa_Idirect_POM.Idirect_Factory();
        String lineOfBusiness = getValue("Line_Of_Business");
        try {
            //Property Address
            if (exists("labelPropertyAddress", true, "Property Address Exists")) {
                click("chkBoxRiskAddressSame", "Click Risk Address Same CheckBox");
                //Property General Details
                if (insure.equalsIgnoreCase("Building")) {
                    click("chkBoxBuilding", "Click Building CheckBox");
                } else if (insure.equalsIgnoreCase("Contents")
                        /*|| productType.equalsIgnoreCase("Private Insure") && insure.equalsIgnoreCase("Vehicle")
                        || insure.equalsIgnoreCase("Motorcycle")*/
                        || insure.equalsIgnoreCase("Caravan / Trailer")
                        || lineOfBusiness.equalsIgnoreCase("All Risk")
                        || lineOfBusiness.equalsIgnoreCase("Electronic Equipment")
                        || lineOfBusiness.equalsIgnoreCase("Boats")) {
                   click("chkBoxContents", "Click Contents CheckBox");
                }
                //click("chkBoxBuilding", "Click Building CheckBox");
                selectValueFromDropdown("drpDwnBuildingUsedFor", "text", buildingUsedFor, "Select Building Be Used For");
                selectValueFromDropdown("drpDwnTypeOfBuilding", "text", typeOfBuilding, "Select Type Of Building");
                selectValueFromDropdown("drpDwnTypeOfArea", "text", typeOfArea, "Select Type Of Area");
                //click("chkBoxIsBuildingOccupied", "Click Is Building Occupied CheckBox");
                //setText("txtBoxOccupiedSinceDate", getCurrentDate(), "Enter Occupied Since Date");
                if (PropertyOccupiedDay.equalsIgnoreCase("Y")) {
                    click("chkBoxIsPropOccupiedDuringDay", "Click is Prop Occupied DuringDay Label");
                }
                //setText("txtBoxUnoccupiedDays", unOccupiedDays, "Enter Number of Consecutive Unoccupied Days");
                if (ResidentialProperty.equalsIgnoreCase("Y")) {
                    click("chkBoxDoes_the_property_border_aXn_residential_property", "Click is Prop border checkbox Label");
                    selectValueFromDropdown("drpDwnSpecifyNonResidential", "text", xn_residental_property, "Selectedpecify xn residental property");
                }
                selectValueFromDropdown("drpDwnWallConstruction", "text", wallConstruction, "Select Wall Construction");
                selectValueFromDropdown("drpDwnRoofConstruction", "text", roofConstruction, "Select Roof Construction");
                if (isThereThatched.equalsIgnoreCase("Y")) {
                    click("chkBoxIsThereThatched", "Clicked Is there a thatched lapa within 3 meters of main dwelling");
                    selectValueFromDropdown("drpDwnThatchedHutFloor", "text", thatchedfloor_area, "Selected Thatched Lapa hut floor area");
                        if (SabsaApproved.equalsIgnoreCase("Y")) {
                            click("chkDoesYouHaveASabsaApprovedLightingConductor", "Clicked Is there a thatched lapa within 3 meters of main dwelling");
                        }

                }
                if (conductor.equalsIgnoreCase("Y")) {
                    click("chkWaive_Lightning_Conductor", "Clicked Waive lighting Conductor");
                }
                /*if (building_completed.equalsIgnoreCase("Y")) {
                    click("chkIs_the_building_completed", "Clicked Is the building completed");
                }
                if (burglaries_atproperty.equalsIgnoreCase("Y")) {
                    click("chkHave_you_had_any_burglaries_at_the_property", "Clicked have you had any burglaries at the property");
                }*/

                if (high_security_complex.equalsIgnoreCase("Y")) {
                    click("chkIs_the_property_in_a_high_security_complex", "Clicked Is the property in a high security complex");
                    if (areThereHighWalls.equalsIgnoreCase("Y")) {
                        click("chkAreThereHighWalls", "Clicked Are there 1.8m high walls");
                        if (PerimeterWall.equalsIgnoreCase("Y")) {
                            click("chkAreThereRazorWireAlongThePerimeterWall", "Clicked Are there Razor wire along the perimeter wall");
                            if (isThereAnElectronicGate.equalsIgnoreCase("Y")) {
                               // click("chkIsThereAnElectronicGate", "Clicked Is there an electronic gate?");
                                if (is_24hrsSecurityOnGates.equalsIgnoreCase("Y")) {
                                    click("chkIsThere24hrsSecurityOrAccessControlOnGates", "Clicked Is there 24hr security or access control on gates?");
                                    if (isThereElectricFencing.equalsIgnoreCase("Y")) {
                                        click("chkIsThereElectricFencing", "Clicked Is there electric fencing? ");
                                        if (is_24HrsSecurityGuardPatrol.equalsIgnoreCase("Y")) {
                                            click("chkIsThereA24HrsSecurityGuardPatrol", "Clicked Is there 24 hrs Security Guard patrol");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                setText("txtBoxNumberOfOutBuildings", numberOfOutBuildings, "Enter How Many Out Buildings are there");
                if (propertysurveyTcuried.equalsIgnoreCase("Y")) {
                    click("chkPropertySurveyRequired", "Clicked Property Survey Required");
                    setText("txtBoxDateRiskSurveyRequested", getCurrentDate(), "Enter Date Risk Survey Requested");
                    setText("txtBoxDateRiskSurveyReceived", getCurrentDate(), "Enter Date Risk Survey Received");
                }
                if (gasappliances.equalsIgnoreCase("Y")) {

                    click("chkAreThereAnyGasAppliancesOrEquipment", "Click Are There Any Gas Appliances Or Equipment");
                }
//                if (GasPipeConnections.equalsIgnoreCase("Y")) {
//
//                    click("chkAreThereAnyGasPipeConnections", "Click Are There Any Gas Pipe Connections");
//                }
                if (BusinessConducted.equalsIgnoreCase("Y")) {
                    click("chkIsThereAnyBusinessConductedOnTheProperty", "Click is There Any Business Conducted On The Property");
                    setText("chkTypeOfBusinessDescription", BusinessFullDescription, "Enter Number of Consecutive Unoccupied Days");
                }
                //setText("txtBoxPlotQuestionnarieRequested", getCurrentDate(), "Enter Survey Requested");
                //setText("txtBoxplotQuestionnarieRecevied", getCurrentDate(), "Enter Survey Received");

                if (insure.equalsIgnoreCase("Building")) {
                    //Building Details
                    setText("txtBoxNoOfGeysers", geysers, "Enter Number of Geysers");
                    setText("txtBoxNoOfSolarGeysers", solarGeysers, "Enter Number of Solar Geysers");
                    if (AreYouOffTheEskom.equalsIgnoreCase("Y")) {

                        click("chkAreYouOffTheEskom/CityPowerGrid", "Click Are you off the Eskom/City Power Grid");
                    }
                    if (DoYouHaveAGenerator.equalsIgnoreCase("Y")) {

                        click("chkDoYouHaveAGenerator", "Click Do you have a generator");
                        if (IsGeneratorConnected.equalsIgnoreCase("Y")) {

                            click("chkIsGeneratorConnectedToPowerBackup", "Click Is Generator Connected to power backup");

                        }
                        setText("txtBoxDateCertificateRequested", getCurrentDate(), "Enter Date certificate Requested");
                        setText("txtBoxDateCertificateReceived", getCurrentDate(), "Enter Date certificate Received");


                    }

                    // selectValueFromDropdown("drpDwnCoverType", "text", CoverType, "Select Cover type");
                    selectValueFromDropdown("drpDwnBondApplicable", "text", bondApplicable, "Select Bond Applicable");
                    Thread.sleep(2000);
                    setText("txtBoxSumInsuredMainBuilding", sumInsuredMainBuilding, "Enter Sum Insured of Main Building");
                    setText("txtBoxSumInsuredOutBuilding", sumInsuredOutBuilding, "Enter Sum Insured Out Buildings");
                    selectValueFromDropdown("drpDwnFlatBuilding", "text", flat, "Select Flat");
                    setText("txtBoxCompulsoryExcess", CompulsoryExcess, "Enter Compulsory excess");
                    if (BuildingInsuranceFor.equalsIgnoreCase("Y")) {
                        click("txtBoxHaveYouHadUnInterruptedBuildingInsuranceFor", "Click Is Generator Connected to power backup");
                    }
                    setText("txtBoxNoOfClaimPast12Months", NoOfClaim12Months, "Enter Number of claims or losses in the past 12 months");
                    setText("txtBoxNoOfClaimPast13To24Months", Is13To24Months, "Enter Number of claims or losses in the past 13 to 24 months");
                    setText("txtBoxNoOfClaimPast25To36Months", NoOfClaimPast25To36Months, "Enter Number of claims or losses in the past 25 to 36 months");
                    // setText("txtBoxnoOfClaimPast37To48Months", NoOfClaimPast37To48Months, "Enter Number of claims or losses in the past 37 to 48 months");
                    //  setText("txtBoxnoOfClaimPast49To60Months", NoOfClaimPast49To60Months, "Enter Number of claims or losses in the past 49 to 60 months");
                    setText("txtBoxNotesBuilding", NotesBuilding, "Enter Notes Building");
                    selectValueFromDropdown("drpDwnRegisteredOwnerBuilding", "text", registeredOwner, "Select Registered Owner");
                } else if (insure.equalsIgnoreCase("Contents")
                        /*|| productType.equalsIgnoreCase("Private Insure") && insure.equalsIgnoreCase("Vehicle")
                        || insure.equalsIgnoreCase("Motorcycle")*/
                        || insure.equalsIgnoreCase("Caravan / Trailer")
                        || lineOfBusiness.equalsIgnoreCase("All Risk")
                        || lineOfBusiness.equalsIgnoreCase("Electronic Equipment")
                        || lineOfBusiness.equalsIgnoreCase("Boats")){
//                        || lineOfBusiness.equalsIgnoreCase("Personal Accident")) {
//                    if (productType.equalsIgnoreCase("Private Insure")) {
//                        click("chkBoxIsPropertyInHighSecurity", "Click Is Property In High Security CheckBox");
//                        click("chkBoxAreThereHighWalls", "Click Are There High Walls CheckBox");
//                        click("chkBoxRazorWirePerimeterWall", "Click Razor Wire Perimeter Wall CheckBox");
//                        click("chkBoxOpenFieldsAroundProperty", "Click Open Fields Around Property CheckBox");
//                        click("chkBoxElectronicFencing", "Click Electronic Fencing CheckBox");
//                        click("chkBoxElectronicGate", "Click Electronic Gate CheckBox");
//                        click("chkBoxSecurityOnGate", "Click Security On Gate CheckBox");
//                        click("chkBoxSecurityGuardPatrol", "Click Security Guard Patrol CheckBox");
//                    }
                    //House Content Details
                    selectValueFromDropdown("drpDwnAlarmInstalled", "text", alarmInstalled, "Select Alarm Installed");
                    if (waveAlarm.equalsIgnoreCase("Y")) {
                        click("chkBoxWaiveAlarm", "Click Waive Alarm");
                    }

                    click("chkBoxAlarmProfessionallyInstalled", "Click Alarm Professionally Installed CheckBox");
                    click("chkBoxAlarmInfraRedDetectors", "Click Alarm InfraRed Detectors CheckBox");
                    click("chkBoxAlarmWorkingOrder", "Click Alarm Working Order CheckBox");
                    selectValueFromDropdown("drpDwnBurglarBarsMainDwelling", "text", burglarBarsMainDwelling, "Select Burglar Bars Main Dwelling");
                    if (waiveBurglarBars.equalsIgnoreCase("Y")) {
                        click("chkBoxWaiveBurglarBars", "Click Waive Burglar Bars");
                    }
                    Thread.sleep(1000);
                    selectValueFromDropdown("drpDwnExternalDoorMainDwelling", "text", externalDoorMainDwelling, "Select Burglar Bars Outbuilding1");
                    if (existsNoReport("drpDwnBurglarBarsOutbuilding", true, "The value should be present")) {
                        selectValueFromDropdown("drpDwnBurglarBarsOutbuilding", "text", burglarBarsOutbuilding, "Select Burglar Bars Outbuilding2");
                    }
                    if (existsNoReport("drpDwnExternalDoorOutbuilding", true, "The value should be present")) {
                        selectValueFromDropdown("drpDwnExternalDoorOutbuilding", "text", externalDoorOutbuilding, "Select External Door Outbuilding");
                    }

                    if (waiveSecurityGates.equalsIgnoreCase("Y")) {
                        click("chkBoxWaiveSecurityGates", "Click Waive Security Gates");
                    }
                    /*if (inventoryRequired.equalsIgnoreCase("Y")) {
                        click("chkBoxInventoryRequired", "Click Inventory Required");
                        setText("txtBoxInventoryRequestedDate", getCurrentDate(), "Enter Inventory Requested Date");
                        setText("txtBoxInventoryReceivedDate", getCurrentDate(), "Enter Inventory Received Date");

                    }*/
                    if (businessContext.equalsIgnoreCase("Y")) {
                        click("chkBoxBusinessContents", "Click Business Contents");
                        setText("txtBoxBusinessContentsFlatExcess", BusinessContentsFlatExcess, "Enter Main Dwelling Sum Insured");

                    }
                    click("chBoxAdditionalTheft", "The Theft is clicked additionally");
                    setText("txtBoxCompulsoryExcessContents", CompulsoryExcess, "Enter Main Dwelling Sum Insured");


                    //                    if (!productType.equalsIgnoreCase("Private Insure")){
//                        setText("txtBoxInventoryRequestedDate", getCurrentDate(), "Enter Inventory Requested Date");
//                        setText("txtBoxInventoryReceivedDate", getCurrentDate(), "Enter Inventory Received Date");
//                    }
                    setText("txtBoxMainDwellingSumInsured", sumInsuredMainBuilding, "Enter Main Dwelling Sum Insured");
                    setText("txtBoxOutbuildingSumInsured", sumInsuredOutBuilding, "Enter Outbuilding Sum Insured");
                    selectValueFromDropdown("drpDwnFlatContents", "text", flat, "Select Flat");
                    if (BuildingInsuranceFor.equalsIgnoreCase("Y")) {
                        click("txtBoxContentHaveYouHadUnInterruptedBuildingInsuranceFor", "Click Content Have You Had UnInterrupted Building Insurance For");
                    }
                    setText("txtBoxContentNoOfClaimPast12Months", NoOfClaim12Months, "Enter Number of claims or losses in the past 12 months");
                    setText("txtBoxContentNoOfClaimPast13", Is13To24Months, "Enter Number of claims or losses in the past 13 to 24 months");
                    setText("txtBoxContentNoOfClaimPast25", NoOfClaimPast25To36Months, "Enter Number of claims or losses in the past 25 to 36 months");
                    setText("txtBoxContentNotesBuilding", NotesBuilding, "Enter Notes Building");
                    selectValueFromDropdown("drpDwnRegisteredOwnerContents", "text", registeredOwner, "Select Registered Owner");
                }
                click("btnNext", "Click Next Button");


                if (existsNoReport("labelUWContains", true, "Blocking Screen Exists")) {
                    logger.info("Under writing blocking alert is present");
                    if (exists("imgHome1", true, "Home Image Exists")) {
                        click("btnUserMenu", "Click on User Menu Dropdown");
                        click("elmntLogOff", "Click LogOff Element");
                        if (exists("dialogLogOff", true, "Confirm Logoff Dialog Box")) {
                            click("btnOKUw", "Click OK Button");
                            Thread.sleep(4000);
                            if (exists("linkChangePassword", true, "Login Page")) {
                                logger.info("User LogOut Successful");
                                wdriver.quit();
                            }
                        }
                    }

                }


//                if (exists("labelPropertyAdditionalDetails", true, "Property Additional Details")) {
//                    click("btnNext", "Click Next Button");
//                if (exists("labelPropertyTechnicalReport", true, "Property Technical Report")) {
//                    //Building
//                    setText("txtBoxYearBuilt", yearBuilt, "Enter Year Built");
//                    //First Aid Resources
//                    selectValueFromDropdown("drpDwnYearlyMaintenance", "text", yearlyMaintenance, "Select Yearly Maintenance");
//                    //Standards Match
//                    selectValueFromDropdown("drpDwnElectricalStandards", "text", electricalStandards, "Select Electrical Standards");
//                    selectValueFromDropdown("drpDwnHeatingStandards", "text", heatingStandards, "Select Heating Standards");
//                    selectValueFromDropdown("drpDwnInflammableStandards", "text", inflammableStandards, "Select Inflammable Standards");
//                    selectValueFromDropdown("drpDwnWoodPlasticStandards", "text", woodPlasticStandards, "Select Wood Plastic Standards");
//                    selectValueFromDropdown("drpDwnStorageStandards", "text", storageStandards, "Select Storage Standards");
//                    click("btnNext", "Click Next Button");
//                    if (exists("labelFireAllRiskSpecificData", true, "Fire All Risk Specific Data Exists")) {
//                        click("btnNext", "Click Next Button");
                if (existsNoReport("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("Property " + insure + " Details Captured Successfully");
                }
//                    }
//                }
//                }
            }
        } catch (Exception e) {
            logger.info("Exception in Property Details is : " + e);
        }
    }


    /**
     * Method to capture MotorCar details
     */
    public void motorcar() {
        Absa_Idirect_POM.Idirect_Factory();
        try {
            if (exists("labelMotorRiskObjectDetails", true, "Insured General Details Exists")) {
                //Identifiers
                Thread.sleep(1000);
                click("labelEngine", "Click Vehicle ID No/Chassis No");
                setText("txtBoxVehicleID", vehicleID, "Enter Vehicle ID No/Chassis No");
                click("btnIdentifierUpdate", "Click Update Button");
                //Risk Address
                click("chkBoxIsRiskAddSameAsPhysical", "Click Is Risk Address Same As Physical Address? CheckBox");
                click("chkBoxIsWorkAddSameAsRisk", "Click Is Work Address Same As Risk Address? CheckBox");
                selectValueFromDropdown("drpDwnWhatToInsure", "text", insure, "Select What Do You Want To Insure Dropdown");
                if (insure.equalsIgnoreCase("Vehicle") || insure.equalsIgnoreCase("Motorcycle")) {
                    //Vehicle General Details
                    selectValueFromDropdown("drpDwnVehicleParkDuringDay", "text", vehicleParkDuringDay, "Select Vehicle Park During Day ? Dropdown");
                    selectValueFromDropdown("drpDwnDayTimeParkingCovered", "text", dayTimeParkingCovered, "Select Day Time Parking Covered ? Dropdown");
                    selectValueFromDropdown("drpDwnDayTimeParkingLocked", "text", dayTimeParkingLocked, "Select Day Time Parking Locked ? Dropdown");
                    selectValueFromDropdown("drpDwnVehicleParkDuringNight", "text", vehicleParkDuringNight, "Select Vehicle Park During Night ? Dropdown");
                    selectValueFromDropdown("drpDwnNightTimeParkingCovered", "text", nightTimeParkingCovered, "Select Night Time Parking Covered ? Dropdown");
                    selectValueFromDropdown("drpDwnNightTimeParkingLocked", "text", nightTimeParkingLocked, "Select Night Time Parking Locked ? Dropdown");
                    selectValueFromDropdown("drpDwnVehicleUsedFor", "text", vehicleUsedFor, "Select Vehicle Be Used For ? Dropdown");
                    selectValueFromDropdown("drpDwnYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture Dropdown");
                    selectValueFromDropdown("drpDwnMake", "text", make, "Select Make Dropdown");
                    selectValueFromDropdown("drpDwnModelVariant", "text", modelVariant, "Select Model Variant Dropdown");
                    //  selectValueFromDropdown("drpDwnYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture Dropdown");
                    selectValueFromDropdown("drpDwnInsuredForRetailOrCustom", "text", insuredForRetailOrCustom, "Select Insured For Retail Or Custom ? Dropdown");
                    setText("txtVehicleMileage", "20", "The Vehicle mileage was added");
                    //Finance
                    if (motorFinance.equalsIgnoreCase("Y")) {
                        click("chBoxFinance", "The Check Box should be clicked");
                        selectValueFromDropdown("drpDwnFinance", "text", financeCompany, "The Finance Company name should be clicked");
                    }
                    if(insure.equalsIgnoreCase("Vehicle")) {
                        selectValueFromDropdown("drpFlat", "text", BusinessContentsFlatExcess, "The Flat value is selected");
                    }if(insure.equalsIgnoreCase("Motorcycle")){
                        selectValueFromDropdown("drpMotorcycleFlat", "text", BusinessContentsFlatExcess, "The Flat value is selected");
                    }if (insure.equalsIgnoreCase(" Caravan/Trailer")){
                        selectValueFromDropdown("drpCaravanFlat", "text", BusinessContentsFlatExcess, "The Flat value is selected");
                    }
                    click("chkBoxImmobiliser", "Click Immobiliser CheckBox");
                    selectValueFromDropdown("drpDwnImmobiliserMake", "text", immobiliserMake, "Select Immobiliser Make Dropdown");
//                    setText("txtBoxInsuranceValue", insuranceAmount, "Enter Insurance Value");
                    //Tracking Device
                    click("chBoxTrackingDevice","The Tracking Device is checked");
                    selectValueFromDropdown("drpDwnTrackingDeviceMake","text","Tracking Device","The Tracking Device is selected");
                    setText("txtBoxTrackingDeviceModel","tracetek","The TrackingDevice is given");
                    //Registered Owner Details
                    selectValueFromDropdown("drpDwnRegisteredOwner", "text", registeredOwner, "Select Registered Owner");
                    //Driver Details
                    selectValueFromDropdown("drpDwnRegularDriver", "text", regularDriver, "Select Regular Driver");
                    selectValueFromDropdown("drpDwnDriverLicenseType", "text", driverLicenseType, "Select Regular Driver License Type Dropdown");
                    if (insure.equalsIgnoreCase("Motorcycle")) {
                        selectValueFromDropdown("drpDwnDrivingCertificate", "text", drivingCertificate, "Select Defensive Driving Certificate Dropdown");
                    }
                    click("chkBoxIsVehicleRegInSouthAfrica", "Click Is Vehicle Registered In South Africa ? CheckBox");
                    click("chBoxPreInspectionReport","The Pre Inspection report is checked");
                    click("chBoxPreInspectionReportReceived","The Inspection report is received");
                    setText("txtPreInspectionDate","","The Inspection report was dated ON");
                } else if (insure.equalsIgnoreCase("Caravan / Trailer")) {
                    //Caravan/Trailer General Details
                    selectValueFromDropdown("drpDwnItemType", "text", itemType, "Select Item Type Dropdown");
                    selectValueFromDropdown("drpDwnVehicleParkDuringNight", "text", vehicleParkDuringNight, "Select Vehicle Park During Night ? Dropdown");
                    selectValueFromDropdown("drpDwnVehicleUsedFor", "text", vehicleUsedFor, "Select Vehicle Be Used For ? Dropdown");
                    click("chkBoxIsCarvanParkUnderNet", "Click Is Carvan Parked Under Hail");
                    setText("txtBoxMakeModelCaravan", make, "Enter Make/Model");
                    setText("txtBoxCaravanInsuredValue", insuranceAmount, "Enter Caravan Insured Value");
                    selectValueFromDropdown("drpDwnYearOfManufactureCaravan", "text", yearOfManufacture, "Select Caravan Year Of Manufacture Dropdown");
//                    click("chkBoxRequireCreditShortFall", "Click Require Credit ShortFall ?");
                    selectValueFromDropdown("drpCaravanFlat","text","1000","The Caravan Value was selected");
                    click("chBoxFinance", "The Check Box should be clicked");
                    selectValueFromDropdown("drpDwnFinance", "text", financeCompany, "The Finance Company name should be clicked");

                    setText("txt12Days","1","The 12Days value is passed for caravan");
                    setText("txt13to24Days","1","The 13Days value is passed for caravan");
                    setText("txt25to36Days","1","The 25Days value is passed for caravan");
                }
                click("btnNext", "Click Next Button");
                if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("Motorcar - " + insure + " Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Motorcar Details is : " + e);
        }
    }

    /**
     * Method to capture All Risk details
     */
    public void allRisk() {

        Absa_Idirect_POM.Idirect_Factory();

        try {
            if (exists("labelAllRiskDetails", true, "All Risk Details")) {
                selectValueFromDropdown("drpDwnAddressList", "index", "1", "Select Address");

                //  selectValueFromDropdown("drpDwnAddressList", "text", address, "Select Address");
                selectValueFromDropdown("drpDwnRiskToInsure", "text", insure, "Select Risk To Insure");
                if (insure.equalsIgnoreCase("Unspecified All Risk Cover")) {
                    selectValueFromDropdown("drpDwnUnSpecifiedAllRiskCover", "text","Clothing and Personal Effects", "Select Specified All Risk Cover");
                }else{
                    selectValueFromDropdown("drpDwnSpecifiedAllRiskCover", "text",specifiedAllRiskCover, "Select Specified All Risk Cover");
                }
                setText("txtBoxDescription", description, "Enter Description");
                setText("txtBoxSumInsured", insuranceAmount, "Enter Sum Insured");
                click("btnFinish", "Click Finish Button");
                if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("All Risk - " + insure + " Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in All Risk is : " + e);
        }
    }

    /**
     * Method to capture Personal Computers details
     */
    public void personalComputers() {

        Absa_Idirect_POM.Idirect_Factory();

        try {
            if (exists("labelPersonalComputer", true, "Personal Computer")) {
                selectValueFromDropdown("drpDwnAddressList", "index", "1", "Select Address");
                if (itemForBusinessPurpose.equalsIgnoreCase("Yes")) {
                    click("chkBoxItemForBusinessPurpose", "Click Item For Business Purpose");
                }
                selectValueFromDropdown("drpDwnComputerType", "text", computerType, "Select Type");
                setText("txtBoxMake", make, "Enter Make");
                setText("txtBoxPersonalComputerSumInsured", insuranceAmount, "Enter Personal Computer Sum Insured");
                click("btnFinish", "Click Finish Button");
                if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("Personal Computers Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Personal Computers is : " + e);
        }
    }
    /* Method for Electronic Equipement for IDirect*/

    public void electronicEquipment() {
        Absa_Idirect_POM.Idirect_Factory();
        try {

            if (exists("labelElectronic", true, "The Label is present")) {
                selectValueFromDropdown("drpDwnAddress", "index", "1", "Select Address");
                if (itemForBusinessPurpose.equalsIgnoreCase("Yes")) {
                    click("chkBoxItemForBusinessPurpose", "Click Item For Business Purpose");
                }
            }
            selectValueFromDropdown("drpDwnType", "text", computerType, "The Electronic Type was selected");
            selectValueFromDropdown("drpDwnFlat", "text", "500", "The value is selected");
            setText("txtBoxMake", make, "The Make is selected");
            setText("txtBoxModel", "2019", "The Model is Selected");
            setText("txtBoxElectronicEquipmentSumInsured", insuranceAmount, "The Sum Insured value is clicked");
            setText("txtBoxSerialNumber", "T5639200", "The Serial Number should be selected");
            setText("txtBoxIMEINumber", "U677897383", "The IMEI Number should be selected");
            click("btnFinish", "Click Finish Button");
        } catch (Exception e) {
            logger.info("Excepetion must be thrown on this");
        }
    }

    /**
     * Method to capture Boats details
     */
    public void boats() {

        Absa_Idirect_POM.Idirect_Factory();

        try {
            if (exists("labelBoatDetails", true, "Boat Details")) {
                //Risk Address
                click("chkBoxRiskAddressSame", "Click Is Risk Address Same As Physical Address? CheckBox");
                //Boat Details
                if (territorialLetterProvided.equalsIgnoreCase("Yes")) {
                    click("chkBoxTerritorialLetterProvided", "Click Territorial Letter Provided");
                    String defaultTerritorialCountry = getText("LabelTerritorialCountries", "Territorial Countries Default Value");
                    if (!territorialCountries.equalsIgnoreCase(defaultTerritorialCountry)) {
                        selectValueFromDropdown("drpDwnTerritorialCountries", "text", territorialCountries, "Select Territorial Countries");
                    }
                    setText("txtBoxLetterFromDate", getCurrentDate(), "Enter Letter From Date");
                    setText("txtBoxLetterToDate", getCurrentDate(), "Enter Letter To Date");
                }
                selectValueFromDropdown("drpDwnBoatType", "text", itemType, "Select Item Type");
                selectValueFromDropdown("drpDwnBoatStoredWhenNotInUse", "text", boatStoredWhenNotInUse, "Select Boat Stored When Not In Use");
                selectValueFromDropdown("drpDwnBoatUsedFor", "text", vehicleUsedFor, "Select Boat Used For");
                selectValueFromDropdown("drpDwnBoatYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture");
                setText("txtBoxBoatMakeModel", make, "Enter Make Model");
                setText("txtBoxBoatDescription", description, "Enter Description");
                selectValueFromDropdown("drpDwnBoatHullCode", "text", hullCode, "Select Hull Code");
                if (isWatercraftFinanced.equalsIgnoreCase("Yes")) {
                    click("chkBoxIsTheWatercraftFinanced", "Click Is The Watercraft Financed");
                    selectValueFromDropdown("drpDwnFinanceCompany", "text", financeCompany, "Select Finance Company");
                    setText("txtBoxFinanceAgreementNumber", financeAgreementNumber, "Enter Finance Agreement Number");
                }
                selectValueFromDropdown("drpBoatFlat","text","1000","The Boat Flat value was selected");
                selectValueFromDropdown("drpDwnBoatSpeed", "text", boatSpeed, "Select Boat Speed");
                if (existsNoReport("txtBoxHullSumInsured", true, "The watercraft value is selected")) {
                    setText("txtBoxHullSumInsured", insuranceAmount, "Enter Hull Sum Insured");
                }
                if (existsNoReport("txtBoxHullSumInsured", true, "The watercraft value is selected")) {
                    setText("txtBoxInboardSumInsured", inboardSumInsured, "Enter InBoard Sum Insured");
                }
                if (existsNoReport("txtBoxHullSumInsured", true, "The watercraft value is selected")) {
                    setText("txtBoxOutboardSumInsured", outboardSumInsured, "Enter OutBoard Sum Insured");
                }
                if (uninterruptedWatercraftInsurance.equalsIgnoreCase("Yes")) {
                    click("chkBoxUninterruptedWatercraft36Mon", "Click Uninterrupted Watercraft");
                    setText("txtBoxLossesInPast12Months", claimsInPast12Months, "Enter Claims In Past 12 Months");
                    setText("txtBoxLossesInPast13To24Mon", claimsInPast24Months, "Enter Claims In Past 24 Months");
                    setText("txtBoxLossesInPast25To36Mon", claimsInPast36Months, "Enter Claims In Past 36 Months");
                }
                click("btnFinish", "Click Finish Button");
                if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("Boats - " + itemType + " Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Boats is : " + e);
        }
    }

    /**
     * Method to capture Personal Accident details
     */
    public void personalAccident() {

        Absa_Idirect_POM.Idirect_Factory();

        try {
            if (exists("labelInsuredGeneralDetails", true, "Insured General Details")) {
                click("btnNext", "Click Next Button");
                if (exists("labelCoverSelection", true, "Cover Selection")) {
                    //Cover selection
                    selectValueFromDropdown("drpDwnListInsuranceAmount", "text", insuranceAmount, "Select Insurance Amount");
                    logger.info("Personal Accident Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Personal Accident is : " + e);
        }
    }


    public void clientCodeValidation() {

        Absa_Idirect_POM.Idirect_Factory();

        try {
            if (exists("labelContactDashboard", true, "Contact Dashboard")) {
                click("linkUpdateContact", "Click Update Contact");
                if (exists("labelPrimaryDetails", true, "Primary Details")) {
                    //Client Code Validation
                    String clientCode = getElement("txtBoxClientCode").getAttribute("value");
                    if (!clientCode.isEmpty()) {
                        logger.info("Client Code Generated Successfully");
                        System.out.println("Client Code is : " + clientCode);
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Client Code Validation is : " + e);
        }
    }

    public void questionnaire_Idirect() {

        Absa_Idirect_POM.Idirect_Factory();

        try {
            selectValueFromDropdown("drpDwnQuestion1_AbsaIdirect", "text", question1, "Select Answer of Question 1");
            selectValueFromDropdown("drpDwnQuestion2_AbsaIdirect", "text", question2, "Select Answer of Question 2");
            selectValueFromDropdown("drpDwnQuestion3_AbsaIdirect", "text", question3, "Select Answer of Question 3");
            selectValueFromDropdown("drpDwnQuestion4_AbsaIdirect", "text", question4, "Select Answer of Question 4");

        } catch (Exception e) {
            logger.info("Exception in ABSA IDirect Questionnaire is : " + e);
        }

    }



        public void business(String value){

        try{
            selectValueFromList("listLineOfBusiness", value, "Select Line of Business/Locations/Risk Object");
            click("btnUpdate", "Click Update");
            if (exists("labelClauses", true, "Clauses Screen Exists")) {
                click("btnNext", "Click Next");
                if (exists("labelCustomerRiskObjectNumber", true, "Search by Customer Risk Object Number Exists")) {
                    click("btnAddLocationsRiskObjects", "Click Add Button");
                }
            }
        } catch (Exception e) {
        logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
    }

    }

    public void closeBusiness(){

        try{
            if (existsNoReport("btnEndCoversSelection", true, "Underwriting Screen Exists")) {
                click("btnEndCoversSelection", "Click End Covers Selection");
                click("btnFinish&Next","Click Next Button");
            }
        } catch (Exception e) {
            logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
        }

    }





}