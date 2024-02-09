package sapiens.policies.Idirect_Endorsement;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import sapiens.policies.Idirect.Absa_Idirect_Multi;
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
    String policyno =getValue("PolicyNumber");//"PL-IDI6529635091";
    String category= getValue("EndorseCategory");
    String reason = getValue("EndorseReason");

    String insuranceAmount = getValue("Insurance_Amount");
    String collectionMethod = getValue("Collection_Method");
    String paymentTerms = getValue("Payment_Terms");
    String preferredDueDay = getValue("Preferred_DueDay");
    String decision = getValue("Decision");
    String policyBankAccount = getValue("Policy_BankAccount");
    String buildingUsedFor = getValue("Building_UsedFor");
    String typeOfBuilding = getValue("Type_Of_Building");
    String typeOfArea = getValue("Type_Of_Area");
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
    String alarmInstalled = getValue("Alarm_Installed");
    String burglarBarsMainDwelling = getValue("BurglarBarsMainDwelling");
    String externalDoorMainDwelling = getValue("ExternalDoorMainDwelling");
    String burglarBarsOutbuilding = getValue("BurglarBarsOutbuilding");
    String externalDoorOutbuilding = getValue("ExternalDoorOutbuilding");


    //For Vehicle
    String vehicleUsedFor = getValue("VehicleUsedFor");
    String make = getValue("Make");
    String yearOfManufacture = getValue("YearOfManufacture");
    String insuredForRetailOrCustom = getValue("InsuredForRetailOrCustom");
    String immobiliserMake = getValue("Immobiliser_Make");
    String regularDriver = getValue("Regular_Driver");
    String driverLicenseType = getValue("DriverLicenseType");
    String drivingCertificate = getValue("Driving_Certificate");
    String itemType = getValue("Item_Type");
    String CaravanMake = getValue("caravanMake");
    String CaravanUsedfor =getValue("caravanUsedFor");
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
    String boatStoredWhenNotInUse = getValue("BoatStoredWhenNotInUse");
    String hullCode = getValue("Hull_Code");
    String boatSpeed = getValue("Boat_Speed");
    String inboardSumInsured = getValue("InboardSumInsured");
    String territorialLetterProvided = getValue("Territorial_Letter_Provided");
    String territorialCountries = getValue("Territorial_Countries");
    String financeCompany = getValue("Finance_Company");
    String financeAgreementNumber = getValue("FinanceAgreementNumber");
    String uninterruptedWatercraftInsurance = getValue("UninterruptedWatercraftInsurance");
    String claimsInPast12Months = getValue("Claims_In_Past_12_Months");
    String claimsInPast24Months = getValue("Claims_In_Past_24_Months");
    String claimsInPast36Months = getValue("Claims_In_Past_36_Months");
    String itemForBusinessPurpose = getValue("ItemForBusinessPurpose");
    String affinity = getValue("Affinity");
    String staffIndicator = getValue("Staff_Indicator");
    String PropertyOccupiedDay = getValue("occupied_during_day");
    String ResidentialProperty = getValue("Does_the_property_border");
    String xn_residental_property = getValue("Specify Xn residental property");
    String thatchedfloor_area = getValue("Thatched Lapa hut floor area");
    String SizeOfLapaExceed = getValue("Does the Size of Lapa");
    String SabsaApproved = getValue("Do you have a SABS");
    String BusinessFullDescription = getValue("Please_provide_a_full_description");
    String CompulsoryExcess = getValue("Compulsoryexcess");
    String NoOfClaim12Months = getValue("Number of claims or losses in the past 12 months");
    String Is13To24Months = getValue("Number of claims or losses in the past 13 to 24 months");
    String NoOfClaimPast25To36Months = getValue("Number of claims or losses in the past 25 to 36 months");
    String NotesBuilding = getValue("Notes Building");
    String BusinessContentsFlatExcess = getValue("businessContentsFlatExcess");
    String underwriting1 = getValue("Underwriting1");
    String policy_renewal_period = getValue("Policy_Renewal_Period");
    String vehicleCover = getValue("CoverType");
    String testcaseName;


    //To Decide which one needs to run
    String sAddVehicle = getValue("AddVehicle");
    String sAddMotorcycle = getValue("AddMotorcycle");
    String sAddCaravan =getValue("AddCaravan");
    String sAddBoats =getValue("AddBoats");
    String sAddAllRisk =getValue("AddAllrisk");
    String sAddContents =getValue("AddContents");
    String sAddBuilding =getValue("AddBuilding");
    String sAddElectronics =getValue("AddElectronics");

    String sUpVehicle = getValue("UpVehicle");
    String sUpMotorCycle = getValue("UpMotorCycle");
    String sUpCaravan=getValue("UpCaravan");
    String sUpContents=getValue("UpContents");
    String sUpBuilding=getValue("UpBuilding");
    String sUpAllRisk=getValue("UpAllRisk");
    String sUpElectronic=getValue("UpElectronics");
    String sUpBoats=getValue("UpBoats");

    String delVehicle = getValue("DelVehicle");
    String delMotorCycle = getValue("DelMotorCycle");
    String delCaravan = getValue("DelCaravan");
    String delContents=getValue("DelContents");
    String delBuilding=getValue("DelBuilding");
    String delAllrisk=getValue("DelAllRisk");
    String delBoats=getValue("DelBoats");
    String delElectronics=getValue("DelElectronics");




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
                wdriver.findElement(By.xpath("//li[@id='Policies']//following::li/a[contains(text(),'"+policyno+"')]")).click();
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
            selectValueFromDropdown("drpdwnCategory","text",category,"The Category should be select");
            selectValueFromDropdown("drpdwnReason","text",reason,"The Reason should be selected");
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
//MADE CHANGES FOR THE THIRD COMMIT ON THIS METHOD

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
                        if (existsNoReport("verifyVehicle",true,"The Vehicle is verifed")){

                            if(delVehicle.equalsIgnoreCase("Yes")){
                                //For Deleting Vehicle
                                wdriver.findElement(By.xpath("//span[text()='Vehicle Comprehensive']/preceding::span[1]")).click();
                                delete();
                            }if (sAddVehicle.equalsIgnoreCase("Yes")){
                                //For Adding New Vehicle
                                System.out.println("its working Vehicle Adding");
                                lobList("Motorcar");
                                business();
                                new Absa_Idirect_Multi(wdriver,test).motorCarLog("Vehicle");
                                closeBusiness();
                            }if (sUpVehicle.equalsIgnoreCase("Yes")){
                                wdriver.findElement(By.xpath("//span[text()='Vehicle Comprehensive']/preceding::span[1]")).click();
                                //For updating Vehicle
                                business();
                                motorCarLog("Vehicle");
                                closeBusiness();
                            }
                            
                        }
                        break;
                    case"Motorcycle":
                        if (existsNoReport("verifyMotorcycle",true,"The Motorcycle is verifed")){
                            wdriver.findElement(By.xpath("//span[text()='Motorcycle Comprehensive']/preceding::span[1]")).click();
                            if(delMotorCycle.equalsIgnoreCase("Yes")){
                                delete();
                            }if (sAddMotorcycle.equalsIgnoreCase("Yes")){
                                //want to add the motorcycle for vehicle
                                System.out.println("its working Motorcycle");
                                lobList("Motorcar");
                                business();
                                new Absa_Idirect_Multi(wdriver,test).motorCarLog("Motorcycle");
                                closeBusiness();
                            }if (sUpMotorCycle.equalsIgnoreCase("Yes")){
                                business();
                                motorCarLog("Motorcycle");
                                closeBusiness();
                            }

                        }
                        break;
                    case"Caravan/Trailer":
                        if (existsNoReport("verifyCaravan",true,"The Caravan is verifed")){

                            if(delCaravan.equalsIgnoreCase("Yes")){
                                delete();
                            }if (sAddCaravan.equalsIgnoreCase("Yes")){
                                //want to add the caravan for vehicle
                                System.out.println("its working Caravan");
                                lobList("Motorcar");
                                business();
                                new Absa_Idirect_Multi(wdriver,test).motorCarLog("Caravan / Trailer");
                                closeBusiness();
                            }if (sUpCaravan.equalsIgnoreCase("Yes")){
                                business();
                                motorCarLog("Caravan / Trailer");
                                closeBusiness();
                            }

                        }
                        break;
                    case"Contents":
                        if (existsNoReport("verifyContents",true,"The Contents is verifed")){
                            if(delContents.equalsIgnoreCase("Yes")){
                                wdriver.findElement(By.xpath("//span[text()='Contents']/preceding::span[1]")).click();
                                delete();
                            }if (sAddContents.equalsIgnoreCase("Yes")){
                                //want to add the contents for vehicle
                                System.out.println("its working Contents");
                                lobList("Property");
                                business();
                                new Absa_Idirect_Multi(wdriver,test).propertyLog("Contents");
                                closeBusiness();
                            }if (sUpContents.equalsIgnoreCase("Yes")){
                                wdriver.findElement(By.xpath("//span[text()='Contents']/preceding::span[1]")).click();
                                business();
                                propertyLog("Contents");
                                closeBusiness();

                            }

                        }
                        break;
                    case"Building":
                        if (existsNoReport("verifyBuilding",true,"The Vehicle is verifed")){

                            if(delBuilding.equalsIgnoreCase("Yes")){
                                wdriver.findElement(By.xpath("//span[text()='Building']/preceding::span[1]")).click();
                                delete();
                            }if (sAddBuilding.equalsIgnoreCase("Yes")){
                                //want to add the Building for vehicle
                                System.out.println("its working Building");
                                lobList("Property");
                                business();
                                new Absa_Idirect_Multi(wdriver,test).propertyLog("Building");
                                closeBusiness();
                            }if (sUpBuilding.equalsIgnoreCase("Yes")){
                                wdriver.findElement(By.xpath("//span[text()='Building']/preceding::span[1]")).click();
                                business();
                                propertyLog("Building");
                                closeBusiness();
                            }

                        }
                        break;
                    case"All":
                        if (existsNoReport("verifyLOBAllrisk",true,"The AllRisk is verifed")){

                            if(delAllrisk.equalsIgnoreCase("Yes")){
                                wdriver.findElement(By.xpath("//span[text()='All Risk Cover']/preceding::span[1]")).click();
                                delete();
                            }if (sAddAllRisk.equalsIgnoreCase("Yes")){
                                //want to add the AllRisk for vehicle
                                System.out.println("its working All risk");
                                lobList("");
                                business();
                                new Absa_Idirect_Multi(wdriver,test).allRisk();
                                closeBusiness();
                            }if (sUpAllRisk.equalsIgnoreCase("Yes")){
                                wdriver.findElement(By.xpath("//span[text()='All Risk Cover']/preceding::span[1]")).click();
                                //For updating Vehicle
                                business();
                                allRisk();
                                closeBusiness();
                            }

                        }
                        break;
                    case"Boats":
                        if (existsNoReport("verifyLOBBoats",true,"The Boats is verifed")){

                            if(delBoats.equalsIgnoreCase("Yes")){
                                wdriver.findElement(By.xpath("///span[text()='Boats Comprehensive']/preceding::span[1]")).click();
                                delete();
                            }if (sAddBoats.equalsIgnoreCase("Yes")){
                                //want to add the Boats for vehicle
                                System.out.println("its working Boats");
                                lobList("");
                                business();
                                new Absa_Idirect_Multi(wdriver,test).boats();
                                closeBusiness();
                            }if (sUpBoats.equalsIgnoreCase("Yes")){
                                wdriver.findElement(By.xpath("///span[text()='Boats Comprehensive']/preceding::span[1]")).click();
                                business();
                                boats();
                                closeBusiness();
                            }

                        }
                        break;
                    case"Electronic":
                        if (existsNoReport("verifyLOBEE",true,"The Electronic Equipment is verifed")){

                            if(delElectronics.equalsIgnoreCase("Yes")){
                                wdriver.findElement(By.xpath("//span[text()='Electronic Equipment - Material Damage']/preceding::span[1]")).click();
                                delete();
                            }if (sAddElectronics.equalsIgnoreCase("Yes")){
                                //want to add the Electronic for vehicle
                                System.out.println("its working Electronics");
                                lobList("");
                                business();
                                new Absa_Idirect_Multi(wdriver,test).electronicEquipment();
                                closeBusiness();
                            }if (sUpElectronic.equalsIgnoreCase("Yes")){
                                wdriver.findElement(By.xpath("//span[text()='Electronic Equipment - Material Damage']/preceding::span[1]")).click();
                                business();
                                electronicEquipment();
                                closeBusiness();
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
            Thread.sleep(2000);
            jsClick("btnDelete","The Delete Button is clicked");
            if (existsNoReport("basicNotification",true,"the Dialoguue Box is present")){
                jsClick("btnOkay","The Okay Button is clicked");
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

            Thread.sleep(2000);
            click("btnUpdate", "Click Update");
            if (existsNoReport("labelClauses", true, "Clauses Screen Exists")) {
                click("btnNext", "Click Next");
                if (exists("labelCustomerRiskObjectNumber", true, "Search by Customer Risk Object Number Exists")) {
                    click("btnAddLocationsRiskObjects", "Click Add Button");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
        }

    }
    public void lobList(String lob){
        wdriver.findElement(By.xpath("//span[text()='" + lob + "']")).click();
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
            if (existsNoReport("btnEndRiskDetails",true,"The end risk details are present")) {
                click("btnEndRiskDetails", "Click End Risk Details Button");
            }
//method to approve UNDERWRITING

            if (existsNoReport("labelUWContains", true, "Underwriting Screen Exists")) {
                logger.info("Under writing alert is present");
                if (existsNoReport("labelUWNumberOfDropdown4", true, "Underwriting Dropdown Exists")) {
                    logger.info("Under writing Four dropdown is present");
                    selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert dropdown 1");
                    selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert dropdown 2");
                    selectValueFromDropdown("drpDwnUWValidation3", "text", underwriting1, "Select UW alert dropdown 3");
                    selectValueFromDropdown("drpDwnUWValidation4", "text", underwriting1, "Select UW alert dropdown 4");
                    click("btnUWNext", "Select Next button");
                }else if (existsNoReport("labelUWNumberOfDropdown3", true, "Underwriting Dropdown Exists")) {
                        logger.info("Under writing three dropdown is present");
                        selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert dropdown 1");
                        selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert dropdown 2");
                        selectValueFromDropdown("drpDwnUWValidation3", "text", underwriting1, "Select UW alert dropdown 3");
                        click("btnUWNext", "Select Next button");
                }else if (existsNoReport("labelUWNumberOfDropdown2", true, "Underwriting Dropdown Exists")) {
                    logger.info("Under writing two dropdown is present");
                    selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                    selectValueFromDropdown("drpDwnUWValidation2", "text", underwriting1, "Select UW alert");
                    click("btnUWNext", "Select Next button");
                } else if (existsNoReport("labelUWNumberOfDropdown1", true, "Underwriting Dropdown Exists")) {
                    logger.info("Under writing one dropdown is present");
                    selectValueFromDropdown("drpDwnUWValidation", "text", underwriting1, "Select UW alert");
                    click("btnUWNext", "Select Next button");
                }
            }

            //click("btnEndRiskDetails", "Click End Risk Details Button");
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

    public String paymentsDetails() {

       Endorse_POM.Endorse_Factory();

        String[] policyNumber = new String[0];

        try {
            if (existsNoReport("labelPayments", true, "Payments Screen Exists")) {
                //Payments

                if (existsNoReport("verifyDrpDwnCollectionMethod", true, "The Collection method is verified")) {
                    selectValueFromDropdown("drpDwnCollectionMethod", "text", collectionMethod, "Select Collection Method");
                }

                if (existsNoReport("verifyDrpDwnPaymentTerms", true, "The Payments Terms is verified")) {
                    selectValueFromDropdown("drpDwnPaymentTerms", "text", paymentTerms, "Select Payment Terms");
                }
                if (existsNoReport("verifyDrpDwnPreferredDueDay", true, "The PreferdDueDay is verified")) {
                    selectValueFromDropdown("drpDwnPreferredDueDay", "text", preferredDueDay, "Select Preferred Due Day");
                }
                //Decision
                if (existsNoReport("verifyDrpDwnDecision", true, "The Decision is verified")){
                    selectValueFromDropdown("drpDwnDecision", "text", decision, "Select Decision");
                //Reason
                selectValueFromDropdown("drpDwnReason", "text", reason, "Select Reason from the dropDwnn");
                }
                //Screening progress
//                if (exists("",true,"")) {
//                    click("chkBoxSanctionScreen", "Click Sanction Screen Completed CheckBox");
//                }

                click("btnNext", "Click Next");
//                if (existsNoReport("dialogBasicNotification", true, "GD1000079 Popup")) {
//                    click("btnDialogOK", "Click OK Button");
//                    click("btnNext", "Click Next");
//                }
                if (existsNoReport("verifyChBoxBank",true,"Verify the Bank is checked or Not")) {
                    click("chBoxBank", "The value must be check to proceed with the bank");
                    Thread.sleep(2000);
                    //Bank Account Details for <Contact>
                    selectValueFromDropdown("drpDwnPolicyBankAccount", "text", policyBankAccount, "Select Bank Account Number");
                }

                    click("btnFinish", "Click Finish Button");
                    click("btnFinish", "Click Finish Button");

                    String Policy = "";
                    if (exists("dBox", true, "The Value is selected")) {
                        Policy = getText("PolicyNum", "The Element should be visible");
                        click("btnOk", "The Value is selected");
                    }
                    writeExcel(Policy,testcaseName);

                    if (existsNoReport("labelMaintainEvent", true, "Maintains Event Exists")) {
                        logger.info("Policy Payments Details Captured Successfully");
                        if (exists("labelUnknownAddressee", true, "The Label is visible")) {
                            click("labelUnknownAddressee", "Click Unknown Addressee");
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
        } catch (Exception e) {
            logger.info("Exception in Policy Payment Details is : " + e);
        }
        return policyNumber[1];
    }

    /*
     *MotorCarLog
     * contains scripts for vehicle,motorcycle and caravan/trailer
     * Give the value which needs to be run in multiverse class
     */
    public void motorCarLog(String value) {

        try {

            if (existsNoReport("labelMotorRiskObjectDetails", true, "Insured General Details Exists")) {
                //Identifiers
                Thread.sleep(1000);
                //click("labelEngine", "Click Vehicle ID No/Chassis No");
                //setText("txtBoxVehicleID", vehicleID, "Enter Vehicle ID No/Chassis No");
                //click("btnIdentifierUpdate", "Click Update Button");
                //Risk Address
                if (existsNoReport("checkRiskDetails",true,"The Risk Details is checked")) {
                    click("chkBoxIsRiskAddSameAsPhysical", "Click Is Risk Address Same As Physical Address? CheckBox");
                }
                click("chkBoxIsWorkAddSameAsRisk", "Click Is Work Address Same As Risk Address? CheckBox");
                if (existsNoReport("checkCoverdetails",true,"The Covers details are selected")) {
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
            if (existsNoReport("labelCoverSelection", true, "Cover Selection Exists")) {
                logger.info("Motorcar - " + value + " Details Captured Successfully");
            }


        } catch (Exception e) {
            logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
        }

    }

    public void vehicle(){
        try{

            if (existsNoReport("verifydrpDwnVehicleUsedFor",true,"The Value is verified")) {
                selectValueFromDropdown("drpDwnVehicleUsedFor", "text", vehicleUsedFor, "Select Vehicle Be Used For ? Dropdown");
            }
            if (existsNoReport("verifydrpDwnYearOfManufacture",true,"The Vehicle Manufacture is verified")) {
                selectValueFromDropdown("drpDwnYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture Dropdown");
            }
            if (existsNoReport("verifydrpDwnMake",true,"The Vehicle Make is verified")) {
                selectValueFromDropdown("drpDwnMake", "text", make, "Select Make Dropdown");
            }
            //selectValueFromDropdown("drpDwnModelVariant", "text", modelVariant, "Select Model Variant Dropdown");
            //  selectValueFromDropdown("drpDwnYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture Dropdown");
            if (existsNoReport("",true,"The Insured Detaisl is verifed")) {
                selectValueFromDropdown("drpDwnInsuredForRetailOrCustom", "text", insuredForRetailOrCustom, "Select Insured For Retail Or Custom ? Dropdown");
            }
            //setText("txtVehicleMileage", "20", "The Vehicle mileage was added");
            if (existsNoReport("verifychBoxFinance",true,"The Finance is verifed")) {
                click("chBoxFinance", "The Check Box should be clicked");
                selectValueFromDropdown("drpDwnFinance", "text", financeCompany, "The Finance Company name should be clicked");
            }
            if (existsNoReport("verifydrpFlat",true,"The Flat value is verified")) {
                selectValueFromDropdown("drpFlat", "text", BusinessContentsFlatExcess, "The Flat value is selected");
            }
            if (existsNoReport("verifychkBoxImmobiliser",true,"the Immobilizer value is verifed")){
                click("chkBoxImmobiliser", "Click Immobiliser CheckBox");
                selectValueFromDropdown("drpDwnImmobiliserMake", "text", immobiliserMake, "Select Immobiliser Make Dropdown");
            }

//Registered Owner Details
            if (existsNoReport("verifydrpDwnRegisteredOwner",true,"The Register Owner is verifed")) {
                selectValueFromDropdown("drpDwnRegisteredOwner", "text", registeredOwner, "Select Registered Owner");
            }
            //Driver Details
            if (existsNoReport("verifydrpDwnRegularDriver",true,"The Register Owner is verifed")) {
                selectValueFromDropdown("drpDwnRegularDriver", "text", regularDriver, "Select Regular Driver");
            }if (existsNoReport("verifydrpDwnDriverLicenseType",true,"The Register Owner is verifed")) {
                selectValueFromDropdown("drpDwnDriverLicenseType", "text", driverLicenseType, "Select Regular Driver License Type Dropdown");
            }
            if (existsNoReport("",true,"The For vehicle register in SouthAfrica"))
            click("chkBoxIsVehicleRegInSouthAfrica", "Click Is Vehicle Registered In South Africa ? CheckBox");
        }  catch  (Exception e) {
            logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
        }
    }

    public void motorcycle(){
        try {
            /*
            selectValueFromDropdown("drpDwnVehicleParkDuringDay", "text", MovehicleParkDuringDay, "Select Vehicle Park During Day ? Dropdown");
            selectValueFromDropdown("drpDwnDayTimeParkingCovered", "text", ModayTimeParkingCovered, "Select Day Time Parking Covered ? Dropdown");
            selectValueFromDropdown("drpDwnDayTimeParkingLocked", "text", ModayTimeParkingLocked, "Select Day Time Parking Locked ? Dropdown");
            selectValueFromDropdown("drpDwnVehicleParkDuringNight", "text", MovehicleParkDuringNight, "Select Vehicle Park During Night ? Dropdown");
            selectValueFromDropdown("drpDwnNightTimeParkingCovered", "text", MonightTimeParkingCovered, "Select Night Time Parking Covered ? Dropdown");
            selectValueFromDropdown("drpDwnNightTimeParkingLocked", "text", MonightTimeParkingLocked, "Select Night Time Parking Locked ? Dropdown");



             */if (existsNoReport("",true,"The MotorCycle used for is verified")) {
                selectValueFromDropdown("drpDwnVehicleUsedFor", "text", vehicleUsedFor, "Select Vehicle Be Used For ? Dropdown");
            }
            if (existsNoReport("verifydrpDwnYearOfManufacture", true, "The Year of Manufacture for MotorCycle")) {
                selectValueFromDropdown("drpDwnYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture Dropdown");
            }
            if (existsNoReport("verifydrpDwnMake", true, "The Make for MotorCycle")) {
                selectValueFromDropdown("drpDwnMake", "text", motorCycleMake, "Select Make Dropdown");
            }
            if (existsNoReport("verifydrpDwnModelVariant", true, "The Model for MotorCycle")) {
                selectValueFromDropdown("drpDwnModelVariant", "text", motorCycleModelVariant, "Select Model Variant Dropdown");
            }
            if (existsNoReport("verifydrpDwnInsuredForRetailOrCustom", true, "The Insured Retail and Custom for MotorCycle")) {
                selectValueFromDropdown("drpDwnInsuredForRetailOrCustom", "text", insuredForRetailOrCustom, "Select Insured For Retail Or Custom ? Dropdown");
            }
            //setText("txtVehicleMileage", "10", "The Vehicle mileage was added");
            if (existsNoReport("verifychBoxFinance", true, "The MotorCycle Finance is verified")) {
                click("chBoxFinance", "The Check Box should be clicked");
                selectValueFromDropdown("drpDwnFinance", "text", financeCompany, "The Finance Company name should be clicked");
            }
            if (existsNoReport("verifydrpMotorcycleFlat", true, "The Motorcycle Flat is verified")) {
                selectValueFromDropdown("drpMotorcycleFlat", "text", "2250", "The Flat value is selected");
            }
            if (existsNoReport("verifychkBoxImmobiliser", true, "The Immobilizer for Motorcycle")) {
                click("chkBoxImmobiliser", "Click Immobiliser CheckBox");
                selectValueFromDropdown("drpDwnImmobiliserMake", "text", immobiliserMake, "Select Immobiliser Make Dropdown");
            }

            //Registered Owner Details
            if (existsNoReport("verifydrpDwnRegisteredOwner",true,"The Register Owner for motorcycle is verified")) {
                selectValueFromDropdown("drpDwnRegisteredOwner", "text", registeredOwner, "Select Registered Owner");
            }
            //Driver Details
            if (existsNoReport("verifydrpDwnRegularDriver",true,"The Regular driver for motorcycle is verified")) {
                selectValueFromDropdown("drpDwnRegularDriver", "text", regularDriver, "Select Regular Driver");
            }
            if (existsNoReport("verifydrpDwnDriverLicenseType",true,"The Regular License for Motorcycle")) {
                selectValueFromDropdown("drpDwnDriverLicenseType", "text", "Drivers License Code A", "Select Regular Driver License Type Dropdown");
            }
            if (existsNoReport("verifydrpDwnDrivingCertificate",true,"The Driving Certificate for MotorCycle")) {
                selectValueFromDropdown("drpDwnDrivingCertificate", "text", drivingCertificate, "Select Defensive Driving Certificate Dropdown");
            }
            if (existsNoReport("verifychkBoxIsVehicleRegInSouthAfrica",true,"The Motorcycle Vehicle Register in South AFrica")) {
                click("chkBoxIsVehicleRegInSouthAfrica", "Click Is Vehicle Registered In South Africa ? CheckBox");
            }
        }catch  (Exception e) {
            logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
        }
    }
    public void caravan (){
        try{
            //Caravan/Trailer General Details
            if (existsNoReport("verifyDrpDwnItemType",true,"Verify the Item Selected")) {
                selectValueFromDropdown("drpDwnItemType", "text", itemType, "Select Item Type Dropdown");
            }

            if (existsNoReport("verifydrpDwnVehicleUsedFor",true,"Verify the Caravan used for")) {
                selectValueFromDropdown("drpDwnVehicleUsedFor", "text", CaravanUsedfor, "Select Caravan Be Used For ? Dropdown");
            }
            if (existsNoReport("verifyChkBoxIsCarvanParkUnderNet",true,"Verify the caravan parked")) {
                click("chkBoxIsCarvanParkUnderNet", "Click Is Carvan Parked Under Hail");
            }
            setText("txtBoxMakeModelCaravan", CaravanMake, "Enter Make/Model");
            setText("txtBoxCaravanInsuredValue", CaravanInsuranceAmount, "Enter Caravan Insured Value");
            if (existsNoReport("",true,"Verify the Year of caravan manufacture")) {
                selectValueFromDropdown("drpDwnYearOfManufactureCaravan", "text", yearOfManufacture, "Select Caravan Year Of Manufacture Dropdown");
            }
            if (existsNoReport("verifydrpCaravanFlat",true,"Verify the caravan value selected")) {
                selectValueFromDropdown("drpCaravanFlat", "text", "1000", "The Caravan Value was selected");
            }
        }catch  (Exception e) {
            logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
        }
    }

    public void propertyLog(String cover) {
        Endorse_POM.Endorse_Factory();
        try {
            //Property Address
            if (existsNoReport("labelPropertyAddress", true, "Property Address Exists")) {
                //click("chkBoxRiskAddressSame", "Click Risk Address Same CheckBox");
                //Property General Details
//                if (cover.equalsIgnoreCase("Building")) {
//                    click("chkBoxBuilding", "Click Building CheckBox");
//                } else if (cover.equalsIgnoreCase("Contents")){
//                    click("chkBoxContents", "Click Contents CheckBox");
//                }
                //click("chkBoxBuilding", "Click Building CheckBox");
                if (existsNoReport("verifyDrpDwnBuildingUsedFor", true, "The Property used For")) {
                    selectValueFromDropdown("drpDwnBuildingUsedFor", "text", buildingUsedFor, "Select Building Be Used For");
                }
                if (existsNoReport("verifyDrpDwnTypeOfBuilding", true, "The Property Type for")) {
                    selectValueFromDropdown("drpDwnTypeOfBuilding", "text", typeOfBuilding, "Select Type Of Building");
                }
                if (existsNoReport("verifyDrpDwnTypeOfArea", true, "The Property Type of Area ")) {
                    selectValueFromDropdown("drpDwnTypeOfArea", "text", typeOfArea, "Select Type Of Area");
                }
                //click("chkBoxIsBuildingOccupied", "Click Is Building Occupied CheckBox");
                setText("txtBoxOccupiedSinceDate", getCurrentDate(), "Enter Occupied Since Date");
                if (existsNoReport("verifyChkBoxIsPropOccupiedDuringDay", true, "The Prop Occupied during Day for Property")) {
                    click("chkBoxIsPropOccupiedDuringDay", "Click is Prop Occupied DuringDay Label");
                }
                // setText("txtBoxUnoccupiedDays", unOccupiedDays, "Enter Number of Consecutive Unoccupied Days");
                if (existsNoReport("verifyChkBoxDoes_the_property_border_aXn_residential_property", true, "The Residental Property ")) {
                    click("chkBoxDoes_the_property_border_aXn_residential_property", "Click is Prop border checkbox Label");
                    selectValueFromDropdown("drpDwnSpecifyNonResidential", "text", xn_residental_property, "Selectedpecify xn residental property");
                }
                if (existsNoReport("verifyDrpDwnWallConstruction", true, "the wall construction for Property")) {
                    selectValueFromDropdown("drpDwnWallConstruction", "text", wallConstruction, "Select Wall Construction");
                }
                if (existsNoReport("verifyDrpDwnRoofConstruction", true, "The roof Construction for Property")) {
                    selectValueFromDropdown("drpDwnRoofConstruction", "text", roofConstruction, "Select Roof Construction");
                }
                if (existsNoReport("verifyChkBoxIsThereThatched", true, "The Thatched Lapa within 3 meters is selected")) {
                    click("chkBoxIsThereThatched", "Clicked Is there a thatched lapa within 3 meters of main dwelling");
                    selectValueFromDropdown("drpDwnThatchedHutFloor", "text", thatchedfloor_area, "Selected Thatched Lapa hut floor area");
                    if (SizeOfLapaExceed.equalsIgnoreCase("Y")) {
                        //click("chkBoxDoesSizeOfLapa", "Clicked Is there a thatched lapa within 3 meters of main dwelling");
                        if (SabsaApproved.equalsIgnoreCase("Y")) {
                            click("chkDoesYouHaveASabsaApprovedLightingConductor", "Clicked Is there a thatched lapa within 3 meters of main dwelling");
                        }
                    }
                }
                if (existsNoReport("verifyChkWaive_Lightning_Conductor", true, "The Lighting conductore was verified")) {
                    click("chkWaive_Lightning_Conductor", "Clicked Waive lighting Conductor");
                }
                if (existsNoReport("verifyChkIs_the_building_completed", true, "Verify teh building is completed or not")) {
                    click("chkIs_the_building_completed", "Clicked Is the building completed");
                }
                if (existsNoReport("verifyChkHave_you_had_any_burglaries_at_the_property", true, "Verify the Burglaries at the Property")) {
                    click("chkHave_you_had_any_burglaries_at_the_property", "Clicked have you had any burglaries at the property");
                }

                if (existsNoReport("verifyChkIs_the_property_in_a_high_security_complex", true, "Verify the Property is High Security Complex")) {
                    click("chkIs_the_property_in_a_high_security_complex", "Clicked Is the property in a high security complex");
                    if (existsNoReport("verifyChkAreThereHighWalls", true, "Verify the High walls is selected")) {
                        click("chkAreThereHighWalls", "Clicked Are there 1.8m high walls");
                        if (existsNoReport("verifyChkAreThereRazorWireAlongThePerimeterWall", true, "Verify the raor wire along with perimeter wall")) {
                            click("chkAreThereRazorWireAlongThePerimeterWall", "Clicked Are there Razor wire along the perimeter wall");
                            if (existsNoReport("verifyChkIsThereAnElectronicGate", true, "Verify the electronic gates is checked")) {
                                click("chkIsThereAnElectronicGate", "Clicked Is there an electronic gate?");
                                if (existsNoReport("verifyChkIsThere24hrsSecurityOrAccessControlOnGates", true, "Verify the the 24hr access control on gates")) {
                                    click("chkIsThere24hrsSecurityOrAccessControlOnGates", "Clicked Is there 24hr security or access control on gates?");
                                    if (existsNoReport("verifyChkIsThereElectricFencing", true, "Verify the electric fencing")) {
                                        click("chkIsThereElectricFencing", "Clicked Is there electric fencing? ");
                                        if (existsNoReport("verifyChkIsThereA24HrsSecurityGuardPatrol", true, "Verify the security gaurd patrol is checked")) {
                                            click("chkIsThereA24HrsSecurityGuardPatrol", "Clicked Is there 24 hrs Security Guard patrol");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                setText("txtBoxNumberOfOutBuildings", numberOfOutBuildings, "Enter How Many Out Buildings are there");
                if (existsNoReport("verifyChkPropertySurveyRequired", true, "Verify the property survey required")) {
                    click("chkPropertySurveyRequired", "Clicked Property Survey Required");
                    setText("txtBoxDateRiskSurveyRequested", getCurrentDate(), "Enter Date Risk Survey Requested");
                    setText("txtBoxDateRiskSurveyReceived", getCurrentDate(), "Enter Date Risk Survey Received");
                }
                if (existsNoReport("verifyChkAreThereAnyGasAppliancesOrEquipment", true, "Verify there any gas Appliances or Equipment")) {
                    click("chkAreThereAnyGasAppliancesOrEquipment", "Click Are There Any Gas Appliances Or Equipment");
                }
//                if (GasPipeConnections.equalsIgnoreCase("Y")) {
//
//                    click("chkAreThereAnyGasPipeConnections", "Click Are There Any Gas Pipe Connections");
//                }
                if (existsNoReport("verifyChkIsThereAnyBusinessConductedOnTheProperty", true, "Verify the Business conducted")) {
                    click("chkIsThereAnyBusinessConductedOnTheProperty", "Click is There Any Business Conducted On The Property");
                    setText("chkTypeOfBusinessDescription", BusinessFullDescription, "Enter Number of Consecutive Unoccupied Days");
                }
                if (existsNoReport("verifyChkBoxBuilding",true,"Verify the building is checked")) {
                    //Building Details
                    setText("txtBoxNoOfGeysers", geysers, "Enter Number of Geysers");
                    setText("txtBoxNoOfSolarGeysers", solarGeysers, "Enter Number of Solar Geysers");

                    if (existsNoReport("verifyChkAreYouOffTheEskom/CityPowerGrid",true,"Verify The City Power Grid")) {

                        click("chkAreYouOffTheEskom/CityPowerGrid", "Click Are you off the Eskom/City Power Grid");
                    }
                    if (existsNoReport("verifyChkDoYouHaveAGenerator",true,"Verify Do you have the generator")) {

                        click("chkDoYouHaveAGenerator", "Click Do you have a generator");
                        if (existsNoReport("verifyChkIsGeneratorConnectedToPowerBackup",true,"Verify The generated connected to power backup")) {

                            click("chkIsGeneratorConnectedToPowerBackup", "Click Is Generator Connected to power backup");

                        }
                        setText("txtBoxDateCertificateRequested", getCurrentDate(), "Enter Date certificate Requested");
                        setText("txtBoxDateCertificateReceived", getCurrentDate(), "Enter Date certificate Received");
                    }
                    if (existsNoReport("verifyDrpDwnBondApplicable",true,"The Bond Applicable for Building")) {
                        selectValueFromDropdown("drpDwnBondApplicable", "text", bondApplicable, "Select Bond Applicable");
                    }
                    Thread.sleep(2000);
                    setText("txtBoxSumInsuredMainBuilding", sumInsuredMainBuilding, "Enter Sum Insured of Main Building");
                    setText("txtBoxSumInsuredOutBuilding", sumInsuredOutBuilding, "Enter Sum Insured Out Buildings");
                    if (existsNoReport("verifyChkBoxBuilding",true,"Verify the checkbox for building")) {
                        selectValueFromDropdown("drpDwnFlatBuilding", "text", flat, "Select Flat Building");
                    }else{
                        selectValueFromDropdown("drpDwnFlatContent", "text", flat, "Select Flat Contents");
                    }
                    //setText("txtBoxCompulsoryExcess", CompulsoryExcess, "Enter Compulsory excess");
                    if (existsNoReport("verifyChBoxHaveYouHadUnInterruptedBuildingInsuranceFor",true,"Verify generated connected")) {
                        click("txtBoxHaveYouHadUnInterruptedBuildingInsuranceFor", "Click Is Generator Connected to power backup");
                    }
                    setText("txtBoxNoOfClaimPast12Months", NoOfClaim12Months, "Enter Number of claims or losses in the past 12 months");
                    setText("txtBoxNoOfClaimPast13To24Months", Is13To24Months, "Enter Number of claims or losses in the past 13 to 24 months");
                    setText("txtBoxNoOfClaimPast25To36Months", NoOfClaimPast25To36Months, "Enter Number of claims or losses in the past 25 to 36 months");

                    setText("txtBoxNotesBuilding", NotesBuilding, "Enter Notes Building");
                    if (existsNoReport("verifyDrpDwnRegisteredOwnerBuilding",true,"Verify the Register Owner")) {
                        selectValueFromDropdown("drpDwnRegisteredOwnerBuilding", "text", registeredOwner, "Select Registered Owner");
                    }
                } else if (existsNoReport("verifyChkBoxContents",true,"The content is present")) {
                    //House Content Details
                    if (existsNoReport("verifyDrpDwnAlarmInstalled", true, "The Alarm installed or not")) {
                        selectValueFromDropdown("drpDwnAlarmInstalled", "text", alarmInstalled, "Select Alarm Installed");
                    }
                    if (existsNoReport("verifyChkBoxWaiveAlarm", true, "Verify the waive alarm")) {
                        click("chkBoxWaiveAlarm", "Click Waive Alarm");
                    }
                    if (existsNoReport("verifyChkBoxAlarmProfessionallyInstalled", true, "Verify the alarm installed professionally")) {
                        click("chkBoxAlarmProfessionallyInstalled", "Click Alarm Professionally Installed CheckBox");
                    }
                    if (existsNoReport("verifyChkBoxAlarmInfraRedDetectors", true, "Verify the Infrared Detectors")) {
                        click("chkBoxAlarmInfraRedDetectors", "Click Alarm InfraRed Detectors CheckBox");
                    }
                    if (existsNoReport("verifyChkBoxAlarmWorkingOrder", true, "Verify the alarm working in order")) {
                        click("chkBoxAlarmWorkingOrder", "Click Alarm Working Order CheckBox");
                    }
                    if (existsNoReport("verifyDrpDwnBurglarBarsMainDwelling", true, "verify the burglar main dwelling")) {
                        selectValueFromDropdown("drpDwnBurglarBarsMainDwelling", "text", burglarBarsMainDwelling, "Select Burglar Bars Main Dwelling");
                    }
                    if (existsNoReport("verifyChkBoxWaiveBurglarBars", true, "Verify the waive burglar")) {
                        click("chkBoxWaiveBurglarBars", "Click Waive Burglar Bars");
                    }
                    Thread.sleep(1000);
                    selectValueFromDropdown("drpDwnExternalDoorMainDwelling", "text", externalDoorMainDwelling, "Select Burglar Bars Outbuilding1");
                    if (existsNoReport("verifyDrpDwnBurglarBarsOutbuilding", true, "The value should be present")) {
                        selectValueFromDropdown("drpDwnBurglarBarsOutbuilding", "text", burglarBarsOutbuilding, "Select Burglar Bars Outbuilding2");
                    }
                    if (existsNoReport("verifyDrpDwnExternalDoorOutbuilding", true, "The value should be present")) {
                        selectValueFromDropdown("drpDwnExternalDoorOutbuilding", "text", externalDoorOutbuilding, "Select External Door Outbuilding");
                    }

                    if (existsNoReport("verifyChkBoxWaiveSecurityGates", true, "Verify the waive security gates")) {
                        click("chkBoxWaiveSecurityGates", "Click Waive Security Gates");
                    }
                    if (existsNoReport("verifyChkBoxInventoryRequired", true, "Verify the Inventory required")) {
                        click("chkBoxInventoryRequired", "Click Inventory Required");
                        setText("txtBoxInventoryRequestedDate", getCurrentDate(), "Enter Inventory Requested Date");
                        setText("txtBoxInventoryReceivedDate", getCurrentDate(), "Enter Inventory Received Date");

                    }
                    Thread.sleep(2000);
                    if (existsNoReport("verifyChkBoxBusinessContents", true, "Verify the business contents is checked")) {
                        jsClick("chkBoxBusinessContents", "Click Business Contents");
                        Thread.sleep(2000);
                        setText("txtBoxBusinessContentsFlatExcess", BusinessContentsFlatExcess, "Enter BusinessContent Sum Insured");

                    }
                    if (existsNoReport("verifyChBoxAdditionalTheft", true, "Verify the thefy is clicked")) {
                        click("chBoxAdditionalTheft", "The Theft is clicked additionally");
                    }
                    setText("txtBoxCompulsoryExcessContents", CompulsoryExcess, "Enter Compulsory Excess Sum Insured");

                    setText("txtBoxMainDwellingSumInsured", sumInsuredMainBuilding, "Enter Main Building Sum Insured");
                    setText("txtBoxOutbuildingSumInsured", sumInsuredOutBuilding, "Enter Outbuilding Sum Insured");
                    if (existsNoReport("verifyDrpDwnFlatContents", true, "Verify the Contents value")) {
                        selectValueFromDropdown("drpDwnFlatContent", "text", flat, "Select Flat Contents");
                    }
                    if (existsNoReport("verifyChBoxContentHaveYouHadUnInterruptedBuildingInsuranceFor", true, "Verify the contents had unInterrupted Building insurance")) {
                        click("txtBoxContentHaveYouHadUnInterruptedBuildingInsuranceFor", "Click Content Have You Had UnInterrupted Building Insurance For");
                    }
                    setText("txtClaims12months", NoOfClaim12Months, "Enter Number of claims or losses in the past 12 months");
                    setText("txtClaims13months", Is13To24Months, "Enter Number of claims or losses in the past 13 to 24 months");
                    setText("txtClaims25months", NoOfClaimPast25To36Months, "Enter Number of claims or losses in the past 25 to 36 months");
                    setText("txtBoxContentNotesBuilding", NotesBuilding, "Enter Notes Building");
                }if (existsNoReport("verifyDrpDwnRegisteredOwnerContents",true,"Verify the register owner")){
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
                            Thread.sleep(5000);
                            if (exists("linkChangePassword", true, "Login Page")) {
                                logger.info("User LogOut Successful");
                                wdriver.quit();
                            }
                        }
                    }

                }



                if (existsNoReport("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("Property " + InsureAR + " Details Captured Successfully");
                }
//                    }
//                }
//                }
            }
        } catch (Exception e) {
            logger.info("Exception in ABSA IDirect MutliCovers Functionality is : " + e);
        }

    }


    public void boats() {

        Endorse_POM.Endorse_Factory();

        try {
            if (existsNoReport("labelBoatDetails", true, "Boat Details")) {
                //Risk Address
                if (existsNoReport("",true,"the Risk Addredis selected")) {
                    click("chkBoxRiskAddressSame", "Click Is Risk Address Same As Physical Address? CheckBox");
                }
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
                if (existsNoReport("verifyDrpDwnBoatType",true,"The Boat Type is selected")) {
                    selectValueFromDropdown("drpDwnBoatType", "text", boatType, "Select Item Type");
                }
                if (existsNoReport("verifyDrpDwnBoatStoredWhenNotInUse",true,"The Boat Store is selected")) {
                    selectValueFromDropdown("drpDwnBoatStoredWhenNotInUse", "text", boatStoredWhenNotInUse, "Select Boat Stored When Not In Use");
                }
                if (existsNoReport("verifyDrpDwnBoatUsedFor",true,"The Usage for Boat is selected")) {
                    selectValueFromDropdown("drpDwnBoatUsedFor", "text", boatUsedFor, "Select Boat Used For");
                }
                if (existsNoReport("verifyDrpDwnBoatYearOfManufacture",true,"The Boat Year is selected")) {
                    selectValueFromDropdown("drpDwnBoatYearOfManufacture", "text", boatYear, "Select Year Of Manufacture");
                }
                setText("txtBoxBoatMakeModel", boatMake, "Enter Make Model");
                setText("txtBoxBoatDescription", description, "Enter Description");
                if (existsNoReport("",true,"")) {
                    selectValueFromDropdown("drpDwnBoatHullCode", "text", hullCode, "Select Hull Code");
                }
                if (existsNoReport("verifyChkBoxIsTheWatercraftFinanced",true,"The watercraft financed selected")) {
                    click("chkBoxIsTheWatercraftFinanced", "Click Is The Watercraft Financed");
                    selectValueFromDropdown("drpDwnFinanceCompany", "text", financeCompany, "Select Finance Company");
                    setText("txtBoxFinanceAgreementNumber", financeAgreementNumber, "Enter Finance Agreement Number");
                }
                if (existsNoReport("verifyDrpBoatFlat",true,"")) {
                    selectValueFromDropdown("drpBoatFlat", "text", "1000", "The Boat Flat value was selected");
                }
                if (existsNoReport("verifyDrpDwnBoatSpeed",true,"")) {
                    selectValueFromDropdown("drpDwnBoatSpeed", "text", boatSpeed, "Select Boat Speed");
                }
                setText("txtBoxOutboardSumInsured", inboardSumInsured, "Enter OutBoard Sum Insured");
                if (exists("txtBoxHullSumInsured", true, "The watercraft value is selected")) {
                    setText("txtBoxHullSumInsured", insuranceAmount, "Enter Hull Sum Insured");
                }
                if (exists("txtBoxHullSumInsured", true, "The watercraft value is selected")) {
                    setText("txtBoxInboardSumInsured", inboardSumInsured, "Enter InBoard Sum Insured");
                }
                if (exists("txtBoxHullSumInsured", true, "The watercraft value is selected")) {
                    setText("txtBoxOutboardSumInsured", inboardSumInsured, "Enter OutBoard Sum Insured");
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

    public void electronicEquipment() {
        Endorse_POM.Endorse_Factory();
        try {

            if (exists("labelElectronic", true, "The Label is present")) {
                if (existsNoReport("verifyDrpDwnAddress", true, "The Address is clicked")) {

                    selectValueFromDropdown("drpDwnAddress", "index", "1", "Select Address");
                    if (itemForBusinessPurpose.equalsIgnoreCase("Yes")) {
                        click("chkBoxItemForBusinessPurpose", "Click Item For Business Purpose");
                    }
                }
            }
            if (existsNoReport("verifyDrpDwnType",true,"The Type for EE is selected")) {
                selectValueFromDropdown("drpDwnType", "text", computerType, "The Electronic Type was selected");
            }
            if (existsNoReport("verifyDrpDwnFlat",true,"The Flat value for EE is selected")) {
                selectValueFromDropdown("drpDwnFlat", "text", "500", "The value is selected");
            }
            setText("txtBoxMake", EEmake, "The Make is selected");
            setText("txtBoxModel", "2019", "The Model is Selected");
            setText("electronicsuminusred","25000","The Electronic Sum Insured Value is added");
            setText("txtBoxElectronicEquipmentSumInsured", EEInsuranceAmount, "The Sum Insured value is clicked");
            setText("txtBoxSerialNumber", "T5639200", "The Serial Number should be selected");
            //setText("txtBoxIMEINumber", "U6778973839089849", "The IMEI Number should be selected");
            click("btnFinish", "Click Finish Button");
        } catch (Exception e) {
            logger.info("Excepetion must be thrown on this");
        }
    }

    public void allRisk() {

        Endorse_POM.Endorse_Factory();

        try {
            if (existsNoReport("verifyDrpDwnAddressList", true, "All Risk Details")) {
                selectValueFromDropdown("drpDwnAddressList", "index", "1", "Select Address");
            }
                //  selectValueFromDropdown("drpDwnAddressList", "text", address, "Select Address");
            if (existsNoReport("verifyDrpDwnRiskToInsure",true,"The Risk Drop down for AllRisk")) {
                selectValueFromDropdown("drpDwnRiskToInsure", "text", InsureAR, "Select Risk To Insure");

                if (InsureAR.equalsIgnoreCase("Specified All Risk Cover")) {
                    selectValueFromDropdown("drpDwnSpecifiedAllRiskCover", "text", specifiedAllRiskCover, "Select Specified All Risk Cover");
                }
            }
                setText("txtBoxDescription", description, "Enter Description");
                setText("txtBoxSumInsured", ARInsureAmount, "Enter Sum Insured");
                click("btnFinish", "Click Finish Button");
                if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("All Risk - " + InsureAR + " Details Captured Successfully");
                }

        } catch (Exception e) {
            logger.info("Exception in All Risk is : " + e);
        }
    }



}
