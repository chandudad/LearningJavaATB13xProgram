package ex_10_Switch;
import java.sql.SQLOutput;
import java.util.*;
public class Lab_75_Switch_Using_Automation {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser from which he wnats to
        // use to I will start the automation in that browser

        // String browser = args[0];
        //System.out.println(bowser);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the browser, which you want to start");
        String browser = s.next();
        browser = browser.toLowerCase();
        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                //Further code to start with Firefox
                //Webdriver driver = new Firefox(); // selenium code
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I have no idea which browser is this!!");
                break;
        }
    }
}
