package main.project.fire_brigade.Jarif;

import javafx.scene.control.ComboBox;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class updateVehicleAvailabilityViewController
{
    @javafx.fxml.FXML
    private TableColumn availabilityStateColumnView;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TextArea reasonForStatusChangeDescriptionTextArea;
    @javafx.fxml.FXML
    private TextField vehicleIdTextField;
    @javafx.fxml.FXML
    private ComboBox availabilityStateComboBox;
    @javafx.fxml.FXML
    private TableColumn vehicleIdColumnView;
    @javafx.fxml.FXML
    private TableView updateVehicleAvailabilityTableView;
    @javafx.fxml.FXML
    private TableColumn ChangeReasonColumnView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateStatusButtonOnAction(ActionEvent actionEvent) {
    }
}