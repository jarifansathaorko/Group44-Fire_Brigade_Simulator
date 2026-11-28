package main.project.fire_brigade.Jarif;

import javafx.scene.control.ComboBox;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class inspectionStatisticsViewController
{
    @javafx.fxml.FXML
    private TableColumn violationCountColumnView;
    @javafx.fxml.FXML
    private TextField yearTextField;
    @javafx.fxml.FXML
    private TableColumn passedInspectionsColumnView;
    @javafx.fxml.FXML
    private TableColumn totalInspectionsColumnView;
    @javafx.fxml.FXML
    private Label totalInspectionsLabel;
    @javafx.fxml.FXML
    private TableView generateInspectionStatisticsTableView;
    @javafx.fxml.FXML
    private ComboBox monthCheckBox;
    @javafx.fxml.FXML
    private TableColumn categoryColumnView;
    @javafx.fxml.FXML
    private Label passedInspectionsLabel;
    @javafx.fxml.FXML
    private Label violationCountLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateButtonOnAction(ActionEvent actionEvent) {
    }
}