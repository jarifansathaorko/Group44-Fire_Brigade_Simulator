package main.project.fire_brigade.Jarif.controller_class.Maintenance_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import main.project.fire_brigade.Jarif.model_class.maintenance_officer.MaintenanceRecord;

import java.time.LocalDate;

public class logMaintenanceWorkViewController
{
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TextArea maintenanceDescriptionTextArea;
    @javafx.fxml.FXML
    private TextField vehicleIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> maintenanceTypeComboBox;
    @javafx.fxml.FXML
    private TextField maintenanceCostTextField;
    @javafx.fxml.FXML
    private DatePicker maintenanceDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceRecord, LocalDate> maintenanceDateColumnView;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceRecord, String> maintenanceDescriptionColumnView;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceRecord, String> maintenanceTypeColumnView;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceRecord, String> vehicleIdColumnView;
    @javafx.fxml.FXML
    private TableView<MaintenanceRecord> logMaintenanceWorkTableView;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceRecord, Double> maintenanceCostColumnView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logMaintenanceButtonOnAction(ActionEvent actionEvent) {
    }
}