package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ManageSystemFormController {
    public AnchorPane ManageSystemFormContext;

    public void BackToLoginForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ManageSystemFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenAddNewRoomForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddNewRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ManageSystemFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenAddNewMealForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddNewMealForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ManageSystemFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenManageCurrentRoomsForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ManageCurrentRoomsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ManageSystemFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenManageCurrentMealsForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ManageCurrentMealsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ManageSystemFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenViewIncomeDetailsForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ViewIncomeDetailsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ManageSystemFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
