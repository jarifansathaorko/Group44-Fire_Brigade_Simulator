package main.project.fire_brigade.Jarif;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class followUpVisitViewController
{
    @javafx.fxml.FXML
    private TableView recordedFollowUpVisitTableView;
    @javafx.fxml.FXML
    private DatePicker followUpDateDatePicker;
    @javafx.fxml.FXML
    private TextArea followUpNotesTextArea;
    @javafx.fxml.FXML
    private TableColumn followUpResultColumnView;
    @javafx.fxml.FXML
    private RadioButton notCorrectedRadioButton;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TableColumn inspectionAreaColumnView;
    @javafx.fxml.FXML
    private RadioButton partiallyCorrectedRadioButton;
    @javafx.fxml.FXML
    private TableColumn followUpNotesColumnView;
    @javafx.fxml.FXML
    private RadioButton correctedRadioButton;
    @javafx.fxml.FXML
    private ComboBox buildingNameCheckBox;
    @javafx.fxml.FXML
    private TableColumn followUpDateColumnView;
    @javafx.fxml.FXML
    private TextField inspectionAreaTextField;
    @javafx.fxml.FXML
    private TableColumn buildingNameColumnView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveFollowUpButtonOnAction(ActionEvent actionEvent) {
    }
}