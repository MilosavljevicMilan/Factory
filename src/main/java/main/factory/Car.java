/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factory;

/**
 *
 * @author mixer
 */
public class Car {
    private String model;
    private int buildYear;
    private String colour = "Undefined";
    private int maxSpeed;
    private int ccm;
    private int consumption;
    private int mileage;
    
    public Car() {
        this.model = "undefined";
        this.buildYear = -1;
        this.colour = "undefined";
        this.maxSpeed = -1;
        this.ccm = -1; 
        this.consumption = 0;
        this.mileage = 0;
    }
    
    public Car(String customModel, int customBuildYear, String customColour, int customMaxSpeed, int customCcm) {
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.colour = customColour;
        this.maxSpeed = customMaxSpeed;
        this.ccm = customCcm;
    }

    public Car(String model, int buildYear, int maxSpeed, int ccm, int consumption, int mileage) {
        this.model = model;
        this.buildYear = buildYear;
        this.maxSpeed = maxSpeed;
        this.ccm = ccm;
        this.consumption = consumption;
        this.mileage = mileage;
    }
    
    public String getModel() {
        return this.model;
    }
    public void setModel(String customModel){
        this.model = customModel;
    }
    
    public int getBuildYear(){
        return this.buildYear;
    }
    
    public void setBuildYear(int customBuildYear){
        this.buildYear = customBuildYear;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCcm() {
        return ccm;
    }

    public void setCcm(int ccm) {
        this.ccm = ccm;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }
    
        public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    
    public void printAttributes() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Godina proizvodnje: " + this.getBuildYear());
        System.out.println("Ccm : " + this.getCcm());
        System.out.println("Boja: " + this.getColour());
        System.out.println("Potrosnja: " + this.getConsumption());
        System.out.println("Kilometraza: "+this.getMileage());
        System.out.println("Maximalna brzina: "+this.getMaxSpeed());
        System.out.println();
    }
    
    public void goToTravel(int distance) {
        this.setMileage(this.getMileage() + distance);
    }


}
