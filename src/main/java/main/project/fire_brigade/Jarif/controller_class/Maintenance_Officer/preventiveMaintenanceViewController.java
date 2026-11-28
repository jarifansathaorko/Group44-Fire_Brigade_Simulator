package main.project.fire_brigade.Jarif.controller_class.Maintenance_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import main.project.fire_brigade.Jarif.model_class.maintenance_officer.MaintenanceSchedule;

import java.time.LocalDate;

public class preventiveMaintenanceViewController
{
    @javafx.fxml.FXML
    private TableColumn<MaintenanceSchedule, LocalDate> maintenanceDateColumnView;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceSchedule, String> maintenanceNotesColumnView;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TableView<MaintenanceSchedule> preventiveMaintenanceTableView;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceSchedule, String> maintenanceTypeColumnView;
    @javafx.fxml.FXML
    private TextField vehicleIdTextField;
    @javafx.fxml.FXML
    private TableColumn<MaintenanceSchedule, String> vehicleIdColumnView;
    @javafx.fxml.FXML
    private TextArea maintenanceNotesTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> scheduleTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker maintenanceDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void scheduleButtonOnAction(ActionEvent actionEvent) {
    }
}