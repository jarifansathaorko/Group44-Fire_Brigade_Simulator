package main.project.fire_brigade.Junayeed;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class GoalController {
    @FXML
    private Label headingLabel;
    @FXML
    private Label descriptionLabel;
    @FXML
    private Label fieldOneLabel;
    @FXML
    private Label fieldTwoLabel;
    @FXML
    private Label fieldThreeLabel;
    @FXML
    private TextField fieldOneTF;
    @FXML
    private TextField fieldTwoTF;
    @FXML
    private TextField fieldThreeTF;
    @FXML
    private ComboBox<String> optionCB;
    @FXML
    private Button actionButton;
    @FXML
    private TextArea resultTA;

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void actionButtonOnAction(ActionEvent actionEvent) {
    }
    private String role;
    private int goalNumber;
    public void setGoal(String role, int goalNumber) {
    }
}
