package main.project.fire_brigade.Jarif;

import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class safetyViolationViewController
{
    @javafx.fxml.FXML
    private RadioButton mediumRadioButton;
    @javafx.fxml.FXML
    private RadioButton lowRadioButton;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TextField violationLocationTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TableView logSafetyViolationTableView;
    @javafx.fxml.FXML
    private TableColumn violationLocationColumnView;
    @javafx.fxml.FXML
    private RadioButton highRadioButton;
    @javafx.fxml.FXML
    private TableColumn idColumnView;
    @javafx.fxml.FXML
    private ComboBox violationTypeCheckBox;
    @javafx.fxml.FXML
    private TableColumn severityLevelColumnView;
    @javafx.fxml.FXML
    private ComboBox buildingNameCheckBox;
    @javafx.fxml.FXML
    private TableColumn buildingNameColumnView;
    @javafx.fxml.FXML
    private TableColumn violationTypeColumnView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logViolationButtonOnAction(ActionEvent actionEvent) {
    }
}