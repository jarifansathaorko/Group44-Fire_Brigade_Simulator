package main.project.fire_brigade.Jarif.controller_class.Maintenance_Officer;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import javax.swing.table.TableColumn;
import javax.swing.text.TableView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class diagnosticResultViewController
{
    @javafx.fxml.FXML
    private ComboBox resultStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn diagnosticDateColumnView;
    @javafx.fxml.FXML
    private TableColumn diagnosticNoteColumnView;
    @javafx.fxml.FXML
    private TableColumn resultStatusColumnView;
    @javafx.fxml.FXML
    private TableView diagnosticResultTableView;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TextArea diagnosticNoteTextArea;
    @javafx.fxml.FXML
    private DatePicker diagnosticDateDatePicker;
    @javafx.fxml.FXML
    private TextField vehicleIdTextField;
    @javafx.fxml.FXML
    private TableColumn vehicleIdColumnView;
    @javafx.fxml.FXML
    private TableColumn diagnosticTestNameColumnView;
    @javafx.fxml.FXML
    private TextField diagnosticTestTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveResultButtonOnAction(ActionEvent actionEvent) {
    }
}