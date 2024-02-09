package testCases;

import org.slf4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.Launcher;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.slf4j.LoggerFactory.getLogger;

public class Driver extends Thread{

    private static final Logger logger = getLogger(Driver.class);

    public static String userDir, file_TestData;
    public static Map<String, String> dictionary = new HashMap<>();
    Launcher objLauncher = new Launcher();
    

    public static void main (String[] args) {
        Driver ob=new Driver();
        ob.mainDriver("Chrome");
        //ob.mainDriver("Headless");
    }

    @Test
    @Parameters("Browser")
    public void mainDriver(String testngBrowser) {
        try{
            userDir = System.getProperty("user.dir");
            Scanner scan = new Scanner(System.in);
            System.out.println("What do you want to run?");
            String s=scan.nextLine();

            switch (s){
                case "Single":
                    //FOR SINGLE COVER POLICY
                    System.out.println("In Progress");
                    file_TestData= "SAPIENS_Idirect.xlsx";
                    objLauncher.InvokeLauncher(testngBrowser);
                    break;
                case"Multiverse":
                    System.out.println("In Progress");
                    //FOR MULTIVERSE POLICY && FOR ENDORSEMENT
                    file_TestData="SAPIENS_Idirect - Copy.xlsx";
                    objLauncher.InvokeLauncher(testngBrowser);
                    break;
                case"Claims":
                    System.out.println("In Progress");
                    //FOR CLAIMS && RENEWALS && CANCELLATION
                    file_TestData="SAPIENS_MasterDataHOC.xlsx";
                    objLauncher.InvokeLauncher(testngBrowser);
                    break;
            }
        }
        catch (Exception e){
            logger.info("Exception in Driver.mainDriver" + e.toString());
        }
    }


}
