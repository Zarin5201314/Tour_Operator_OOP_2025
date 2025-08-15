module com.oopproject.new_tour_operator_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.oopproject.new_tour_operator_project to javafx.fxml;
    opens com.oopproject.new_tour_operator_project.Tourist to javafx.fxml, javafx.base;
    opens com.oopproject.new_tour_operator_project.Accountant to javafx.fxml, javafx.base;

    exports com.oopproject.new_tour_operator_project;
}