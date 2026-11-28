package main.project.fire_brigade.Jarif.controller_class.Maintenance_Officer;

import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class expenseSummaryViewController
{
    @javafx.fxml.FXML
    private TextField yearComboBox;
    @javafx.fxml.FXML
    private PieChart expensePieChart;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> monthCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateSummaryAndChartButtonOnAction(ActionEvent actionEvent) {
    }
}