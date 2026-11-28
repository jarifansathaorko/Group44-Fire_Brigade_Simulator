package main.project.fire_brigade.Jarif.model_class.maintenance_officer;

import java.time.LocalDate;

public class SparePartUsage {

    private String partName, vehicleOrEquipmentArea;
    private int quantity;
    private double unitPrice, totalCost;
    private LocalDate usageDate;


    public SparePartUsage(String partName, String vehicleOrEquipmentArea, int quantity, double unitPrice, double totalCost, LocalDate usageDate) {
        this.partName = partName;
        this.vehicleOrEquipmentArea = vehicleOrEquipmentArea;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalCost = totalCost;
        this.usageDate = usageDate;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getVehicleOrEquipmentArea() {
        return vehicleOrEquipmentArea;
    }

    public void setVehicleOrEquipmentArea(String vehicleOrEquipmentArea) {
        this.vehicleOrEquipmentArea = vehicleOrEquipmentArea;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public LocalDate getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(LocalDate usageDate) {
        this.usageDate = usageDate;
    }


    @Override
    public String toString() {
        return "SparePartUsage{" +
                "partName='" + partName + '\'' +
                ", vehicleOrEquipmentArea='" + vehicleOrEquipmentArea + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalCost=" + totalCost +
                ", usageDate=" + usageDate +
                '}';
    }

    public double calculateTotalCost() {
        totalCost = quantity * unitPrice;
        return totalCost;
    }



}
