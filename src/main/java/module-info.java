module main.project.fire_brigade {
    requires javafx.controls;
    requires javafx.fxml;

    opens main.project.fire_brigade to javafx.fxml;
    opens main.project.fire_brigade.Junayeed to javafx.fxml;

    exports main.project.fire_brigade;
    exports main.project.fire_brigade.Junayeed;
}