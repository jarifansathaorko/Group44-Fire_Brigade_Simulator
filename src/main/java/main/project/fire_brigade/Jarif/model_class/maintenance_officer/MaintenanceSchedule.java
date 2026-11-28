package main.project.fire_brigade.Jarif.model_class.maintenance_officer;

import java.time.LocalDate;

public class MaintenanceSchedule {
    private String scheduleId, vehicleId, scheduleType, maintenanceNotes;
    private LocalDate maintenanceDate;


    public MaintenanceSchedule(String scheduleId, String vehicleId, String scheduleType, String maintenanceNotes, LocalDate maintenanceDate) {
        this.scheduleId = scheduleId;
        this.vehicleId = vehicleId;
        this.scheduleType = scheduleType;
        this.maintenanceNotes = maintenanceNotes;
        this.maintenanceDate = maintenanceDate;
    }


    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public String getMaintenanceNotes() {
        return maintenanceNotes;
    }

    public void setMaintenanceNotes(String maintenanceNotes) {
        this.maintenanceNotes = maintenanceNotes;
    }

    public LocalDate getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDate maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }


    @Override
    public String toString() {
        return "MaintenanceSchedule{" +
                "scheduleId='" + scheduleId + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", scheduleType='" + scheduleType + '\'' +
                ", maintenanceNotes='" + maintenanceNotes + '\'' +
                ", maintenanceDate=" + maintenanceDate +
                '}';
    }


    public String generateScheduleId() {
        scheduleId = "SCH-" + vehicleId;
        return scheduleId;
    }



}
