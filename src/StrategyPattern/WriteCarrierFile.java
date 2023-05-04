/**
 * File: WriteCarrierFile.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/12/2023
 * Java class description: This interface is the helper interface for the
 * driver class ShipmentDriver.java. It's main purpose is to create unison
 * between the shipping companies who provide services to the companies that
 * need their projects shipped. This interface holds the method WriteToFile()
 * that is used by all of the shipping companies.
 */

// Package
package StrategyPattern;

/**
 * Interface that all of the carrier strategies implement
 * @author josh
 */
public interface WriteCarrierFile
{
    // All carrier strategies must implement the WriteToFile() Method
    public void WriteToFile();
}
