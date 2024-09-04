package org.example;

public class Vehicle {

    private int topSpeed;
    private int currSpeed;
    private String color;
    private String model;
    private String manufacturer;
    private String plateNumber;
    private boolean disabled;

    public Vehicle(int topSpeed, String color, String model, String manufacturer, String plateNumber, boolean disabled) {
        this.topSpeed = topSpeed;
        this.color = color;
        this.model = model;
        this.manufacturer = manufacturer;
        this.plateNumber = plateNumber;
        this.disabled = disabled;
    }


    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getCurrSpeed() {
        return currSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }


    public boolean accelerate(){

        if(!disabled && currSpeed >= 0){
            currSpeed += 10;

            if(currSpeed > topSpeed){
                currSpeed = topSpeed;
                disabled = true;
                System.out.println("The car is disabled because it exceeded the top speed!\n");
                return false;
            }
            System.out.println( this.model + " Accelerated!");
            return true;

        }else{
            System.out.println();
            return false;
        }

    }

    public boolean decelerate(){
        if(currSpeed >= 0 && !disabled){
            currSpeed -= 5;
            System.out.println("The car decelerated");
            return true;
        }else{
            return false;
        }

    }

    public void display(){
        System.out.println(this.toString());
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Model: ");
        sb.append(model);
        sb.append("\n");
        sb.append("Manufacturer: ");
        sb.append(manufacturer);
        sb.append("\n");
        sb.append("Color: ");
        sb.append(color);
        sb.append("\n");
        sb.append("Top Speed: ");
        sb.append(topSpeed);
        sb.append("\n");
        sb.append("Current Speed: ");
        sb.append(currSpeed);
        sb.append("\n");
        sb.append("Plate Number: ");
        sb.append(plateNumber);
        sb.append("\n");
        sb.append("Disabled: ");
        sb.append(disabled);
        sb.append("\n");



        return sb.toString();
    }







}