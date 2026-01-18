module org.example.pdftransformer {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.pdftransformer to javafx.fxml;
    exports org.example.pdftransformer;
    exports org.example.pdftransformer.controller;
    opens org.example.pdftransformer.controller to javafx.fxml;
}