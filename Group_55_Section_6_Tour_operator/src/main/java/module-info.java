module com.midpracticeproblem.group_55_section_6_tour_operator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.midpracticeproblem.group_55_section_6_tour_operator to javafx.fxml;
    opens com.midpracticeproblem.group_55_section_6_tour_operator.Tourist to javafx.fxml, javafx.base;
    opens com.midpracticeproblem.group_55_section_6_tour_operator.Accountant to javafx.fxml, javafx.base;
    exports com.midpracticeproblem.group_55_section_6_tour_operator;
}