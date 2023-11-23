module com.example.taskmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;

    opens com.example.taskmanager to javafx.graphics;
    opens com.example.taskmanager.controllers to javafx.fxml;
    opens com.example.taskmanager.model to org.hibernate.orm.core;
}