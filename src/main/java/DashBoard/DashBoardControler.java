package DashBoard;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class DashBoardControler {

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

    }


    @FXML
    void historyOnActionBtn(ActionEvent event) {

    }

    @FXML
    void homeOnActionBtn(ActionEvent event) {

    }

    @FXML
    void issueseOnActionBtn(ActionEvent event) {

    }

    @FXML
    void logoutOnActionBtn(ActionEvent event) {

    }

    @FXML
    void memberOnActionBtn(ActionEvent event) {

    }

    @FXML
    void returnOnActionBtn(ActionEvent event) {

    }

}

