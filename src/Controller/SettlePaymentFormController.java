package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class SettlePaymentFormController {
    public AnchorPane SettlePaymentFormContext;

    public void BackToHomePage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) SettlePaymentFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
