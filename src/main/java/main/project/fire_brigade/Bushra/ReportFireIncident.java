package main.project.fire_brigade.Bushra;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class ReportFireIncident
{
    @javafx.fxml.FXML
    private TextField incidentlocationtextfield;
    @javafx.fxml.FXML
    private DatePicker incidentdatedatepicker;
    @javafx.fxml.FXML
    private TextArea descriptiontextarea;
    @javafx.fxml.FXML
    private ComboBox incidenttypecombobox;
    @javafx.fxml.FXML
    private Label reporttextfield;
    @javafx.fxml.FXML
    private TextField timetextfield;
    @javafx.fxml.FXML
    private ComboBox selectseveritycombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void clearonaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void descriptiononaction(ActionEvent actionEvent) {
    }
}