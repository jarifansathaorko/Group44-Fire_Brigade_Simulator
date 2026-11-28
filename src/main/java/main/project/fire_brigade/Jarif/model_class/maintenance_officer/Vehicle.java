package main.project.fire_brigade.Jarif.model_class.maintenance_officer;
import java.io.Serializable;
public class Vehicle {
    private String vehicleId, type, model, registrationNumber, category;
    private int year;


    public Vehicle(String vehicleId, String type, String model, String registrationNumber, String category, int year) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.category = category;
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", category='" + category + '\'' +
                ", year=" + year +
                '}';
    }
}
