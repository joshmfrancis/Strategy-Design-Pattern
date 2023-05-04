/**
 * File: Shipment.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/12/2023
 * Java class description: Abstract class that is a helper class to the driver
 * class ShipmentDriver.java. This class is extended by all of the companies
 * that are being shipped for. It holds methods that are shared between the
 * companies that are needed as a baseline for displaying and modifying the
 * shipping company.
 */

// Package
package StrategyPattern;

/**
 * Abstract Class extended by all of the companies being shipped for
 * Allows for storing, setting, and writing for the carrier company
 * @author josh
 */
public abstract class Shipment
{
    // Stores the current stratedgy for shipping
    WriteCarrierFile writeCarrierFile;

    /**
     * Sets the strategy for shipping
     * @param writeCarrierFile
     */
    public void setCarrierFile(WriteCarrierFile writeCarrierFile)
    {
        this.writeCarrierFile = writeCarrierFile;
    }

    /**
     * Calls the WriteToFile() method from the interface based on what company
     * is being shipped for
     */
    public void write()
    {
        writeCarrierFile.WriteToFile();
    }

    /**
     * Displays the current company being shipped for all shipments
     */
    public abstract void display();

}
