package main.project.fire_brigade.Jarif.controller_class.Fire_Safety_Inspector;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class inspectionResultViewController
{
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private RadioButton failRadioButton;
    @javafx.fxml.FXML
    private TableColumn inspectionRefColumnView;
    @javafx.fxml.FXML
    private TableView recordInspectionResultTableView;
    @javafx.fxml.FXML
    private RadioButton passRadioButton;
    @javafx.fxml.FXML
    private TableColumn inspectionNotesColumnView;
    @javafx.fxml.FXML
    private ComboBox buildingNameCheckBox;
    @javafx.fxml.FXML
    private TableColumn DateColumnView;
    @javafx.fxml.FXML
    private RadioButton conditionalRadioButton;
    @javafx.fxml.FXML
    private TextField inspectionRefTextField;
    @javafx.fxml.FXML
    private TableColumn buildingNameColumnView;
    @javafx.fxml.FXML
    private TableColumn resultOutcomeColumnView;
    @javafx.fxml.FXML
    private DatePicker DateDatePicker;
    @javafx.fxml.FXML
    private TextArea inspectionNotesTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveResultButtonOnAction(ActionEvent actionEvent) {
    }
}