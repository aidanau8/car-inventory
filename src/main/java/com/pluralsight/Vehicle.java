
package com.pluralsight;

public class Vehicle {

    private long id;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    // Constructor
    public Vehicle(long id, String makeModel, String color,
                   int odometerReading, double price) {
        this.id = id;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public String getColor() {
        return color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", makeModel='" + makeModel + '\'' +
                ", color='" + color + '\'' +
                ", odometerReading=" + odometerReading +
                ", price=" + price +
                '}';
    }
}
