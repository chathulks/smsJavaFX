package Login;

import MyAlert.MyAlert;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LoginPageControler {

    @FXML
    private Button loginBtn;

    @FXML
    private TextField passwordText;

    @FXML
    private TextField usernameText;

    @FXML
    void LoginOnActionBtn(ActionEvent event) {

        if (usernameText.getText().isEmpty()){
            MyAlert.alertMy("Warning","Please Enter Username","WARNING");
        } else if (passwordText.getText().isEmpty()) {
            MyAlert.alertMy("Warning","Please Enter Password","WARNING");
        }else {
            if (LoginLogic.loginValidation(usernameText.getText(),passwordText.getText())){
                Stage dashboardStage = new Stage();
                try {
                    dashboardStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Dashbpard.fxml"))));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                dashboardStage.initStyle(StageStyle.UNDECORATED);
                dashboardStage.show();
            }else {
                MyAlert.alertMy("Warning","Try to Username: admin Password: admin123","WARNING");
            }
        }

    }

    public void CloseBtnText(MouseEvent mouseEvent) {
        System.exit(0);
    }
}
