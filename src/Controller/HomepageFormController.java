package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HomepageFormController {
    public AnchorPane HomePageFormContext;

    public void BackToLoginForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) HomePageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenCheckInForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/CheckInForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) HomePageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenCheckOutForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/CheckOutForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) HomePageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenRoomsForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) HomePageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenCancelBookingForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/CancelBookingForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) HomePageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));

    }
}
