package main.project.fire_brigade.Jarif;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class preventiveMaintenanceViewController
{
    @javafx.fxml.FXML
    private TableColumn maintenanceDateColumnView;
    @javafx.fxml.FXML
    private TableColumn maintenanceNotesColumnView;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TableView preventiveMaintenanceTableView;
    @javafx.fxml.FXML
    private TableColumn maintenanceTypeColumnView;
    @javafx.fxml.FXML
    private TextField vehicleIdTextField;
    @javafx.fxml.FXML
    private TableColumn vehicleIdColumnView;
    @javafx.fxml.FXML
    private TextArea maintenanceNotesTextArea;
    @javafx.fxml.FXML
    private ComboBox scheduleTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker maintenanceDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void scheduleButtonOnAction(ActionEvent actionEvent) {
    }
}