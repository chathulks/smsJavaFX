package MyAlert;

import javafx.scene.control.Alert;

public class MyAlert {
    public static void alertMy(String msgTitle , String msg ,String msg_type){
        Alert alert = new Alert(Alert.AlertType.WARNING);

        alert.setTitle(msgTitle);
        alert.setAlertType(Alert.AlertType.valueOf(msg_type));
        alert.setHeaderText(null);

        alert.getDialogPane().setPrefWidth(250);
        alert.getDialogPane().setPrefHeight(50);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
