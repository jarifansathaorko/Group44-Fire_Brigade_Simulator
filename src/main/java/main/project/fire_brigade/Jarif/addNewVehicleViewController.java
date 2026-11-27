package main.project.fire_brigade.Jarif;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.event.ActionEvent;

public class addNewVehicleViewController
{
    @javafx.fxml.FXML
    private DatePicker yearOfManufacturerDatePicker;
    @javafx.fxml.FXML
    private TextField registrationNumberTextField;
    @javafx.fxml.FXML
    private TextField vehicleIdTextField;
    @javafx.fxml.FXML
    private ComboBox VehicleCategoryComboBox;
    @javafx.fxml.FXML
    private TextField VehicleModelTextField;
    @javafx.fxml.FXML
    private ComboBox vehicleTypeComboBox;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addVehicleButtonOnAction(ActionEvent actionEvent) {
    }
}