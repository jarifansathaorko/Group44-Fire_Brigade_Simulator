package main.project.fire_brigade.Jarif;

import javafx.scene.control.ComboBox;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class registerBuildingProfileViewController
{
    @javafx.fxml.FXML
    private TableColumn addressColumnView;
    @javafx.fxml.FXML
    private TextField buildingNameTextField;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private ComboBox buildingTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn numberOfFloorsColumnView;
    @javafx.fxml.FXML
    private TableColumn buildingNameColumnView;
    @javafx.fxml.FXML
    private TextField numberOfFloorsTextField;
    @javafx.fxml.FXML
    private TableView registeredBuildingTableView;
    @javafx.fxml.FXML
    private TableColumn occupancyCapacityColumnView;
    @javafx.fxml.FXML
    private TextField occupancyCapacityTextField;
    @javafx.fxml.FXML
    private TableColumn buildingTypeColumnView;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void registerBuildingButtonOnAction(ActionEvent actionEvent) {
    }
}