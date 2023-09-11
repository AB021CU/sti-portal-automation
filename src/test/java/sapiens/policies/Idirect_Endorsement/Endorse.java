package sapiens.policies.Idirect_Endorsement;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import sapiens.policies.Idirect.Absa_Idirect;
import sapiens.policies.Idirect.Absa_Idirect_Multi;
import sapiens.policies.Idirect.Absa_Idirect_POM;
import utility.WebDr;

import java.util.ArrayList;

import static org.slf4j.LoggerFactory.getLogger;

public class Endorse extends WebDr {
    private static final Logger logger = getLogger(Endorse.class);

    //Instance of the WebDriver
    public Endorse(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }
    String policyno ="PL-IDI6529635091";
    String category= null;
    String reason = null;

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
    //String insure = getValue("Insure");
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
    String CaravanMake = getValue("caravanMake");
    String CaravanUsedfor =getValue("caravanUsedFor");
    String CaravanyearOfManufacture = getValue("CaravanYear");
    String CaravanInsuranceAmount = getValue("CaravanInsuranceAmount");
    //MotorCycle
    String motorCycleMake=getValue("motorCycleMake");
    String motorCycleModelVariant= getValue("motorCycleModelVariant");



    //String address = getValue("Address");
    //AllRisk
    String InsureAR =getValue("InsureAllrisk");
    String specifiedAllRiskCover = getValue("SpecifiedAllRiskCover");
    String description = getValue("Description");
    String ARInsureAmount =getValue("AllRiskInsureAmount");
    //Electronic Equipment
    String computerType = getValue("Computer_Type");
    String EEmake =getValue("electronicMake");
    String EEInsuranceAmount = getValue("ElectronicInsuranceAmount");
    //Boats
    String boatMake =getValue("boatMake");
    String boatType =getValue("boatType");
    String boatYear =getValue("boatYear");
    String boatUsedFor =getValue("boatusedfor");
    //
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
    //String oldPolicyNumber = getValue("Old_Policy_Number");
//    String externalRNumber = getValue("External_Reference_Number");
//    String externalRName = getValue("External_Reference_Name");
//    String caseNbr = getValue("Case_Nbr");
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
    String testcaseName;
    String MovehicleParkDuringDay = getValue("MoVehicleParkDuringDay");
    String ModayTimeParkingCovered = getValue("MoDayTimeParkingCovered");
    String ModayTimeParkingLocked = getValue("MoDayTimeParkingLocked");
    String MovehicleParkDuringNight = getValue("MoVehicleParkDuringNight");
    String MonightTimeParkingCovered = getValue("MoNightTimeParkingCovered");
    String MonightTimeParkingLocked = getValue("MoNightTimeParkingLocked");

    String sAddVehicle = "No";//getValue("AddVehicle");
    String sAddMotorcycle = "Yes";//getValue("AddMotorcycle");
    String sAddCaravan ="Yes";// getValue("AddCaravan");
    String sAddBoats = "Yes";//getValue("AddBoats");
    String sAddAllRisk = "Yes";//getValue("AddAllRisk");
    String sAddContents = "Yes";//getValue("AddContents");
    String sAddBuilding = "Yes";//getValue("AddBuilding");
    String sAddElectronics = "Yes";//getValue("AddElectronics");

    String sUpVehicle = "Yes";




