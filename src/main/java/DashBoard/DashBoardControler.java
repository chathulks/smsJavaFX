package DashBoard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardControler implements Initializable {

    @FXML
    private Button bookBtn;

    @FXML
    private Label closeText;

    @FXML
    private Button historyBtn;

    @FXML
    private Button homeBtn;

    @FXML
    private Button issueseBtn;

    @FXML
    private Button logoutBtn;

    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private Button memberBtn;

    @FXML
    private Button returnBtn;

    @FXML
    void closeTextBtn(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    void bookOnActionBtn(ActionEvent event) {
        Parent parent = null;
        try {
            parent = FXMLLoader.load(getClass().getResource("/view/Book.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainAnchorPane.getChildren().removeAll();
        mainAnchorPane.getChildren().setAll(parent);
    }


    @FXML
    void historyOnActionBtn(ActionEvent event) {
        Parent parent = null;
        try {
            parent = FXMLLoader.load(getClass().getResource("/view/History.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainAnchorPane.getChildren().removeAll();
        mainAnchorPane.getChildren().setAll(parent);
    }

    @FXML
    void homeOnActionBtn(ActionEvent event) {
        Parent parent = null;
        try {
            parent = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainAnchorPane.getChildren().removeAll();
        mainAnchorPane.getChildren().setAll(parent);
    }

    @FXML
    void issueseOnActionBtn(ActionEvent event) {
        Parent parent = null;
        try {
            parent = FXMLLoader.load(getClass().getResource("/view/Issuese.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainAnchorPane.getChildren().removeAll();
        mainAnchorPane.getChildren().setAll(parent);
    }

    @FXML
    void logoutOnActionBtn(ActionEvent event) {
        Stage currentStage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        // Close Dashboard
        currentStage.close();
        Stage stage = new Stage();
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/LoginPage.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    @FXML
    void memberOnActionBtn(ActionEvent event) {
        Parent parent = null;
        try {
            parent = FXMLLoader.load(getClass().getResource("/view/Member.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainAnchorPane.getChildren().removeAll();
        mainAnchorPane.getChildren().setAll(parent);
    }

    @FXML
    void returnOnActionBtn(ActionEvent event) {
        Parent parent = null;
        try {
            parent = FXMLLoader.load(getClass().getResource("/view/Return.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainAnchorPane.getChildren().removeAll();
        mainAnchorPane.getChildren().setAll(parent);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Parent parent = null;
        try {
            parent = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        mainAnchorPane.getChildren().removeAll();
        mainAnchorPane.getChildren().setAll(parent);
    }
}

