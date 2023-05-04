/**
 * File: WriteFEDEXFile.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/12/2023
 * Java class description: This helper class implements the helper interface
 * WriteCarrierFile.java for unison among the other shipping providers. This
 * class is dedicated to the FEDEX shipping method, and overrides the method
 * from the interface to achieve this.
 */

// Package
package StrategyPattern;

/**
 * Helper class that implements the WriteCarrierFile interface Dictates what
 * happens when a company uses FEDEX as it's carrier
 * @author josh
 */
public class WriteFEDEXFile implements WriteCarrierFile
{
    /**
     * Implemented from the WriteCarrierFile interface WriteToFile() Method
     * specifically for FEDEX carrier
     */
    @Override
    public void WriteToFile()
    {
        System.out.println("Writes a file properly formatted for FEDEX");
    }

}
