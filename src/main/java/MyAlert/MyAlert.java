package MyAlert;

import javafx.scene.control.Alert;

public class MyAlert {
    public static void alertMy(String msgTitle , String msg){
        Alert alert = new Alert(Alert.AlertType.WARNING);

        alert.setTitle(msgTitle);
        alert.setHeaderText(null);

        alert.getDialogPane().setPrefWidth(250);
        alert.getDialogPane().setPrefHeight(50);
        alert.setContentText(msg);
        alert.showAndWait();
    }
}
