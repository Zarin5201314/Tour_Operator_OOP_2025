module com.midpracticeproblem.group_55_section_6_tour_operator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.midpracticeproblem.group_55_section_6_tour_operator to javafx.fxml;
    feature/tour-guide
    opens com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide to javafx.fxml, javafx.base;
    opens com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager to javafx.fxml, javafx.base;

    opens com.midpracticeproblem.group_55_section_6_tour_operator.Tourist to javafx.fxml, javafx.base;
    opens com.midpracticeproblem.group_55_section_6_tour_operator.Accountant to javafx.fxml, javafx.base;
     main
    opens com.midpracticeproblem.group_55_section_6_tour_operator.HotelPartner to javafx.fxml,javafx.base;
    opens com.midpracticeproblem.group_55_section_6_tour_operator.CustomerSupport to javafx.fxml,javafx.base;
    exports com.midpracticeproblem.group_55_section_6_tour_operator;
}