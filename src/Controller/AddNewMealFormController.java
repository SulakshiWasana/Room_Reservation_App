package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AddNewMealFormController {
    public AnchorPane AddNewMealFormContext;

    public void BackToManageSystemForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ManageSystemForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) AddNewMealFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
