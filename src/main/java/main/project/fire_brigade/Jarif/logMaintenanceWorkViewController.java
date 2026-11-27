package main.project.fire_brigade.Jarif;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class logMaintenanceWorkViewController
{
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TextArea maintenanceDescriptionTextArea;
    @javafx.fxml.FXML
    private TextField vehicleIdTextField;
    @javafx.fxml.FXML
    private ComboBox maintenanceTypeComboBox;
    @javafx.fxml.FXML
    private TextField maintenanceCostTextField;
    @javafx.fxml.FXML
    private DatePicker maintenanceDateDatePicker;
    @javafx.fxml.FXML
    private TableColumn maintenanceDateColumnView;
    @javafx.fxml.FXML
    private TableColumn maintenanceDescriptionColumnView;
    @javafx.fxml.FXML
    private TableColumn maintenanceTypeColumnView;
    @javafx.fxml.FXML
    private TableColumn vehicleIdColumnView;
    @javafx.fxml.FXML
    private TableView logMaintenanceWorkTableView;
    @javafx.fxml.FXML
    private TableColumn maintenanceCostColumnView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logMaintenanceButtonOnAction(ActionEvent actionEvent) {
    }
}