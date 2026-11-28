package main.project.fire_brigade.Jarif.controller_class.Maintenance_Officer;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import main.project.fire_brigade.Jarif.model_class.maintenance_officer.DiagnosticResult;

import java.time.LocalDate;

public class diagnosticResultViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> resultStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn<DiagnosticResult, LocalDate>  diagnosticDateColumnView;
    @javafx.fxml.FXML
    private TableColumn<DiagnosticResult, String> diagnosticNoteColumnView;
    @javafx.fxml.FXML
    private TableColumn<DiagnosticResult, String> resultStatusColumnView;
    @javafx.fxml.FXML
    private TableView<DiagnosticResult> diagnosticResultTableView;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private TextArea diagnosticNoteTextArea;
    @javafx.fxml.FXML
    private DatePicker diagnosticDateDatePicker;
    @javafx.fxml.FXML
    private TextField vehicleIdTextField;
    @javafx.fxml.FXML
    private TableColumn<DiagnosticResult, String> vehicleIdColumnView;
    @javafx.fxml.FXML
    private TableColumn<DiagnosticResult, String> diagnosticTestNameColumnView;
    @javafx.fxml.FXML
    private TextField diagnosticTestTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveResultButtonOnAction(ActionEvent actionEvent) {
    }
}