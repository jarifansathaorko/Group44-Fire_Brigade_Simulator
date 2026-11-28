package main.project.fire_brigade.Jarif.model_class.maintenance_officer;

public class VehicleAvailability {
    private String vehicleId, availabilityState, statusChangeReason;


    public VehicleAvailability(String vehicleId, String availabilityState, String statusChangeReason) {
        this.vehicleId = vehicleId;
        this.availabilityState = availabilityState;
        this.statusChangeReason = statusChangeReason;
    }


    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getAvailabilityState() {
        return availabilityState;
    }

    public void setAvailabilityState(String availabilityState) {
        this.availabilityState = availabilityState;
    }

    public String getStatusChangeReason() {
        return statusChangeReason;
    }

    public void setStatusChangeReason(String statusChangeReason) {
        this.statusChangeReason = statusChangeReason;
    }


    @Override
    public String toString() {
        return "VehicleAvailability{" +
                "vehicleId='" + vehicleId + '\'' +
                ", availabilityState='" + availabilityState + '\'' +
                ", statusChangeReason='" + statusChangeReason + '\'' +
                '}';
    }

    public boolean verifyVehicleId(String id) {
        return vehicleId.equals(id);
    }

    public void updateState(String state) {
        availabilityState = state;
    }



}
