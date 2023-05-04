/**
 * File: CompanyOne.java
 * Author: Joshua Francis
 * Concentration: Software Development
 * Date: 02/12/2023
 * Java class description: This helper class is designated as Company #1. It
 * extends the Shipment.java class, to obtain it's methods and sets the default
 * shipping provider for itself, UPS. Because it extends the Shipment.java
 * class, it can change the shipping provider at will.
 */

// Package
package StrategyPattern;

/**
 * Helper class to hold the first company This class extends the class Shipment
 * as it needs it's methods for setting, writing, and displaying This reduces
 * the amount of code that is needed to be written
 * @author josh
 */
public class CompanyOne extends Shipment
{
    /**
     * Constructor for the first company This automatically chooses UPS as the
     * carrier for the company
     */
    public CompanyOne()
    {
        this.setCarrierFile(new WriteUPSFile());
    }

    /**
     * Displays the first company as the one being shipped for
     */
    @Override
    public void display()
    {
        System.out.println("This is Company #1");
    }

}
