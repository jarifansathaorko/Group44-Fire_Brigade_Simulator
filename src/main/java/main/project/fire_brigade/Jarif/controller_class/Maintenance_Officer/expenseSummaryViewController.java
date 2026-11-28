package main.project.fire_brigade.Jarif.controller_class.Maintenance_Officer;

import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;

import java.awt.*;
import java.awt.event.ActionEvent;

public class expenseSummaryViewController
{
    @javafx.fxml.FXML
    private TextField yearComboBox;
    @javafx.fxml.FXML
    private PieChart expensePieChart;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private ComboBox monthCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateSummaryAndChartButtonOnAction(ActionEvent actionEvent) {
    }
}