    public void searchPolicy(){
        try{
            Endorse_POM.Endorse_Factory();
            Thread.sleep(2000);
            click("btnHide","The Button is clicked");

            //selectValueFromDropdown("drpdwnRecentSelect","text","Policy","The Dropdown value is selected");
            click("drpdwnExpander","The Expander has been expanded");
            setText("txtPolicyNumber1",policyno,"The Policy number should be placed");
            //selectValueFromDropdown("drpdwnProductType","text","Idirect","The Product Type Should be selected");
            click("btnFind","The Find Button is selected");
            if(exists("linkNewProposal",true,"The Value should be present")) {
                wdriver.findElement(By.xpath("//li[@id='Policies']//following::li/a[contains(text(),'"+policyno+"/00')]")).click();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //GENERAL ENODRSEMENT PAGE
    public void generalEndorsement(){

        try {
            Endorse_POM.Endorse_Factory();
            if (exists("btnGeneralEndorsement",true,"The General Endorsement button is present")) {
                click("btnGeneralEndorsement", "The General Endorsement Button should be clicked");
            }
            //FOR ENDORSEMENT REASONS
            click("btnAdd","The Add Button was clicked");
            //selectValueFromDropdown("drpdwnStaffIndicator","text","Staff Member","The Staff Indicator should be selected");
            Thread.sleep(2000);
            selectValueFromDropdown("drpdwnCategory","text","Request by Carrier","The Category should be select");
            selectValueFromDropdown("drpdwnReason","text","Add a clause to the policy/item","The Reason should be selected");
            Thread.sleep(2000);
            setText("txtDescription","Endorsement for testing","The Endorsement Description is given");
            click("buttonupdate","The Update Button is clicked");
            click("btnNext","The Next button is clicked");
            if (exists("verfyDialogeBox",true,"Dialogue box should be appear")){
                click("clkOk","The Ok Button is clicked");
                //click("btnNext","The Next button is clicked");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //ENDORSING PART

    public void endorse() {
        Endorse_POM.Endorse_Factory();
        // lABEL VALUE FOR THE COVERS
        String lblVehicle ="";
        String lblMotorcycle ="";
        String lblCaravan ="";
        String lblBoats ="";
        String lblAllRisk ="";
        String lblContents ="";
        String lblBuilding ="";
        String lblElectronics ="";

        // GET VALUES FROM THE EXCEL SHEET





        String delVehicle = "No";
        String delMotorCycle = "No";
        String delCaravan = "No";
        String delContents="No";
        String delBuilding="No";
        String delAllrisk="No";
        String delBoats="No";
        String delElectronics="No";

        try{
            ArrayList<String> covers = new ArrayList<String>();

            //VEHICLE
            if (existsNoReport("verifyVehicle",true,"The Vehicle is present or not")){
                lblVehicle = getElement("verifyVehicle").getText();
                covers.add(lblVehicle.split("[ ]")[0]);
            }
            //MOTORCYCLE
            if (existsNoReport("verifyMotorcycle",true,"The Vehicle is present or not")){
                lblMotorcycle = getElement("verifyMotorcycle").getText();
                covers.add(lblMotorcycle.split("[ ]")[0]);
            }
            //CARAVAN
            if (existsNoReport("verifyCaravan",true,"The Vehicle is present or not")){
                lblCaravan = getElement("verifyCaravan").getText();
                covers.add(lblCaravan.split("[ ]")[0]);
            }
            //Property/Contents
            if (existsNoReport("verifyContents",true,"The Vehicle is present or not")){
                lblContents = getElement("verifyContents").getText();
                covers.add(lblContents.split("[ ]")[0]);
            }
            //Property/Buildings
            if (existsNoReport("verifyBuilding",true,"The Vehicle is present or not")){
                lblBuilding = getElement("verifyBuilding").getText();
                covers.add(lblBuilding.split("[ ]")[0]);
            }
            //ALLRISK
            if (existsNoReport("verifyLOBAllrisk",true,"The Vehicle is present or not")){
                lblAllRisk = getElement("verifyLOBAllrisk").getText();
                covers.add(lblAllRisk.split("[ ]")[0]);
            }
            //BOATS
            if (existsNoReport("verifyLOBBoats",true,"The Vehicle is present or not")){
                lblBoats = getElement("verifyLOBBoats").getText();
                covers.add(lblBoats.split("[ ]")[0]);
            }
            //ELECTRONICS
            if (existsNoReport("verifyLOBEE",true,"The Vehicle is present or not")){
                lblElectronics = getElement("verifyLOBEE").getText();
                covers.add(lblElectronics.split("[ ]")[0]);
            }

            System.err.println(covers);

            for (String i :covers){
                System.err.println(i);
                switch (i){
                    case"Vehicle":
                        if (exists("verifyVehicle",true,"The Vehicle is verifed")){
                            wdriver.findElement(By.xpath("//span[text()='Vehicle Comprehensive']//preceding::td//following::span[text()='ABARTH 500/695TBA']")).click();
                            if(delVehicle.equalsIgnoreCase("Yes")){
                                delete();
                            }else if (sAddVehicle.equalsIgnoreCase("Yes")){
                                //want to add the vehicle for vehicle
                                System.out.println("its working Vehicle");
                                business();
                                new Absa_Idirect_Multi(wdriver,test).motorCarLog("Vehicle");
                            }else if (sUpVehicle.equalsIgnoreCase("Yes")){
                                business();
                                motorCarLog("Vehicle");
                            }
                        }
                        break;
                    case"Motorcycle":
                        if (exists("verifyMotorcycle",true,"The Vehicle is verifed")){
                            wdriver.findElement(By.xpath("//span[text()='Motorcycle Comprehensive']//preceding::td//following::span[text()='ARORA XL567890']")).click();
                            if(delMotorCycle.equalsIgnoreCase("Yes")){
                                delete();
                            }else if (sAddMotorcycle.equalsIgnoreCase("Yes")){
                                //want to add the motorcycle for vehicle
                                System.out.println("its working Motorcycle");
                                new Absa_Idirect_Multi(wdriver,test).motorCarLog("Vehicle");
                            }
                        }
                        break;
                    case"Caravan/Trailer":
                        if (exists("verifyCaravan",true,"The Vehicle is verifed")){
                            wdriver.findElement(By.xpath("//span[text()='Vehicle Comprehensive']//preceding::td//following::span[text()='ABARTH 500/695TBA']")).click();
                            if(delCaravan.equalsIgnoreCase("Yes")){
                                delete();
                            }else if (sAddCaravan.equalsIgnoreCase("Yes")){
                                //want to add the caravan for vehicle
                                System.out.println("its working Caravan");
                            }
                        }
                        break;
                    case"Contents":
                        if (exists("verifyContents",true,"The Vehicle is verifed")){
                            wdriver.findElement(By.xpath("//span[text()='Vehicle Comprehensive']//preceding::td//following::span[text()='ABARTH 500/695TBA']")).click();
                            if(delContents.equalsIgnoreCase("Yes")){
                                delete();
                            }else if (sAddContents.equalsIgnoreCase("Yes")){
                                //want to add the contents for vehicle
                                System.out.println("its working Contents");
                            }
                        }
                        break;
                    case"Building":
                        if (exists("verifyBuilding",true,"The Vehicle is verifed")){
                            wdriver.findElement(By.xpath("//span[text()='Vehicle Comprehensive']//preceding::td//following::span[text()='ABARTH 500/695TBA']")).click();
                            if(delBuilding.equalsIgnoreCase("Yes")){
                                delete();
                            }else if (sAddBuilding.equalsIgnoreCase("Yes")){
                                //want to add the Building for vehicle
                                System.out.println("its working Building");
                            }
                        }
                        break;
                    case"All":
                        if (exists("verifyLOBAllrisk",true,"The Vehicle is verifed")){
                            wdriver.findElement(By.xpath("//span[text()='Vehicle Comprehensive']//preceding::td//following::span[text()='ABARTH 500/695TBA']")).click();
                            if(delAllrisk.equalsIgnoreCase("Yes")){
                                delete();
                            }else if (sAddAllRisk.equalsIgnoreCase("Yes")){
                                //want to add the AllRisk for vehicle
                                System.out.println("its working All risk");
                            }
                        }
                        break;
                    case"Boats":
                        if (exists("verifyLOBBoats",true,"The Vehicle is verifed")){
                            wdriver.findElement(By.xpath("//span[text()='Vehicle Comprehensive']//preceding::td//following::span[text()='ABARTH 500/695TBA']")).click();
                            if(delBoats.equalsIgnoreCase("Yes")){
                                delete();
                            }else if (sAddBoats.equalsIgnoreCase("Yes")){
                                //want to add the Boats for vehicle
                                System.out.println("its working Boats");
                            }
                        }
                        break;
                    case"Electronic":
                        if (exists("verifyLOBEE",true,"The Vehicle is verifed")){
                            wdriver.findElement(By.xpath("//span[text()='Vehicle Comprehensive']//preceding::td//following::span[text()='ABARTH 500/695TBA']")).click();
                            if(delElectronics.equalsIgnoreCase("Yes")){
                                delete();
                            }else if (sAddElectronics.equalsIgnoreCase("Yes")){
                                //want to add the Electronic for vehicle
                                System.out.println("its working Electronics");
                            }
                        }
                        break;


                }
            }



        }catch(Exception e){
            e.printStackTrace();
        }
    }
    //To delete the covers
    public void delete(){
        try{
            click("btnDelete","The Delete Button is clicked");
            if (exists("basicNotification",true,"the Dialoguue Box is present")){
                click("btnOkay","The Okay Button is clicked");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /*
    * To Start The Business Uses
    *
    *
     */
    public void business(){

        try{
            //selectValueFromList("listLineOfBusiness", value, "Select Line of Business/Locations/Risk Object");
            Thread.sleep(2000);
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
    /*
     *CLOSEBUSINESS METHOD
     * IT ACTS AS AFTER METHOD WHICH RUNS AFTER EVERY COVER ADDED
     */

    public void closeBusiness(){

        try{

            System.err.print(underwriting1);
            if (existsNoReport("btnEndCoversSelection", true, "Underwriting Screen Exists")) {
                click("btnEndCoversSelection", "Click End Covers Selection");
                //click("btnFinish&Next","Click Next Button");
            }
            Thread.sleep(3000);

//method to approve UNDERWRITING
            if (vehicleCover.equalsIgnoreCase("Motorcar")) {
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


                if (existsNoReport("labelPayments", true, "Payments Screen Exists")) {
                    logger.info("Policy Lines Of Business Details Captured Successfully");
                }
            }

        } catch (Exception e) {
            logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
        }

    }

    /*
     *MotorCarLog
     * contains scripts for vehicle,motorcycle and caravan/trailer
     * Give the value which needs to be run in multiverse class
     */
    public void motorCarLog(String value) {

        try {

            if (exists("labelMotorRiskObjectDetails", true, "Insured General Details Exists")) {
                //Identifiers
                Thread.sleep(1000);
                //click("labelEngine", "Click Vehicle ID No/Chassis No");
                //setText("txtBoxVehicleID", vehicleID, "Enter Vehicle ID No/Chassis No");
                //click("btnIdentifierUpdate", "Click Update Button");
                //Risk Address
                if (exists("checkRiskDetails",true,"The Risk Details is checked")) {
                    click("chkBoxIsRiskAddSameAsPhysical", "Click Is Risk Address Same As Physical Address? CheckBox");
                }
                click("chkBoxIsWorkAddSameAsRisk", "Click Is Work Address Same As Risk Address? CheckBox");
                if (exists("checkCoverdetails",true,"The Covers details are selected")) {
                    selectValueFromDropdown("drpDwnWhatToInsure", "text", value, "Select What Do You Want To Insure Dropdown");
                }
                if (value.equalsIgnoreCase("Vehicle")){
                    vehicle();
                }else if (value.equalsIgnoreCase("Motorcycle")){
                    motorcycle();
                }else if (value.equalsIgnoreCase("Caravan / Trailer")){
                    caravan();
                }

            }
            click("btnNext", "Click Next Button");
            if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                logger.info("Motorcar - " + value + " Details Captured Successfully");
            }


        } catch (Exception e) {
            logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
        }

    }

    public void vehicle(){
        try{

            if (exists("verifydrpDwnVehicleUsedFor",true,"The Value is verified")) {
                selectValueFromDropdown("drpDwnVehicleUsedFor", "text", vehicleUsedFor, "Select Vehicle Be Used For ? Dropdown");
            }
            if (exists("verifydrpDwnYearOfManufacture",true,"The Value is verified")) {
                selectValueFromDropdown("drpDwnYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture Dropdown");
            }
            selectValueFromDropdown("drpDwnMake", "text", make, "Select Make Dropdown");
            selectValueFromDropdown("drpDwnModelVariant", "text", modelVariant, "Select Model Variant Dropdown");
            //  selectValueFromDropdown("drpDwnYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture Dropdown");
            selectValueFromDropdown("drpDwnInsuredForRetailOrCustom", "text", insuredForRetailOrCustom, "Select Insured For Retail Or Custom ? Dropdown");
            setText("txtVehicleMileage", "20", "The Vehicle mileage was added");
            if (motorFinance.equalsIgnoreCase("Y")) {
                click("chBoxFinance", "The Check Box should be clicked");
                selectValueFromDropdown("drpDwnFinance", "text", financeCompany, "The Finance Company name should be clicked");
            }
            selectValueFromDropdown("drpFlat", "text", BusinessContentsFlatExcess, "The Flat value is selected");
            click("chkBoxImmobiliser", "Click Immobiliser CheckBox");
            selectValueFromDropdown("drpDwnImmobiliserMake", "text", immobiliserMake, "Select Immobiliser Make Dropdown");
//Registered Owner Details
            selectValueFromDropdown("drpDwnRegisteredOwner", "text", registeredOwner, "Select Registered Owner");
            //Driver Details
            selectValueFromDropdown("drpDwnRegularDriver", "text", regularDriver, "Select Regular Driver");

            selectValueFromDropdown("drpDwnDriverLicenseType", "text", driverLicenseType, "Select Regular Driver License Type Dropdown");

            click("chkBoxIsVehicleRegInSouthAfrica", "Click Is Vehicle Registered In South Africa ? CheckBox");
        }  catch  (Exception e) {
            logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
        }
    }

    public void motorcycle(){
        try{
            selectValueFromDropdown("drpDwnVehicleParkDuringDay", "text", MovehicleParkDuringDay, "Select Vehicle Park During Day ? Dropdown");
            selectValueFromDropdown("drpDwnDayTimeParkingCovered", "text", ModayTimeParkingCovered, "Select Day Time Parking Covered ? Dropdown");
            selectValueFromDropdown("drpDwnDayTimeParkingLocked", "text", ModayTimeParkingLocked, "Select Day Time Parking Locked ? Dropdown");
            selectValueFromDropdown("drpDwnVehicleParkDuringNight", "text", MovehicleParkDuringNight, "Select Vehicle Park During Night ? Dropdown");
            selectValueFromDropdown("drpDwnNightTimeParkingCovered", "text", MonightTimeParkingCovered, "Select Night Time Parking Covered ? Dropdown");
            selectValueFromDropdown("drpDwnNightTimeParkingLocked", "text", MonightTimeParkingLocked, "Select Night Time Parking Locked ? Dropdown");
            selectValueFromDropdown("drpDwnVehicleUsedFor", "text", vehicleUsedFor, "Select Vehicle Be Used For ? Dropdown");

            selectValueFromDropdown("drpDwnYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture Dropdown");
            selectValueFromDropdown("drpDwnMake", "text", motorCycleMake, "Select Make Dropdown");
            selectValueFromDropdown("drpDwnModelVariant", "text", motorCycleModelVariant, "Select Model Variant Dropdown");
            selectValueFromDropdown("drpDwnInsuredForRetailOrCustom", "text", insuredForRetailOrCustom, "Select Insured For Retail Or Custom ? Dropdown");
            setText("txtVehicleMileage", "10", "The Vehicle mileage was added");
            if (motorFinance.equalsIgnoreCase("Y")) {
                click("chBoxFinance", "The Check Box should be clicked");
                selectValueFromDropdown("drpDwnFinance", "text", financeCompany, "The Finance Company name should be clicked");
            }

            selectValueFromDropdown("drpMotorcycleFlat", "text", "2250", "The Flat value is selected");

            click("chkBoxImmobiliser", "Click Immobiliser CheckBox");
            selectValueFromDropdown("drpDwnImmobiliserMake", "text", immobiliserMake, "Select Immobiliser Make Dropdown");


            //Registered Owner Details
            selectValueFromDropdown("drpDwnRegisteredOwner", "text", registeredOwner, "Select Registered Owner");
            //Driver Details
            selectValueFromDropdown("drpDwnRegularDriver", "text", regularDriver, "Select Regular Driver");

            selectValueFromDropdown("drpDwnDriverLicenseType", "text", "Drivers License Code A", "Select Regular Driver License Type Dropdown");

            selectValueFromDropdown("drpDwnDrivingCertificate", "text", drivingCertificate, "Select Defensive Driving Certificate Dropdown");

            click("chkBoxIsVehicleRegInSouthAfrica", "Click Is Vehicle Registered In South Africa ? CheckBox");
        }catch  (Exception e) {
            logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
        }
    }
    public void caravan (){
        try{
            //Caravan/Trailer General Details
            selectValueFromDropdown("drpDwnItemType", "text", itemType, "Select Item Type Dropdown");
            selectValueFromDropdown("drpDwnVehicleParkDuringNight", "text", vehicleParkDuringNight, "Select Vehicle Park During Night ? Dropdown");
            selectValueFromDropdown("drpDwnVehicleUsedFor", "text", CaravanUsedfor, "Select Vehicle Be Used For ? Dropdown");
            click("chkBoxIsCarvanParkUnderNet", "Click Is Carvan Parked Under Hail");
            setText("txtBoxMakeModelCaravan", CaravanMake, "Enter Make/Model");
            setText("txtBoxCaravanInsuredValue", CaravanInsuranceAmount, "Enter Caravan Insured Value");
            selectValueFromDropdown("drpDwnYearOfManufactureCaravan", "text", yearOfManufacture, "Select Caravan Year Of Manufacture Dropdown");
            selectValueFromDropdown("drpCaravanFlat", "text", "1000", "The Caravan Value was selected");
        }catch  (Exception e) {
            logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
        }
    }



}
