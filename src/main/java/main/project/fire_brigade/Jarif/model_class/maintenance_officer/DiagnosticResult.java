package main.project.fire_brigade.Jarif.model_class.maintenance_officer;

import java.time.LocalDate;

public class DiagnosticResult {
    private String vehicleId, testName, resultStatus, diagnosticNotes;
    private LocalDate diagnosticDate;


    public DiagnosticResult(String vehicleId, String testName, String resultStatus, String diagnosticNotes, LocalDate diagnosticDate) {
        this.vehicleId = vehicleId;
        this.testName = testName;
        this.resultStatus = resultStatus;
        this.diagnosticNotes = diagnosticNotes;
        this.diagnosticDate = diagnosticDate;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getDiagnosticNotes() {
        return diagnosticNotes;
    }

    public void setDiagnosticNotes(String diagnosticNotes) {
        this.diagnosticNotes = diagnosticNotes;
    }

    public LocalDate getDiagnosticDate() {
        return diagnosticDate;
    }

    public void setDiagnosticDate(LocalDate diagnosticDate) {
        this.diagnosticDate = diagnosticDate;
    }


    @Override
    public String toString() {
        return "DiagnosticResult{" +
                "vehicleId='" + vehicleId + '\'' +
                ", testName='" + testName + '\'' +
                ", resultStatus='" + resultStatus + '\'' +
                ", diagnosticNotes='" + diagnosticNotes + '\'' +
                ", diagnosticDate=" + diagnosticDate +
                '}';
    }




}
