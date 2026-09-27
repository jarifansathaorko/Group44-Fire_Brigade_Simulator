module main.project.fire_brigade {
    requires javafx.controls;
    requires javafx.fxml;


    opens main.project.fire_brigade to javafx.fxml;
    exports main.project.fire_brigade;
}