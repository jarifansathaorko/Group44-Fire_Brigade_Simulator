package main.project.fire_brigade.Jarif.controller_class.Maintenance_Officer;

import org.w3c.dom.Text;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.event.ActionEvent;

public class viewFleetInventoryViewController
{
    @javafx.fxml.FXML
    private TableColumn vehicleModelColumnView;
    @javafx.fxml.FXML
    private TableColumn vehicleIdColumnView;
    @javafx.fxml.FXML
    private TableView viewFleetInventoryTableView;
    @javafx.fxml.FXML
    private TableColumn registrationNumberColumnView;
    @javafx.fxml.FXML
    private TableColumn vehicleCategoryColumnView;
    @javafx.fxml.FXML
    private TableColumn yearOfManufactureColumnView;
    @javafx.fxml.FXML
    private Text totalFleetCountTextField;
    @javafx.fxml.FXML
    private TableColumn vehicleTypeColumnView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loadFleetButtonOnAction(ActionEvent actionEvent) {
    }
}