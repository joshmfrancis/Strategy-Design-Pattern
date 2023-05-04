/**
 * File: ShipmentDriver.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/12/2023
 * Java class description: This class is the driver class for this program.
 * It handles creating instances of the companies and calling the methods to
 * determine the behavior of the shipping company to ship their product. This
 * program is an example of the Strategy Pattern of design for Object Oriented
 * Programming.
 */

// Package
package StrategyPattern;

/**
 * Main Class Creates instances of the companies, and designates them to a
 * shipping company
 * @author josh
 */
public class ShipmentDriver
{

    /**
     * Main Method
     * @param args
     */
    public static void main(String[] args)
    {

        // Behaviors For Dynamically Changing The Stratedgy
        WriteCarrierFile behavior1 = new WriteUPSFile();
        WriteCarrierFile behavior2 = new WriteFEDEXFile();
        WriteCarrierFile behavior3 = new WriteDHLFile();
        WriteCarrierFile behavior4 = new WriteBIGBOBSFile();

        ///////////////////
        // First Company //
        ///////////////////

        //Creates a Shipment object from the CompanyOne class
        Shipment one = new CompanyOne();
        // Default Shipping Method
        one.display();
        one.write();

        // 2 Behavior Changes
        System.out.println("\nTwo changes to shipping provider:\n");

        // Behavior #2 Shipping Method
        one.setCarrierFile(behavior2);
        one.write();

        // Behavior #3 Shipping Method
        one.setCarrierFile(behavior3);
        one.write();

        ////////////////////
        // Second Company //
        ////////////////////

        System.out.println("\n");
        //Creates a Shipment object from the CompanyTwo class
        Shipment two = new CompanyTwo();
        // Default Shipping Method
        two.display();
        two.write();

        // 2 Behavior Changes
        System.out.println("\nTwo changes to shipping provider:\n");

        // Behavior #1 Shipping Method
        two.setCarrierFile(behavior1);
        two.write();

        // Behavior #4 Shipping Method
        two.setCarrierFile(behavior4);
        two.write();

        ///////////////////
        // Third Company //
        ///////////////////

        System.out.println("\n");
        //Creates a Shipment object from the CompanyThree class
        Shipment three = new CompanyThree();
        // Default Shipping Method
        three.display();
        three.write();

        // 2 Behavior Changes
        System.out.println("\nTwo changes to shipping provider:\n");

        // Behavior #2 Shipping Method
        three.setCarrierFile(behavior2);
        three.write();

        // Behavior #4 Shipping Method
        three.setCarrierFile(behavior4);
        three.write();

        ////////////////////
        // Fourth Company //
        ////////////////////

        System.out.println("\n");
        //Creates a Shipment object from the CompanyFour class
        Shipment four = new CompanyFour();
        // Default Shipping Method
        four.display();
        four.write();

        // 2 Behavior Changes
        System.out.println("\nTwo changes to shipping provider:\n");

        // Behavior #1 Shipping Method
        four.setCarrierFile(behavior1);
        four.write();

        // Behavior #3 Shipping Method
        four.setCarrierFile(behavior3);
        four.write();

    }

}
