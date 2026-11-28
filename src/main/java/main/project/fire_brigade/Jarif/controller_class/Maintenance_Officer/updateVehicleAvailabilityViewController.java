package main.project.fire_brigade.Jarif.controller_class.Maintenance_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import main.project.fire_brigade.Jarif.model_class.maintenance_officer.VehicleAvailability;

public class updateVehicleAvailabilityViewController
{
    @javafx.fxml.FXML
    private TableColumn<VehicleAvailability, String> availabilityStateColumnView;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TextArea reasonForStatusChangeDescriptionTextArea;
    @javafx.fxml.FXML
    private TextField vehicleIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> availabilityStateComboBox;
    @javafx.fxml.FXML
    private TableColumn<VehicleAvailability, String> vehicleIdColumnView;
    @javafx.fxml.FXML
    private TableView<VehicleAvailability> updateVehicleAvailabilityTableView;
    @javafx.fxml.FXML
    private TableColumn<VehicleAvailability, String> ChangeReasonColumnView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateStatusButtonOnAction(ActionEvent actionEvent) {
    }
}