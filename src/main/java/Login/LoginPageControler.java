package Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginPageControler {

    @FXML
    private Button loginBtn;

    @FXML
    private TextField passwordText;

    @FXML
    private TextField usernameText;

    @FXML
    void LoginOnActionBtn(ActionEvent event) {

    }

    public void CloseBtnText(MouseEvent mouseEvent) {
        System.exit(0);
    }
}
