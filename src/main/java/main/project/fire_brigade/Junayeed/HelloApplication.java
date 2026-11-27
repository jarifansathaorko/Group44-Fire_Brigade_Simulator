package main.project.fire_brigade.Junayeed;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    private static Stage mainStage;

    @Override
    public void start(Stage stage) throws Exception {
        mainStage = stage;
        showDashboard("FIRE_STATION_OFFICER");
        stage.setTitle("Fire Brigade Management System");
        stage.show();
    }

    public static void showDashboard(String role) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        DashboardController controller = fxmlLoader.getController();
        controller.setRole(role);
        mainStage.setScene(scene);
    }

    public static void showGoal(String role, int goalNumber) throws Exception {
        String[] stationFiles = {
                "viewAvailableFireTrucks.fxml", "assignFireTruck.fxml", "viewFirefighterAvailability.fxml",
                "recordStationIncident.fxml", "viewCurrentEmergencies.fxml", "markFireTruckUnavailable.fxml",
                "viewStationResources.fxml", "updateStationInformation.fxml"
        };

        String[] rescueFiles = {
                "viewRescueMissions.fxml", "acceptRescueMission.fxml", "updateRescueMissionStatus.fxml",
                "recordRescuedPerson.fxml", "viewRescueEquipment.fxml", "requestRescueEquipment.fxml",
                "reportRescueCompletion.fxml", "viewRescueHistory.fxml"
        };

        String fileName;
        if (role.equals("FIRE_STATION_OFFICER")) {
            fileName = stationFiles[goalNumber - 1];
        } else {
            fileName = rescueFiles[goalNumber - 1];
        }

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fileName));
        Scene scene = new Scene(fxmlLoader.load());
        GoalController controller = fxmlLoader.getController();
        controller.setGoal(role, goalNumber);
        mainStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}