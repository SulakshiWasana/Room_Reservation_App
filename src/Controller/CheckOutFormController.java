package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class CheckOutFormController {
    public AnchorPane CheckOutFormContext;

    public void BackToHomePage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) CheckOutFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenSettlePaymentForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/SettlePaymentForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) CheckOutFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
