package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AddNewRoomFormController {
    public AnchorPane AddNewRoomFormContext;

    public void BackToManageSystemForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ManageSystemForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) AddNewRoomFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
