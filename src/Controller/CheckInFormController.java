package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class CheckInFormController {
    public AnchorPane CheckInFormContext;
    public ComboBox<String> cmbRoomTypes;

    public void BackToHomePageForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) CheckInFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenPrintRecepitForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PrintRecepitForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) CheckInFormContext.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void initialize() {
        cmbRoomTypes.getItems().addAll(
                "Single Room",
                "Double Room",
                "Thriple Room",
                "Quad Room"

        );
    }
}
