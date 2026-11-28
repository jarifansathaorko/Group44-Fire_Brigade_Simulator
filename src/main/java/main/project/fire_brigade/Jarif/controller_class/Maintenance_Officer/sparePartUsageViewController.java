package main.project.fire_brigade.Jarif.controller_class.Maintenance_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import main.project.fire_brigade.Jarif.model_class.maintenance_officer.SparePartUsage;

import java.time.LocalDate;

public class sparePartUsageViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> areaComboBox;
    @javafx.fxml.FXML
    private TableColumn<SparePartUsage, String> partNameColumnView;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TableColumn<SparePartUsage, Double> unitPriceColumnView;
    @javafx.fxml.FXML
    private TextField unitPriceTextField;
    @javafx.fxml.FXML
    private TableView<SparePartUsage> sparePartUsageTableView;
    @javafx.fxml.FXML
    private TableColumn<SparePartUsage, LocalDate> usageDateColumnView;
    @javafx.fxml.FXML
    private TableColumn<SparePartUsage, Double> totalCostColumnView;
    @javafx.fxml.FXML
    private TextField partNameTextField;
    @javafx.fxml.FXML
    private TableColumn<SparePartUsage, Integer> quantityColumnView;
    @javafx.fxml.FXML
    private Label totalCostLabel;
    @javafx.fxml.FXML
    private TableColumn<SparePartUsage, String> areaColumnView;
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