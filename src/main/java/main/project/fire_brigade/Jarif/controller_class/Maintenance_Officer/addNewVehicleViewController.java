package main.project.fire_brigade.Jarif.controller_class.Maintenance_Officer;

import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.event.ActionEvent;

public class addNewVehicleViewController
{
    @javafx.fxml.FXML
    private TextField registrationNumberTextField;
    @javafx.fxml.FXML
    private TextField vehicleIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> vehicleTypeComboBox;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> vehicleCategoryComboBox;
    @javafx.fxml.FXML
    private TextField vehicleModelTextField;
    @javafx.fxml.FXML
    private TextField yearOfManufactureTextField1;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addVehicleButtonOnAction(ActionEvent actionEvent) {
    }
}