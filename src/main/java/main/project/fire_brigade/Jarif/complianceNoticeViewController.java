package main.project.fire_brigade.Jarif;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

import java.awt.*;
import java.awt.event.ActionEvent;

public class complianceNoticeViewController
{
    @javafx.fxml.FXML
    private TextArea issuedNoticeTextArea;
    @javafx.fxml.FXML
    private ComboBox buildingNameCheckBox;
    @javafx.fxml.FXML
    private Label statusValidationMessageLabel;
    @javafx.fxml.FXML
    private ComboBox noticeTypeCheckBox;
    @javafx.fxml.FXML
    private DatePicker noticeDateDatePicker;
    @javafx.fxml.FXML
    private TextArea noticeDetailsTextArea;
    @javafx.fxml.FXML
    private TextField noticeRefTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void issueNoticeButtonOnAction(ActionEvent actionEvent) {
    }
}