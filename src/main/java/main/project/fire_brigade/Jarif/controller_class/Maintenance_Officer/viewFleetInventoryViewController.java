package main.project.fire_brigade.Jarif.controller_class.Maintenance_Officer;

import main.project.fire_brigade.Jarif.model_class.maintenance_officer.Vehicle;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

public class viewFleetInventoryViewController
{
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> vehicleModelColumnView;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> vehicleIdColumnView;
    @javafx.fxml.FXML
    private TableView<Vehicle> viewFleetInventoryTableView;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> registrationNumberColumnView;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> vehicleCategoryColumnView;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> yearOfManufactureColumnView;
    @javafx.fxml.FXML
    private Text totalFleetCountTextField;
    @javafx.fxml.FXML
    private TableColumn<Vehicle, String> vehicleTypeColumnView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loadFleetButtonOnAction(ActionEvent actionEvent) {
    }
}