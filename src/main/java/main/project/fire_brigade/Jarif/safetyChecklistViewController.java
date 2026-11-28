package main.project.fire_brigade.Jarif;

import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;

import java.awt.*;
import java.awt.event.ActionEvent;

public class safetyChecklistViewController
{
    @javafx.fxml.FXML
    private CheckBox smokeDetectorCheckBox;
    @javafx.fxml.FXML
    private TextField buildingNameTextField;
    @javafx.fxml.FXML
    private DatePicker inspectionDateDatePicker;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private Label checklistScoreLabel;
    @javafx.fxml.FXML
    private CheckBox sprinklerCheckBox;
    @javafx.fxml.FXML
    private TextArea additionalNotesLabel;
    @javafx.fxml.FXML
    private CheckBox fireExtinguisherCheckBox;
    @javafx.fxml.FXML
    private CheckBox fireAlarmCheckBox;
    @javafx.fxml.FXML
    private Label safetyStatusLabel;
    @javafx.fxml.FXML
    private CheckBox emergencyExitCheckBox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveChecklistButtonOnAction(ActionEvent actionEvent) {
    }
}