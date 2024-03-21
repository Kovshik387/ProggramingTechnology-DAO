module com.example.proggramingtechnologydao {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires lombok;
    requires java.naming;


    opens com.example.proggramingtechnologydao to javafx.fxml;
    exports com.example.proggramingtechnologydao;
}