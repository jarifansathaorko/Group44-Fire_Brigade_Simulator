package main.project.fire_brigade.Jarif.controller_class.Maintenance_Officer;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class sparePartUsageViewController
{
    @javafx.fxml.FXML
    private ComboBox areaComboBox;
    @javafx.fxml.FXML
    private TableColumn partNameColumnView;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TableColumn unitPriceColumnView;
    @javafx.fxml.FXML
    private TextField unitPriceTextField;
    @javafx.fxml.FXML
    private TableView sparePartUsageTableView;
    @javafx.fxml.FXML
    private TableColumn usageDateColumnView;
    @javafx.fxml.FXML
    private TableColumn totalCostColumnView;
    @javafx.fxml.FXML
    private TextField partNameTextField;
    @javafx.fxml.FXML
    private TableColumn quantityColumnView;
    @javafx.fxml.FXML
    private Label totalCostLabel;
    @javafx.fxml.FXML
    private TableColumn areaColumnView;
    @javafx.fxml.FXML
    private DatePicker usageDateDatePicker;
    @javafx.fxml.FXML
    private TextField quantityTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveUsageButtonOnAction(ActionEvent actionEvent) {
    }
}