package main.project.fire_brigade.Jarif.model_class.maintenance_officer;

import java.time.LocalDate;

public class MaintenanceRecord {
    private String vehicleId, maintenanceType, description;
    private double maintenanceCost;
    private LocalDate maintenanceDate;


    public MaintenanceRecord(String vehicleId, String maintenanceType, String description, double maintenanceCost, LocalDate maintenanceDate) {
        this.vehicleId = vehicleId;
        this.maintenanceType = maintenanceType;
        this.description = description;
        this.maintenanceCost = maintenanceCost;
        this.maintenanceDate = maintenanceDate;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public LocalDate getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDate maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }


    @Override
    public String toString() {
        return "MaintenanceRecord{" +
                "vehicleId='" + vehicleId + '\'' +
                ", maintenanceType='" + maintenanceType + '\'' +
                ", description='" + description + '\'' +
                ", maintenanceCost=" + maintenanceCost +
                ", maintenanceDate=" + maintenanceDate +
                '}';
    }





}
