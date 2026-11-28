package main.project.fire_brigade.Jarif.controller_class.Fire_Safety_Inspector;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class inspectionScheduleViewController
{
    @javafx.fxml.FXML
    private TextField buildingNameTextField;
    @javafx.fxml.FXML
    private TableColumn inspectorNameColumnView;
    @javafx.fxml.FXML
    private TextField inspectorNameTextField;
    @javafx.fxml.FXML
    private DatePicker inspectionDateDatePicker;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TableColumn inspectionDateColumnView;
    @javafx.fxml.FXML
    private ComboBox TypeComboBox;
    @javafx.fxml.FXML
    private TableColumn buildingNameColumnView;
    @javafx.fxml.FXML
    private TableColumn scheduleIdColumnView;
    @javafx.fxml.FXML
    private TableView scheduleFireSafetyInspectionTableView;
    @javafx.fxml.FXML
    private TableColumn TypeColumnView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void scheduleButtonOnAction(ActionEvent actionEvent) {
    }
}