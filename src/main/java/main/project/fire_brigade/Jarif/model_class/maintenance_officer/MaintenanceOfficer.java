package main.project.fire_brigade.Jarif.model_class.maintenance_officer;

public class MaintenanceOfficer {
    private String officerId;
    private String workshopSection;

    public MaintenanceOfficer(String officerId, String workshopSection) {
        this.officerId = officerId;
        this.workshopSection = workshopSection;
    }

    public String getOfficerId() {
        return officerId;
    }

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public String getWorkshopSection() {
        return workshopSection;
    }

    public void setWorkshopSection(String workshopSection) {
        this.workshopSection = workshopSection;
    }


    @Override
    public String toString() {
        return "MaintenanceOfficer{" +
                "officerId='" + officerId + '\'' +
                ", workshopSection='" + workshopSection + '\'' +
                '}';
    }




}
